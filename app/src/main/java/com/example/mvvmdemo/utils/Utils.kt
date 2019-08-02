package com.example.mvvmdemo.utils

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat


private fun Context.checkInternet(): Boolean {
    val manager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    val info = manager?.activeNetworkInfo
    return info != null && info.isConnected
}


fun Context.withNet(body: () -> Unit) {
    if (this.checkInternet()) {
        body()
    } else {
        Toast.makeText(this, AppConstants.NOINTERNET, Toast.LENGTH_SHORT).show()
    }
}

fun RecyclerView.scrollWithManager(manager: LinearLayoutManager, operation: () -> Unit) {
    this.addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            val totalItemCount = manager.itemCount
            val visibleItemCount = manager.childCount
            val firstVisibleItem = manager.findFirstVisibleItemPosition()
            if (firstVisibleItem + visibleItemCount >= totalItemCount) {
                operation()
            }
        }
    })
}

@SuppressLint("SimpleDateFormat")
fun String.parseFormat(current: String, required: String): String {
    val currentSdf = SimpleDateFormat(current)
    val requiredSdf = SimpleDateFormat(required)
    val date = currentSdf.parse(this)
    return requiredSdf.format(date)
}
