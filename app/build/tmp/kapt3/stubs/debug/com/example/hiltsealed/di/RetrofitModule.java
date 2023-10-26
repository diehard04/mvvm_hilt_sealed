package com.example.hiltsealed.di;

import com.example.hiltsealed.data.remote.ApiServices;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/hiltsealed/di/RetrofitModule;", "", "()V", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptor", "providePostApi", "Lcom/example/hiltsealed/data/remote/ApiServices;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "provideRetrofit", "app_debug"})
@dagger.Module
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.hiltsealed.di.RetrofitModule INSTANCE = null;
    
    private RetrofitModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    okhttp3.logging.HttpLoggingInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit.Builder provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.hiltsealed.data.remote.ApiServices providePostApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
}