package com.nkmr.myphotoview

import android.app.Application
import android.content.SharedPreferences

class MyApplication : Application() {
    lateinit var preferences: SharedPreferences

    override fun onCreate() {
        super.onCreate()
        preferences = getSharedPreferences( packageName + "_preferences", MODE_PRIVATE)
    }
}