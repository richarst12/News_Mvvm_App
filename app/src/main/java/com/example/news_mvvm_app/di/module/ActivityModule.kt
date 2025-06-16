package com.example.news_mvvm_app.di.module

import com.example.news_mvvm_app.ui.TopHeadlineAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @ActivityScoped
    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}