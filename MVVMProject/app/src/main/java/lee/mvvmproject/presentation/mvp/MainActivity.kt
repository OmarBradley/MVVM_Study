package lee.mvvmproject.presentation.mvp


import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import lee.mvvmproject.BaseActivity
import lee.mvvmproject.R
import org.jetbrains.anko.onClick


class MainActivity : BaseActivity(), MainContract.View {

    val presenter: MainContract.Presenter by lazy { MainPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setListener() {
        button_plus.onClick { presenter.clickPlus() }
        button_minus.onClick { presenter.clickMinus() }
    }

    override fun setTextCount(text: String) {
        textView_count.text = text
    }
}
