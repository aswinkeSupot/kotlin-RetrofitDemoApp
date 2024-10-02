package com.aswin.retrofitdemoapp.model

import com.google.gson.annotations.SerializedName

/**
 * {
 *     "name": "Apple",
 *     "countryCode": "US",
 *     "market_cap": "911.1",
 *     "id": 1
 *   }
 *   **/
data class Company(
    val name: String,
    val countryCode: String,
    @SerializedName("market_cap")
    val marketCap: String,
    val id: Int
)
