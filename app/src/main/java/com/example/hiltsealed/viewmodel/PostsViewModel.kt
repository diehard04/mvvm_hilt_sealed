package com.example.hiltsealed.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltsealed.data.model.Employee
import com.example.hiltsealed.data.model.Posts
import com.example.hiltsealed.data.remote.BaseResponse
import com.example.hiltsealed.repository.PostsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor(private val postsRepository: PostsRepository):ViewModel(){

    private val _uiState = MutableLiveData<BaseResponse<List<Employee>>>()

    val uiState: MutableLiveData<BaseResponse<List<Employee>>> = _uiState

    init {
        fetchPostsData()
    }

    private fun fetchPostsData() = viewModelScope.launch() {
        Log.d(" fetchPostsData " , Thread.currentThread().name)
        getPost()
    }

    private suspend fun getPost() {
        Log.d(" getPost " , Thread.currentThread().name)
        uiState.postValue(BaseResponse.Loading())
        val response = postsRepository.loginUser()
        uiState.postValue(handledResponse(response))
    }

    private fun handledResponse(response: Response<Posts>): BaseResponse<List<Employee>>? {
        if (response.isSuccessful) {
            response.body().let {
                resultResponse ->
                return BaseResponse.Success(resultResponse?.employees)
            }
        }
        return BaseResponse.Error(response.message())
    }
}