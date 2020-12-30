package com.example.appshowroom.data.remote

import com.example.appshowroom.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET( "/")
    fun listNews() : Call<NewsList>

    @GET("detail/")
    fun detailNews(@Query("url")url: String): Call<NewsList>

    @GET("search/")
    fun searchNews(@Query("q")url: String): Call<NewsList>
}