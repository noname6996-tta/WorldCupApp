package com.example.worldcup2022

import android.app.Application
import android.content.Context
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by TruyenIT
 */
@HiltAndroidApp
open class App : Application(){
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(getApplicationContext());
    }
}
