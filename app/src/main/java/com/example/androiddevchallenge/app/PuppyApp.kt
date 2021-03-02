package com.example.androiddevchallenge.app

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

internal class PuppyApp : Application() {

    companion object {
        /**
         * Global application context.
         */
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}