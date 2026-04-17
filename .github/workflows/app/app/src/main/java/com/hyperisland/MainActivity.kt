package com.hyperisland

import android.app.*
import android.content.*
import android.os.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, IslandService::class.java))
        finish()
    }
}
