package com.geektech.hw_5_1.view

interface CounterView {
    fun incrementCount(count: Int)

    fun decrementCount(count:Int)

    fun changeTextColor()

    fun showToast()
}