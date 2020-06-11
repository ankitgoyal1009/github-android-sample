package com.shashank.githubrepo

import android.telecom.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Callable

class GitHubRepoService(private val presenter: GitHubRepoContract.Presenter) : GitHubRepoContract.Service {

    override fun getGitHubRepos(query: String) {
        val gitHubCallable = ApiClient.getApiClient().searchGitHubRepositories(query)
        gitHubCallable
            .enqueue(object : Callback<GitHubRepoResponse> {
                override fun onFailure(call: retrofit2.Call<GitHubRepoResponse>, t: Throwable) {

                }

                override fun onResponse(
                    call: retrofit2.Call<GitHubRepoResponse>,
                    response: Response<GitHubRepoResponse>
                ) {

                }

            })
    }
}