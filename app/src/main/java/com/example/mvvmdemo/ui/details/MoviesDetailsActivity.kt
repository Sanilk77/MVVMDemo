package com.example.mvvmdemo.ui.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmdemo.R
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.databinding.ActivityMoviesDetailsBinding
import com.example.mvvmdemo.ui.base.BaseActivity
import com.example.mvvmdemo.utils.AppConstants
import com.example.mvvmdemo.utils.withNet
import com.google.android.material.appbar.AppBarLayout

class MoviesDetailsActivity : BaseActivity() {

    private lateinit var binding: ActivityMoviesDetailsBinding
    private lateinit var model: MovieDetailsViewModel
    private var id : Int = 0

    companion object {
        fun viewMovieBean(context: Context, id: Int) {
            val intent = Intent(context, MoviesDetailsActivity::class.java)
            intent.putExtra("bean", id)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        id = intent.getIntExtra("bean",0)

        binding = getBinder() as ActivityMoviesDetailsBinding
        model = ViewModelProviders.of(this).get(MovieDetailsViewModel::class.java)
        binding.model = model


        observeEvents()
        fetMoviesDetails()
        setAppBar()
    }

    private fun observeEvents() {
        model.getProgress().observe(this, Observer {
            if (it!!) showProgress() else hideProgress()
        })
    }

    private fun fetMoviesDetails(){
        withNet { model.fetchMovieDetails(id) }
    }

    private fun setAppBar(){

        binding.appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener() { appBarLayout: AppBarLayout, i: Int ->
            var scrollRange : Int? = -1

            if (scrollRange == -1) {
                scrollRange = appBarLayout.getTotalScrollRange()
            }
            if (scrollRange!! + i == 0) {
                binding.ctlayout.title = model.movieTitle.get()
            } else {
                binding.ctlayout.title = ""
            }
        })
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_movies_details
    }
}
