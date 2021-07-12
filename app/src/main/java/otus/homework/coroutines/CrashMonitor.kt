package otus.homework.coroutines

import android.util.Log

object CrashMonitor {

    /**
     * Pretend this is Crashlytics/AppCenter
     */
    fun trackWarning(msg: String?) {
        Log.d("TAG", msg ?: "")
    }
}