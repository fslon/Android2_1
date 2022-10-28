package ru.geekbrains.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton()
    }

    fun addButton() {
        val button: Button = findViewById(R.id.testButton)
        button.text = "test 1"
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "таыова", Toast.LENGTH_LONG).show()
        })
    }
}