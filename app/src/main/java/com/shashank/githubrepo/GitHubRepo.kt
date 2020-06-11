package com.shashank.githubrepo


data class GitHubRepoResponse(
    val items: List<GitHubRepo>
)

data class GitHubRepo(
    val name: String,
    val html_url: String
)