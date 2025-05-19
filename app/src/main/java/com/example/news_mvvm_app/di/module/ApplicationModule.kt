package com.example.news_mvvm_app.di.module

import android.content.Context
import com.example.news_mvvm_app.NewsApplication
import com.example.news_mvvm_app.data.api.NetworkService
import com.example.news_mvvm_app.di.ApplicationContext
import com.example.news_mvvm_app.di.BaseUrl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApplicationModule(private val newsApplication: NewsApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return newsApplication
    }

    @BaseUrl
    @Provides
    fun provideBaseUrl() : String = "https://newsapi.org/v2/"


    @Provides
    @Singleton
    fun provideGsonFactory(): GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    @Singleton
    fun provideNetworkService(
        @BaseUrl baseUrl: String,
        gsonConverterFactory: GsonConverterFactory
    ): NetworkService {
       return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(gsonConverterFactory)
            .build()
            .create(NetworkService::class.java)
    }

}