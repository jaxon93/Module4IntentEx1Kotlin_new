package com.example.module4intentex2kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var name = intent.getStringExtra("name")
        var surname = intent.getStringExtra("surname")
        tv_second.text = String.format("%s %s", name, surname)
    }
}