package com.shashank.githubrepo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    lateinit var retrofitInstance: ApiContract

    fun getApiClient(): ApiContract {
        if (!this::retrofitInstance.isInitialized) {
            retrofitInstance = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiContract::class.java)
        }
        return retrofitInstance
    }
}