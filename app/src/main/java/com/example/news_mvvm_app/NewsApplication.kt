package com.example.news_mvvm_app

import android.app.Application
import com.example.news_mvvm_app.di.component.ApplicationComponent
import com.example.news_mvvm_app.di.component.DaggerApplicationComponent
import com.example.news_mvvm_app.di.module.ApplicationModule

class NewsApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
     applicationComponent = DaggerApplicationComponent
         .builder()
         .applicationModule(ApplicationModule(this))
         .build()
      applicationComponent.inject(this)
    }

}