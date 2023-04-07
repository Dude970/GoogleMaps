package com.example.GoogleMaps.data.remote

import com.google.android.gms.common.api.Response
import com.google.android.gms.common.api.internal.ApiKey
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {
    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ):ResponseBody

    companion object{

        const val API_KEY= "YAW35KA7GJF5EOIY"
        const val BASE_URL= "https://www.alphavantage.co"

    }
}