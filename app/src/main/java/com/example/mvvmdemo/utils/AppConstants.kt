package com.example.mvvmdemo.utils

interface AppConstants {

    companion object {
        val POPULARITY = "popularity.desc"
        val KEY = "2d6be210cc8d928e0c2057b57b6c9f59"
        val IMAGEURL = "http://image.tmdb.org/t/p/w200/"
        val BASEURL = "http://api.themoviedb.org/3/"
        val TAG  = "movies"
        val NOINTERNET = "No Internet Connection!"
    }
   // http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=2d6be210cc8d928e0c2057b57b6c9f59
}