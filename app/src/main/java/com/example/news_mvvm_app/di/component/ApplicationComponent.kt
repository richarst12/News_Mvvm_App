package com.example.news_mvvm_app.di.component

import android.content.Context
import com.example.news_mvvm_app.NewsApplication
import com.example.news_mvvm_app.data.api.NetworkService
import com.example.news_mvvm_app.data.repository.TopHeadlineRepository
import com.example.news_mvvm_app.di.ApplicationContext
import com.example.news_mvvm_app.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(newsApplication: NewsApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}