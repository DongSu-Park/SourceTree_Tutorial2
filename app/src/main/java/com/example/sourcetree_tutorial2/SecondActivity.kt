package com.example.sourcetree_tutorial2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn_toast2.setOnClickListener {
            Toast.makeText(this, "두번째 액티비티 입니다.", Toast.LENGTH_LONG).show()
        }
    }
}