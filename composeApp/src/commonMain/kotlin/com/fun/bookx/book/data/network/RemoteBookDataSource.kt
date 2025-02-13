package com.`fun`.bookx.book.data.network

import com.`fun`.bookx.book.data.dto.BookWorkDto
import com.`fun`.bookx.book.data.dto.SearchResponseDto
import com.`fun`.bookx.core.domain.DataError
import com.`fun`.bookx.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}