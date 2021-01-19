package com.facebook.flipper.core

import com.facebook.flipper.plugins.network.NetworkFlipperPlugin

class FlipperClient {
    fun addPlugin(plugin: Any? = null) {
        // No-op
    }

    fun start() {
        // No-op
    }

    fun <T> getPluginByClass(cls: Class<T>?): NetworkFlipperPlugin? {
        return NetworkFlipperPlugin()
    }
}