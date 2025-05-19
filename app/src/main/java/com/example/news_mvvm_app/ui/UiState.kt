package com.example.news_mvvm_app.ui

sealed interface UiState<out T> {
    data class onSuccess<T>(val data: T): UiState<T>
    data class onError(val message: String) : UiState<Nothing>
    object Loading : UiState<Nothing>
}
/* object means it's a singleton instance — only one Loading object is ever created. */

/*
* <out T>: Covariant generic type — means UiState<String> can be treated as UiState<Any>
* */