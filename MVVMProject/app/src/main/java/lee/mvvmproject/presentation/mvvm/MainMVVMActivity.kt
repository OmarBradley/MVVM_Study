package lee.mvvmproject.presentation.mvvm


import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_mvvm.*
import lee.mvvmproject.BaseActivity
import lee.mvvmproject.R
import org.jetbrains.anko.onClick

class MainMVVMActivity : BaseActivity() {

    val viewModel: CountViewModel by lazy { CountViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvvm)
    }

    override fun setListener() {
        super.setListener()

        button_plus.onClick {
            viewModel.onClickPlus() // user Event
            textView_count.text = viewModel.getCount() // update view
        }
        button_minus.onClick {
            viewModel.onClickMinus() // user Event
            textView_count.text = viewModel.getCount() // update view
        }
    }
}