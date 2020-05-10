package com.prithu.androidcoroutinesflow.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.prithu.androidcoroutinesflow.model.NewsRepository

class ListViewModel : ViewModel() {

    val newsArticles = NewsRepository().getNewsArticles().asLiveData()

}