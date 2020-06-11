package com.shashank.githubrepo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiContract {
    @GET("search/repositories")
    fun searchGitHubRepositories(@Query("q") query: String): Call<GitHubRepoResponse>
}