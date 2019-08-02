package com.example.mvvmdemo.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mvvmdemo.ui.home.all_movies.AllMoviesFragment
import com.example.mvvmdemo.ui.home.favourite_movies.FavouriteMFragment

class CustomerPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val tabTitle = arrayOf("All Movies", "Favourites")

    override fun getItem(i: Int): Fragment {
        return when(i){
            0-> AllMoviesFragment.newInstance()
            1-> FavouriteMFragment.newInstance()
            else-> AllMoviesFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitle[position]
    }
}