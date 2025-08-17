package com.example.news_mvvm_app.ui.topheadline

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.news_mvvm_app.data.model.Article
import com.example.news_mvvm_app.data.repository.TopHeadlineRepository
import com.example.news_mvvm_app.ui.UiState
import com.example.news_mvvm_app.ui.utils.AppConstant.COUNTRY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TopHeadlineViewModel @Inject constructor(private val topHeadlineRepository: TopHeadlineRepository) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState<List<Article>>>(UiState.Loading)
    val uiState: StateFlow<UiState<List<Article>>> = _uiState

    init {
        fetchNews()
    }

    private fun fetchNews() {
        viewModelScope.launch {
            topHeadlineRepository.getTopHeadline(COUNTRY)
                .catch { e ->
                    _uiState.value = UiState.onError(e.toString())
                }.collect {
                    _uiState.value = UiState.onSuccess(it)
                }
        }
    }
}