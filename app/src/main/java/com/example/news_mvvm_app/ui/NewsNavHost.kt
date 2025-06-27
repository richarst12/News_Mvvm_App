package com.example.news_mvvm_app.ui

import android.content.Context
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.core.net.toUri
import com.example.news_mvvm_app.ui.topheadline.TopHeadlineRoute

sealed class Route(val name: String) {
    object TopHeadLine : Route("topheadline")
}

@Composable
fun NewsNavHost() {
    val navController = rememberNavController()
    val context = LocalContext.current
    NavHost(navController = navController, startDestination = Route.TopHeadLine.name) {
        composable(route = Route.TopHeadLine.name){
            TopHeadlineRoute(onNewsClick = {
                openCustomChromeTab(context, it)
            })
        }
    }
}

fun openCustomChromeTab(context: Context, url: String){
    val builder = CustomTabsIntent.Builder()
    val customTabsIntent = builder.build()
    customTabsIntent.launchUrl(context, url.toUri())
}