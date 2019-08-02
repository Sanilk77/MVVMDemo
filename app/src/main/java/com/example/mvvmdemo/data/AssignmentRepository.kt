package com.example.mvvmdemo.data

import com.example.mvvmdemo.data.local.LocalDataSource
import com.example.mvvmdemo.data.remote.RemoteDataSource

class AssignmentRepository private constructor(private val remote: RemoteDataSource, private val local: LocalDataSource) {

    companion object {
        private var INSTANCE: AssignmentRepository? = null

        fun instance(remote: RemoteDataSource, local: LocalDataSource): AssignmentRepository {
            if (INSTANCE == null) {
                INSTANCE = AssignmentRepository(remote, local)
            }
            return INSTANCE!!
        }
    }

    fun remote(): RemoteDataSource = remote

    fun local(): LocalDataSource = local
}
