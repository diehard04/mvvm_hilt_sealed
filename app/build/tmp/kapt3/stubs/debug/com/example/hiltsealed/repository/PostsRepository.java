package com.example.hiltsealed.repository;

import android.util.Log;
import com.example.hiltsealed.data.model.Posts;
import com.example.hiltsealed.data.remote.ApiServices;
import retrofit2.Response;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/hiltsealed/repository/PostsRepository;", "", "apiServices", "Lcom/example/hiltsealed/data/remote/ApiServices;", "(Lcom/example/hiltsealed/data/remote/ApiServices;)V", "loginUser", "Lretrofit2/Response;", "Lcom/example/hiltsealed/data/model/Posts;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class PostsRepository {
    private final com.example.hiltsealed.data.remote.ApiServices apiServices = null;
    
    @javax.inject.Inject
    public PostsRepository(@org.jetbrains.annotations.NotNull
    com.example.hiltsealed.data.remote.ApiServices apiServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltsealed.data.model.Posts>> continuation) {
        return null;
    }
}