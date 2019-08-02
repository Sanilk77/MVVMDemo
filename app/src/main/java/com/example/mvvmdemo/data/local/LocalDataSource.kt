package com.example.mvvmdemo.data.local

import androidx.lifecycle.LiveData
import com.example.mvvmdemo.data.wrappers.MovieWrapper

class LocalDataSource private constructor(private val database: AssignmentDatabase) : DataSource {

    companion object {
        private var source: LocalDataSource? = null

        fun instance(database: AssignmentDatabase): LocalDataSource {
            if (source == null) {
                source = LocalDataSource(database)
            }
            return source!!
        }
    }

    override fun setFavorite(id: Int, favorite: Boolean) {
        database.moviesDao.setFavorite(id, favorite)
    }

    override fun insertAllMovies(movies: List<MovieWrapper.ResultsBean>) {
        database.moviesDao.insertAllMovies(movies)
    }

    override fun fetchAllMovies(): LiveData<List<MovieWrapper.ResultsBean>> {
        return database.moviesDao.fetchAllMovies()
    }

    override fun fetchFavoriteMovies(): LiveData<List<MovieWrapper.ResultsBean>> {
        return database.moviesDao.fetchFavoriteMovies(true)
    }

    override fun getSearchedMovies(name: String): LiveData<List<MovieWrapper.ResultsBean>> {

        return database.moviesDao.searchMovies(name)
    }
}