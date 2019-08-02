package com.example.mvvmdemo.data.local

import androidx.lifecycle.LiveData
import com.example.mvvmdemo.data.wrappers.MovieWrapper

interface DataSource {

    fun setFavorite(id: Int, favorite: Boolean)
    fun insertAllMovies(movies: List<MovieWrapper.ResultsBean>)

    fun fetchAllMovies(): LiveData<List<MovieWrapper.ResultsBean>>
    fun fetchFavoriteMovies(): LiveData<List<MovieWrapper.ResultsBean>>

    fun getSearchedMovies(name: String) : LiveData<List<MovieWrapper.ResultsBean>>

}