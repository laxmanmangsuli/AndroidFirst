package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding : Activity2Binding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

       /* binding.btnUpload.setOnClickListener {
//            Toast.makeText(this,"Uploading...",Toast.LENGTH_SHORT).show()
            binding.layouts.setBackgroundColor(R.color.black)

        }
        binding.btnDownload.setOnClickListener {
//            Toast.makeText(this,"Downloading..",Toast.LENGTH_SHORT).show()
            binding.layouts.setBackgroundColor(R.color.light)

        }*/
    }
}