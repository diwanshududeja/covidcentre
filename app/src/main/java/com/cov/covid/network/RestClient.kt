package com.poc.newsapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Class to get the instance of the retrofit library and set the base URL
 */
class RestClient {

    companion object {

        val baseURL: String = com.cov.covid.constants.Constant.BASEURL
        var retofit: Retrofit? = null

        val client: Retrofit
            get() {

                if (retofit == null) {
                    retofit = Retrofit.Builder()
                        .baseUrl(baseURL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
                return retofit!!
            }
    }
}