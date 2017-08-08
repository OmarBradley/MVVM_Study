package lee.mvvmproject.presentation.mvp

interface MainContract {

    interface View {

        fun setTextCount(text: String)
    }

    interface Presenter {

        fun clickPlus()

        fun clickMinus()
    }
}