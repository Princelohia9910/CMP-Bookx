package com.`fun`.bookx.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.`fun`.bookx.book.data.database.DatabaseFactory
import com.`fun`.bookx.book.data.database.FavoriteBookDatabase
import com.`fun`.bookx.book.data.network.KtorRemoteBookDataSource
import com.`fun`.bookx.book.data.network.RemoteBookDataSource
import com.`fun`.bookx.book.data.repository.DefaultBookRepository
import com.`fun`.bookx.book.domain.BookRepository
import com.`fun`.bookx.book.presentation.SelectedBookViewModel
import com.`fun`.bookx.book.presentation.book_detail.BookDetailViewModel
import com.`fun`.bookx.book.presentation.book_list.BookListViewModel
import com.`fun`.bookx.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}