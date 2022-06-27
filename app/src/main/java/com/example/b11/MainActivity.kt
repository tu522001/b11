package com.example.b11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** hello */
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        //Toast
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()

    }
}