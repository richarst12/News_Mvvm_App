package com.example.news_mvvm_app.di.module

import android.content.Context
import com.example.news_mvvm_app.NewsApplication
import com.example.news_mvvm_app.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val newsApplication: NewsApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return newsApplication
    }
}