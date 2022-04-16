package com.plcoding.stockmarketapp.data.remote.dto


import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface Stockapi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getlisting(
        @Query("apiKey") apikey: String
    ):ResponseBody

    // Limited to 5 Request per API_KEY
    // Find your Key in the link: alphavantage.co
    companion object{
        const val API_KEY = "PIYYAIG09A2BGTF7"
        const val BASE_URL = "http://alphavantage.co"
    }
}