package com.geektech.hw_5_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.geektech.hw_5_1.databinding.ActivityMainBinding
import com.geektech.hw_5_1.presenter.CounterPresenter
import com.geektech.hw_5_1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    var count = 0
    var presenter = CounterPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)

        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnIncrement.setOnClickListener {
                presenter.increment()
                presenter.checkCounter()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }

    }

    override fun incrementCount(count: Int) {
        binding.tvCounter.text = count.toString()
    }

    override fun decrementCount(count: Int) {
        binding.tvCounter.text = count.toString()
    }

    override fun changeTextColor() {
        binding.tvCounter.setTextColor(Color.GREEN)
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }
}