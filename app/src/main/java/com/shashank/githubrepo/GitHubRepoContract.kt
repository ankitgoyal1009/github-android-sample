package com.shashank.githubrepo

interface GitHubRepoContract {
    interface View {

    }
    interface Presenter {
        fun getGitHubData()

        fun onGitHubRepoDataSuccess(gitHubRepoResponse: GitHubRepoResponse)

        fun onGitHubRepoDataFailure()
    }
    interface Service {
        fun getGitHubRepos(query: String)
    }
}