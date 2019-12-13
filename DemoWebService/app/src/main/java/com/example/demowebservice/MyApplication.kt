package com.example.demowebservice

import com.facebook.stetho.Stetho
import android.app.Application


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }
}