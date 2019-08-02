package com.example.mvvmdemo.ui.details

import android.app.Application
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdemo.data.Injection
import com.example.mvvmdemo.data.remote.DataSource
import com.example.mvvmdemo.data.wrappers.MovieDetailsWrapper
import com.example.mvvmdemo.utils.AppConstants
import com.example.mvvmdemo.utils.parseFormat
import kotlin.properties.ObservableProperty

class MovieDetailsViewModel(application: Application) : AndroidViewModel(application) {

    private val remote by lazy { Injection.repo()?.remote() }
    private var progress = MutableLiveData<Boolean>()
    var movieTitle = ObservableField<String>("")
    var movieDate = ObservableField<String>("")
    var moviePopularity = ObservableField<String>()
    var movieOverview = ObservableField<String>()
    var movieHomePage = ObservableField<String>()
    var movieVotes = ObservableField<String>()
    var moviePosterPath = ObservableField<String>()
    var movieGenres = ObservableField<String>()
    var movieLanguages = ObservableField<String>()


    fun getProgress() = progress

    fun fetchMovieDetails(id: Int) {

        progress.value = true
        val map = mutableMapOf("api_key" to AppConstants.KEY)
        remote?.getDetailedMovie(id.toString(), map, object : DataSource.RemoteCallback<MovieDetailsWrapper> {
            override fun onSuccess(response: MovieDetailsWrapper) {
                Log.i(AppConstants.TAG,"path ${response.backdropPath}")
                progress.value = false
                movieTitle.set(response.originalTitle)
                movieDate.set(response.releaseDate.parseFormat("yyyy-MM-dd","MMM dd yyyy"))
                movieOverview.set(response.overview)
                movieHomePage.set(response.homepage)
                moviePosterPath.set(response.backdropPath)
                moviePopularity.set((response.voteAverage*10).toString().split(".")[0]+"%")
                movieVotes.set(response.voteCount.toString()+" votes")

                val genres = response.genres.map { it.name }.joinToString(", ")
                val languages = response.spokenLanguages.map { it.name }.joinToString(", ")
                movieGenres.set(response.runtime.toString()+" mins | "+genres)
                movieLanguages.set(languages)
            }

            override fun onFailure(error_code: String, error_message: String) {
                progress.value = false
                Log.i(AppConstants.TAG, "error $error_message")
            }
        })
    }
}
