package com.example.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up the TextView programmatically
        val textView = TextView(this).apply {
            text = "Hello, World!"
            textSize = 24f
            setPadding(16, 16, 16, 16)
        }

        // Set the TextView as the content view
        setContentView(textView)
    }
}
