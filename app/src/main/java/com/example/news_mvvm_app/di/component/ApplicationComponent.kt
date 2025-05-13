package com.example.news_mvvm_app.di.component

import com.example.news_mvvm_app.NewsApplication
import com.example.news_mvvm_app.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(newsApplication: NewsApplication)
}