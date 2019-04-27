package com.app.dirt2clean.utils

/** Not a real crash reporting library!  */
class FakeCrashLibrary private constructor() {

    init {
        throw AssertionError("No instances.")
    }

    companion object {
        fun log(tag: String, message: String) {

        }

        fun logWarning(t: Throwable) {
            // TODO report non-fatal warning.
        }

        fun logError(t: Throwable) {
            // TODO report non-fatal error.
        }
    }
}