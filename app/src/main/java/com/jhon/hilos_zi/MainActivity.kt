package com.jhon.hilos_zi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eje1: Button = findViewById(R.id.button1)
        val eje2: Button = findViewById(R.id.button2)
        val eje3: Button = findViewById(R.id.button3)
        val eje4: Button = findViewById(R.id.button4)
        val eje5: Button = findViewById(R.id.button5)
        val eje6: Button = findViewById(R.id.button6)
        val eje7: Button = findViewById(R.id.button7)
        val eje8: Button = findViewById(R.id.button8)
        val eje9: Button = findViewById(R.id.button9)
        val eje10: Button = findViewById(R.id.button10)
        eje1.setOnClickListener {
            val intent = Intent(this, ej1::class.java)
            startActivity(intent)
        }
        eje2.setOnClickListener {
            val intent = Intent(this, ej3::class.java)
            startActivity(intent)
        }
        eje3.setOnClickListener {
            val intent = Intent(this, ej5::class.java)
            startActivity(intent)
        }
        eje4.setOnClickListener {
            val intent = Intent(this, ej7::class.java)
            startActivity(intent)
        }
        /*
        ej5.setOnClickListener {
            val intent = Intent(this, ejercicio1::class.java)
            startActivity(intent)
        }
        ej6.setOnClickListener {
            val intent = Intent(this, ejercicio1::class.java)
            startActivity(intent)
        }
        ej7.setOnClickListener {
            val intent = Intent(this, ejercicio1::class.java)
            startActivity(intent)
        }
        ej8.setOnClickListener {
            val intent = Intent(this, ejercicio1::class.java)
            startActivity(intent)
        }*/
        eje9.setOnClickListener {
            val intent = Intent(this, ej17::class.java)
            startActivity(intent)
        }

         /*
        ej10.setOnClickListener {
            val intent = Intent(this, ejercicio1::class.java)
            startActivity(intent)
        }*/

    }
}