package com.jhon.hilos_zi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ej5 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej5)

        val startButton: Button = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val message = "¡Hola desde la Activity 1!"

            val intent = Intent(this@ej5, ej5_2::class.java)
            intent.putExtra("message", message)

            startActivity(intent)
        }
    }


}