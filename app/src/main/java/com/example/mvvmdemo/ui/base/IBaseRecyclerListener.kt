package com.example.mvvmdemo.ui.base

import android.view.View

interface IBaseRecyclerListener {
    fun onClick(view: View, position: Int, obj: Any)
}