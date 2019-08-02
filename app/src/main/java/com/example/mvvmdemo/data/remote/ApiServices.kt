package com.example.mvvmdemo.data.remote

import com.example.mvvmdemo.data.wrappers.CastWrapper
import com.example.mvvmdemo.data.wrappers.MovieDetailsWrapper
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.data.wrappers.YoutubeWrapper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiServices {

    @GET("discover/movie")
    fun getTopRatedMovies(@QueryMap map: Map<String, String>): Call<MovieWrapper>

    @GET("movie/{movieid}")
    fun getMovieDetails(@Path("movieid") id: String, @QueryMap map: Map<String, String>): Call<MovieDetailsWrapper>

    @GET("discover/movie/{movieid}/videos")
    fun getVideos(@Path("movieid") id: String, @QueryMap map: Map<String, String>): Call<YoutubeWrapper>

    @GET("discover/movie/{movieid}/credits")
    fun getCast(@Path("movieid") id: String, @QueryMap map: Map<String, String>): Call<CastWrapper>
}