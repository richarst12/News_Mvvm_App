package com.example.news_mvvm_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
class TopHeadlineViewModelFactory<T: ViewModel>(
    private val kClass: KClass<T>,
    private val creator: () -> T
) : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(kClass.java)) return creator() as T
        return super.create(modelClass)
    }
}
