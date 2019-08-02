package com.example.mvvmdemo.ui.home.favourite_movies

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.mvvmdemo.data.Injection
import com.example.mvvmdemo.data.wrappers.MovieWrapper

class FavouriteMViewModel(application: Application) : AndroidViewModel(application) {

    private var movies: LiveData<List<MovieWrapper.ResultsBean>>? = null
    private val local by lazy { Injection.repo()?.local() }

    init {
        movies = local?.fetchFavoriteMovies()
    }

    fun getMovies() = movies

    fun setFavorite(id: Int, favorite: Boolean) {
        local?.setFavorite(id, favorite)
    }
}
