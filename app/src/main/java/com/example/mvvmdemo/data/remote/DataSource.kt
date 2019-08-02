package com.example.mvvmdemo.data.remote

import com.example.mvvmdemo.data.wrappers.CastWrapper
import com.example.mvvmdemo.data.wrappers.MovieDetailsWrapper
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.data.wrappers.YoutubeWrapper

interface DataSource {

    fun getMoviesData(map: Map<String, String>, callback: RemoteCallback<MovieWrapper>)
    fun getDetailedMovie(id: String, map: Map<String, String>, callback: RemoteCallback<MovieDetailsWrapper>)
    fun getVideos(id: String, map: Map<String, String>, callback: RemoteCallback<YoutubeWrapper>)
    fun getCast(id: String, map: Map<String, String>, callback: RemoteCallback<CastWrapper>)

    interface RemoteCallback<in T> {
        fun onSuccess(response: T)
        fun onFailure(error_code: String, error_message: String)
    }
}
