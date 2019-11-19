package com.amolsoftwares.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.nickNameET)
        val textView: TextView = findViewById(R.id.name_tv)
        val btn: Button = findViewById(R.id.doneBTN)

        btn.setOnClickListener {
            textView.text = editText.text
            editText.visibility = View.GONE
            textView.visibility = View.VISIBLE
            btn.visibility = View.GONE

        }

    }

}
