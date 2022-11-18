package com.example.worldcup2022.notification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.orhanobut.hawk.Hawk

class FirebaseService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        Log.e("TAG", "onNewToken: " + p0)
        Hawk.init(this).build()
        Hawk.put("FCM", p0)
        super.onNewToken(p0)

    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
    }
}

