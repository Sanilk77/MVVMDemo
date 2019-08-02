package com.example.mvvmdemo.ui.home

import android.os.Bundle
import com.example.mvvmdemo.R
import com.example.mvvmdemo.databinding.ActivityHomeBinding
import com.example.mvvmdemo.ui.base.BaseActivity

class HomeActivity : BaseActivity() {

    private var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = getBinder() as ActivityHomeBinding
        setAdapter()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_home
    }

    private fun setAdapter() {
        val customerPagerAdapter = CustomerPagerAdapter(supportFragmentManager)
        binding?.viewPager?.adapter = customerPagerAdapter
        binding?.tabLayout?.setupWithViewPager(binding?.viewPager)
    }
}
