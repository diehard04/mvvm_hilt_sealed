package com.example.hiltsealed.data.remote

sealed class BaseResponse<out T> {

    data class Success<out T>(val data:T? = null) : BaseResponse<T>()

    data class Error<out T>(val msg:String ?= null):BaseResponse<T>()

    data class Loading<out T> (val nothing: Nothing ?= null) :BaseResponse<T>()
}

