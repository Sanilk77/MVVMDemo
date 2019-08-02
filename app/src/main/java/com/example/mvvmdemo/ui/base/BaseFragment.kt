package com.example.mvvmdemo.ui.base


import androidx.fragment.app.Fragment


open class BaseFragment : Fragment() {


    fun base():BaseActivity{

        return activity as BaseActivity
    }


}
