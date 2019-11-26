package com.amolsoftwares.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.amolsoftwares.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("A. K. Gadage")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.doneBTN.setOnClickListener {
            binding.nameTv.text = binding.nickNameET.text
            binding.nickNameET.visibility = View.GONE
            binding.nameTv.visibility = View.VISIBLE
            binding.doneBTN.visibility = View.GONE

        }

    }

}
