package com.drawablecomparison

import com.drawablecomparison.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val compare = CompareDrawables(binding, baseContext)
        binding.button.setOnClickListener {
            compare.start()
        }
    }
}