package com.poc.newsapp.network

import com.cov.covid.modals.StoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Interface to declare all the APIs
 */
interface NetworkService {

    @GET("/v2/getStories")
    fun getNews(@Query("q") q: String, @Query("from") from: String, @Query("sortBy") sortBy: String, @Query("apiKey") apiKey: String, @Query("pageSize") pageSize: Int, @Query("page") page: Int): Call<StoriesResponse>
}