package com.example.watasu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName : TextView = findViewById(R.id.tvName)
        val tvName2 : TextView = findViewById(R.id.tvName1)
        val btnBack:Button = findViewById(R.id.btnBack)

        // val kajiList = listof("a","i","u","e","o","k")


        // ３）渡された値を取り出す⇒テキストに表示
        val myName =intent.getStringExtra("MY_NAME")
        val myName2 =intent.getStringExtra("MY_NAME1")
        tvName.text =myName + "さん"
        tvName2.text =myName2 + "さん"

        //４）戻るボタン
        btnBack.setOnClickListener{
            finish()
        }
    }
}