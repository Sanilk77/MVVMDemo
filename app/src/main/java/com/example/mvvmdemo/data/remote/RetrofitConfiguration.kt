package com.example.mvvmdemo.data.remote

import com.example.mvvmdemo.BuildConfig
import com.example.mvvmdemo.utils.AppConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitConfiguration {

    var retrofit : Retrofit?=null

    val client: Retrofit?
        get() {
            if (retrofit == null) {

                val interceptor = HttpLoggingInterceptor()
                interceptor.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
                val client = OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build()

                retrofit = Retrofit.Builder()
                    .baseUrl(AppConstants.BASEURL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}