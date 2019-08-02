package com.example.mvvmdemo.ui.base


import android.app.ProgressDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.ActivityBaseBinding


abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutId(): Int
    private var binder: ViewDataBinding? = null
    private var baseBinder: ActivityBaseBinding? = null
    private var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        baseBinder = DataBindingUtil.setContentView(this, R.layout.activity_base)
        binder = DataBindingUtil.inflate(LayoutInflater.from(this), getLayoutId(), null, false)
        baseBinder?.containerFrame?.addView(binder?.root)

        createProgressDialog()
    }

    fun getBinder(): ViewDataBinding? = binder

    private fun createProgressDialog() {
        if (progressDialog == null) {
            progressDialog = ProgressDialog(this).apply {
                setProgressStyle(ProgressDialog.STYLE_SPINNER)
                isIndeterminate = true
                this.setMessage("Please wait..")
            }
        }
    }

    fun showProgress() {
        if  (progressDialog != null) {
            progressDialog?.dismiss()
        }
        progressDialog?.show()
    }

    fun hideProgress() {
        progressDialog?.dismiss()
    }
}
