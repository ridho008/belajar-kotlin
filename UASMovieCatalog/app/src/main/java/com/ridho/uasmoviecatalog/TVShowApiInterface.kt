package com.ridho.uasmoviecatalog

import retrofit2.Call
import retrofit2.http.GET

interface TVShowApiInterface {
    @GET("/3/tv/popular?api_key=16bdc8c0bae8e48682d0f2c7f2083d0b")
    fun getTVShowList(): Call<TVShowResponse>
}