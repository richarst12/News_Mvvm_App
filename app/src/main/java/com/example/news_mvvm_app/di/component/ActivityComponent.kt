package com.example.news_mvvm_app.di.component

import com.example.news_mvvm_app.di.ActivityScope
import com.example.news_mvvm_app.di.module.ActivityModule
import com.example.news_mvvm_app.ui.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)
}