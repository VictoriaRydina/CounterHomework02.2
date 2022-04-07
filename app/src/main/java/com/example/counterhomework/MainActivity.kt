package com.example.counterhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.counterhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var countUp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.count.text = countUp.toString()

        if (savedInstanceState != null){
            countUp = savedInstanceState.getInt("COUNTER_KEY")
            binding.count.text = countUp.toString()
        }
    }

    fun increaseCount(view: View) {
        countUp += 1
        binding.count.text = countUp.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("COUNTER_KEY", countUp)
    }

}