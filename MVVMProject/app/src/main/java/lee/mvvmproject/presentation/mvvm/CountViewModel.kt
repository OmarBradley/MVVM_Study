package lee.mvvmproject.presentation.mvvm

import lee.mvvmproject.model.Count

class CountViewModel {

    val count: Count by lazy { Count(count = 0) }

    fun onClickPlus() {
        count.plusCount()
    }

    fun onClickMinus() {
        count.minusCount()
    }

    fun getCount(): String =
        count.getCount()

    fun setCount(count: Int) {
        this.count.count = count
    }
}