package com.example.news_mvvm_app.data.repository

import com.example.news_mvvm_app.data.api.NetworkService
import com.example.news_mvvm_app.data.model.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService) {

    fun getTopHeadline(country: String) : Flow<List<Article>> {
        return flow {
         emit(networkService.getTopHeadlines(country))
        }.map {
         it.articles
        }
    }
}