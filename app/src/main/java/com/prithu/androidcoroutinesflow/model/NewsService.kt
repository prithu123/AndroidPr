package com.prithu.androidcoroutinesflow.model

import com.prithu.androidcoroutinesretrofit.model.NewsArticle
import retrofit2.http.GET

interface NewsService {
    @GET("news.json")
    suspend fun getNews(): List<NewsArticle>
}