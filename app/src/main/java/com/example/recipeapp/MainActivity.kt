package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalAccessException("binding from ActivityMainBinding must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        _binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}