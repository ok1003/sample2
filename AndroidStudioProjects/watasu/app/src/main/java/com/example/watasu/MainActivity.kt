package com.example.watasu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText =findViewById(R.id.et)
        val et1:EditText =findViewById(R.id.et2)
        val btnStart: Button = findViewById(R.id.btnStart)

        //１）画面遷移
        btnStart.setOnClickListener {
            //val intent: List<String> = ArrayList()
            val intent = Intent(this, SecondActivity::class.java)

            //２）値を渡す
            intent.putExtra("MY_NAME",et.text.toString())
            intent.putExtra("MY_NAME1",et1.text.toString())

            startActivity(intent)


            // 家事をListにして渡したい


        }
    }
}