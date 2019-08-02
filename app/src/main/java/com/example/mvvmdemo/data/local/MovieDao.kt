package com.example.mvvmdemo.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmdemo.data.wrappers.MovieWrapper

@Dao
interface MovieDao {

    @Query("update resultsbean set isFavorite = :favorite where id = :id")
    fun setFavorite(id: Int, favorite: Boolean)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllMovies(movies: List<MovieWrapper.ResultsBean>)

    @Query("select * from resultsbean")
    fun fetchAllMovies(): LiveData<List<MovieWrapper.ResultsBean>>

    @Query("select * from resultsbean where isFavorite = :favorite")
    fun fetchFavoriteMovies(favorite: Boolean): LiveData<List<MovieWrapper.ResultsBean>>

    @Query("select * from resultsbean where id =:id")
    fun fetMovieDetails(id: Int) : MovieWrapper.ResultsBean

    @Query("select * from resultsbean where title =:name")
    fun searchMovies(name: String):LiveData<List<MovieWrapper.ResultsBean>>
}