package com.example.qodana_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val unneccesarry: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(s: String?): Int? = s?.let { it.length }

    fun main() {
        listOf(1, 2, 3).filter { it > 1 }.count()
    }

    fun greeting(user: String): String? = "Hello, $user!"
}