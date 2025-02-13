package com.`fun`.bookx

import androidx.compose.ui.window.ComposeUIViewController
import com.`fun`.bookx.app.App
import com.`fun`.bookx.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }