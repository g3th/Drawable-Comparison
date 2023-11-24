package com.drawablecomparison

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.drawablecomparison.databinding.ActivityMainBinding

class CompareDrawables (b: ActivityMainBinding, c: Context) {
    private val binding = b
    private val baseContext = c
    fun start(){
        if (binding.image1.tag == "b") {
            binding.text1.setText(R.string.same)
            binding.image1.tag = "a"
            binding.image1.setImageDrawable(AppCompatResources.getDrawable(baseContext, R.drawable.b))

        } else {
            binding.text1.setText(R.string.different)
            binding.image1.tag = "b"
            binding.image1.setImageDrawable(AppCompatResources.getDrawable(baseContext, R.drawable.test))
        }
    }
}