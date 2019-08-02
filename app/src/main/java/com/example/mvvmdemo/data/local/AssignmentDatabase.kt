package com.example.mvvmdemo.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmdemo.data.wrappers.MovieWrapper

@Database(entities = [MovieWrapper.ResultsBean::class], version = 1, exportSchema = false)
abstract class

AssignmentDatabase : RoomDatabase() {

    internal abstract val moviesDao: MovieDao

    companion object {

        private var INSTANCE: AssignmentDatabase? = null

        fun instance(context: Context): AssignmentDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, AssignmentDatabase::class.java, "assignment.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }
    }
}