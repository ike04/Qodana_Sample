package com.example.qodana_sample

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val unneccesarry: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun greeting(user: String): String? = "Hello, $user!"

    fun greeting2(text: String): String? = "Hello, $text!"

//    fun test(@Nullable s: String?): Int? = s?.let { it.length }

    fun main() {
        listOf(1, 2, 3).filter { it > 1 }.count()
    }
}
