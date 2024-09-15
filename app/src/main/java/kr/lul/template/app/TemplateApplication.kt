package kr.lul.template.app

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class TemplateApplication : Application() {
    companion object {
        private const val TAG = "TemplateApplication"
    }

    @Inject
    lateinit var dummy: Any

    override fun onCreate() {
        Log.i(TAG, "#onCreate called.")
        super.onCreate()

        Log.d(TAG, "#onCreate : dummy=$dummy")
    }
}