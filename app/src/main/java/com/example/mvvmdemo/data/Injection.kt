package com.example.mvvmdemo.data

import android.content.Context
import com.example.mvvmdemo.data.local.AssignmentDatabase
import com.example.mvvmdemo.data.local.LocalDataSource
import com.example.mvvmdemo.data.remote.RemoteDataSource

object Injection {

    private var INSTANCE: AssignmentRepository? = null

    fun createRepo(context: Context) {
        if (INSTANCE == null) {
            val database = AssignmentDatabase.instance(context)
            INSTANCE = AssignmentRepository.instance(RemoteDataSource.instance()!!, LocalDataSource.instance(database))
        }
    }

    fun repo(): AssignmentRepository? {
        return INSTANCE
    }
}
