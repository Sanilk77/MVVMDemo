package com.example.mvvmdemo.data.remote

import android.util.Log
import com.example.mvvmdemo.data.wrappers.CastWrapper
import com.example.mvvmdemo.data.wrappers.MovieDetailsWrapper
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.data.wrappers.YoutubeWrapper
import com.example.mvvmdemo.utils.AppConstants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource private constructor() : DataSource {

    companion object {

        private var INSTANCE: RemoteDataSource? = null

        fun instance(): RemoteDataSource? {
            if (INSTANCE == null) {
                INSTANCE = RemoteDataSource()
            }
            return INSTANCE
        }
    }

    private val apiService: ApiServices? by lazy { RetrofitConfiguration.client?.create(ApiServices::class.java) }

    override fun getMoviesData(map: Map<String, String>, callback: DataSource.RemoteCallback<MovieWrapper>) {

        apiService?.getTopRatedMovies(map)?.enqueue(object : Callback<MovieWrapper> {
            override fun onFailure(call: Call<MovieWrapper>, t: Throwable) {
                callback.onFailure("0", t.message!!)
            }

            override fun onResponse(call: Call<MovieWrapper>, response: Response<MovieWrapper>) {
                callback.onSuccess(response.body()!!)
            }
        })
    }

    override fun getDetailedMovie(id: String, map: Map<String, String>, callback: DataSource.RemoteCallback<MovieDetailsWrapper>) {

        apiService?.getMovieDetails(id, map)?.enqueue(object : Callback<MovieDetailsWrapper> {
            override fun onFailure(call: Call<MovieDetailsWrapper>, t: Throwable) {
                callback.onFailure("0", t.message!!)
            }

            override fun onResponse(call: Call<MovieDetailsWrapper>, response: Response<MovieDetailsWrapper>) {

                Log.i(AppConstants.TAG,"response $response")
                callback.onSuccess(response?.body()!!)
            }
        })
    }

    override fun getVideos(id: String, map: Map<String, String>, callback: DataSource.RemoteCallback<YoutubeWrapper>) {
        apiService?.getVideos(id, map)?.enqueue(object : Callback<YoutubeWrapper> {
            override fun onFailure(call: Call<YoutubeWrapper>, t: Throwable) {
                callback.onFailure("0", t.message!!)
            }

            override fun onResponse(call: Call<YoutubeWrapper>, response: Response<YoutubeWrapper>) {
                callback.onSuccess(response.body()!!)
            }
        })
    }

    override fun getCast(id: String, map: Map<String, String>, callback: DataSource.RemoteCallback<CastWrapper>) {
        apiService?.getCast(id, map)?.enqueue(object : Callback<CastWrapper> {
            override fun onFailure(call: Call<CastWrapper>, t: Throwable) {
                callback.onFailure("0", t.message!!)
            }

            override fun onResponse(call: Call<CastWrapper>, response: Response<CastWrapper>) {
                callback.onSuccess(response.body()!!)
            }
        })
    }
}