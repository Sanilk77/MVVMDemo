package com.example.mvvmdemo.ui.home.all_movies

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.mvvmdemo.data.Injection
import com.example.mvvmdemo.data.remote.DataSource
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.utils.AppConstants

class AllMoviesViewModel(application: Application) : AndroidViewModel(application) {

    var loading = false
    private var PAGESIZE = 0
    private var PAGECOUNT = 0
    private var progress = MutableLiveData<Boolean>()
    private var movies: LiveData<List<MovieWrapper.ResultsBean>>? = null
    var searchText = MutableLiveData<String>("")

    private val local by lazy { Injection.repo()?.local() }
    private val remote by lazy { Injection.repo()?.remote() }

    init {
        movies = local?.fetchAllMovies()
    }

    fun getProgress() = progress

    fun getMovies() = movies

    fun fetchMovies() {
        progress.value = true
        loading = true
        PAGECOUNT++
        Log.i(AppConstants.TAG, "Page Count -> $PAGECOUNT")
        // Creates a Map of Queries to fetch movie details
        val queries = mutableMapOf("api_key" to AppConstants.KEY, "sort_by" to AppConstants.POPULARITY, "page" to PAGECOUNT.toString())

        remote?.getMoviesData(queries, object : DataSource.RemoteCallback<MovieWrapper> {
            override fun onSuccess(response: MovieWrapper) {
                loading = false
                PAGESIZE = response.totalPages
                local?.insertAllMovies(response.results)
                progress.value = false
            }

            override fun onFailure(error_code: String, error_message: String) {
                loading = false
                progress.value = false
                Log.i(AppConstants.TAG, "error $error_message")
            }
        })
    }

    fun setFavorite(id: Int, favorite: Boolean) {
        local?.setFavorite(id, favorite)
    }
}
