package com.example.news_mvvm_app.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.example.news_mvvm_app.data.repository.TopHeadlineRepository
import com.example.news_mvvm_app.di.ActivityContext
import com.example.news_mvvm_app.ui.TopHeadlineActivity
import com.example.news_mvvm_app.ui.TopHeadlineAdapter
import com.example.news_mvvm_app.viewmodel.TopHeadlineViewModel
import com.example.news_mvvm_app.viewmodel.TopHeadlineViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: TopHeadlineActivity) {

    @ActivityContext
    @Provides
    fun provideContext() : Context{
        return activity
    }

  @Provides
    fun provideNewsListViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            TopHeadlineViewModelFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }
    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter()
}
