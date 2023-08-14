package com.jhon.hilos_zi

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ej7 : AppCompatActivity() {

    private lateinit var start: Button // Declarar la variable como lateinit


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej7)

        start = findViewById(R.id.startButton)

        start.setOnClickListener {
            startService()
        }

    }

    private fun startService() {
        val intent = Intent(this, TimeService::class.java)
        startService(intent)
    }
}