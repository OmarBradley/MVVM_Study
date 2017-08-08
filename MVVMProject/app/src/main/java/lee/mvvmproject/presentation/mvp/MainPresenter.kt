package lee.mvvmproject.presentation.mvp

import lee.mvvmproject.model.Count

class MainPresenter(
    val view: MainContract.View
) : MainContract.Presenter {

    val count: Count by lazy { Count(count = 0) }

    override fun clickPlus() {
        count.plusCount()
        view.setTextCount(count.getCount())
    }

    override fun clickMinus() {
        count.minusCount()
        view.setTextCount(count.getCount())
    }
}