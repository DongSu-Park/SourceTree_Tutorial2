package com.example.sourcetree_tutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "테스트 메세지 입니다.", Toast.LENGTH_LONG).show()
        }

        Log.d("tag", "재 테스트 메세지")
    }
}