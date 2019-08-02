package com.example.mvvmdemo

import android.app.Application
import com.example.mvvmdemo.data.Injection

class AppController: Application() {

    override fun onCreate() {
        super.onCreate()

        Injection.createRepo(applicationContext)
    }
}