package com.example.hiltsealed.repository

import android.util.Log
import com.example.hiltsealed.data.model.Posts
import com.example.hiltsealed.data.remote.ApiServices
import kotlinx.coroutines.delay
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepository @Inject constructor(private val apiServices: ApiServices){

    suspend fun loginUser(): Response<Posts> {
        Log.d("PostsRepository ", Thread.currentThread().name)
        delay(10000)
        return apiServices.getPost()
    }
}