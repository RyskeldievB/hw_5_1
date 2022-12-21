package com.geektech.hw_5_1.presenter

import com.geektech.hw_5_1.model.CounterModel
import com.geektech.hw_5_1.view.CounterView

class CounterPresenter {
    private val model = CounterModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.incrementCount(model.count)
    }

    fun decrement() {
        model.decrement()
        view.decrementCount(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }

    fun checkCounter() {
        if (model.count == 10) {
            view.showToast()
        } else if (model.count == 15) {
            view.changeTextColor()
        }
    }
}