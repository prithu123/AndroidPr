package com.prithu.androidcoroutinesflow.model

import com.prithu.androidcoroutinesretrofit.model.NewsArticle
import com.google.gson.Gson
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.create


class NewsRepository {
    companion object{
        private const val BASE_URL="https://raw.githubusercontent.com/prithu123/data/master/"
        private const val NEWS_DELAY=5000L


    }
    private val newService=Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsService::class.java)

    fun getNewsArticles():Flow<NewsArticle>{
        return flow {
            var newsSource=newService.getNews()
            newsSource.forEach {
                emit(it)
                delay(NEWS_DELAY)
            }
        }
    }
}