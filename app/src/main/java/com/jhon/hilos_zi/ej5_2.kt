package com.jhon.hilos_zi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class ej5_2 : AppCompatActivity() {

    private lateinit var messageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej52)

        messageTextView = findViewById(R.id.messageTextView)
        val receiveButton: Button = findViewById(R.id.receiveButton)



        val message = intent.getStringExtra("message")
        if (message != null) {
            messageTextView.text = message
        }

        receiveButton.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                val processedMessage = withContext(Dispatchers.IO) {
                    // Simulando una tarea asincrónica
                    Thread.sleep(2000)
                    "¡Mensaje procesado!"
                }

                messageTextView.text = processedMessage
            }
        }

    }
}