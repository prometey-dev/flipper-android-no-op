package com.facebook.flipper.plugins.crashreporter

import com.facebook.flipper.core.FlipperPlugin

class CrashReporterPlugin : FlipperPlugin() {
    companion object {
        @JvmStatic
        fun getInstance() = CrashReporterPlugin()
    }

    fun sendExceptionMessage(paramThread: Thread, paramThrowable: Throwable) {}
}