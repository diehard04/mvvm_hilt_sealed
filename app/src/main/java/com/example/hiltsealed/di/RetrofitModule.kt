package com.example.hiltsealed.di

import com.example.hiltsealed.data.remote.ApiServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    fun provideLoggingInterceptor():HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor):OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit():Retrofit.Builder {
        return Retrofit.Builder().
                baseUrl(ApiServices.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Provides
    @Singleton
    fun providePostApi(retrofitBuilder: Retrofit.Builder):ApiServices {
        return retrofitBuilder.build().create(ApiServices::class.java)
    }

}