package kr.lul.template.app

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ComponentConfig {
    companion object {
        private const val TAG = "ComponentConfig"
    }

    @Provides
    @Singleton
    fun provideDummy(): Any {
        val dummy = Any()
        Log.d(TAG, "#provideDummy return : $dummy")
        return dummy
    }
}