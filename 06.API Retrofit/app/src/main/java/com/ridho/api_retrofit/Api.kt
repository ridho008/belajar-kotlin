package com.ridho.api_retrofit

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("post")
    fun getPosts(): Call<ArrayList<PostResponse>>
}