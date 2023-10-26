package com.example.hiltsealed.data.remote

import com.example.hiltsealed.data.model.Posts
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    companion object {
        const val BASE_URL = "https://run.mocky.io/v3/"
        const val API_VALUE = "6903704f-917b-492c-9d20-a9648539348f"
    }

    @GET("6903704f-917b-492c-9d20-a9648539348f")
    suspend fun getPost():Response<Posts>
}