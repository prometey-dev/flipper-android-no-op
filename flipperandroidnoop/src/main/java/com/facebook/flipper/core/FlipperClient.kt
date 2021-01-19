package com.facebook.flipper.core

import com.facebook.flipper.plugins.network.NetworkFlipperPlugin

class FlipperClient {
    fun addPlugin(plugin: Any? = null) {
        // No-op
    }

    fun start() {
        // No-op
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : FlipperPlugin> getPluginByClass(cls: Class<T>?): T? {
        return FlipperPlugin() as T
    }
}