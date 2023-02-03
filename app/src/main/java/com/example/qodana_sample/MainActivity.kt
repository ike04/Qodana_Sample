package com.example.qodana_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test2(s: String?): Int? = s?.let { it.length }

    fun main() {
        listOf(1, 2, 3).filter { it > 1 }.count()
    }

    fun greeting(user: String): String? = "Hello, $user!"
}
