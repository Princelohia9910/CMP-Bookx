package com.`fun`.bookx

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.`fun`.bookx.app.App
import com.`fun`.bookx.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}