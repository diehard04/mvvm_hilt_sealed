package com.example.hiltsealed.data.remote;

import com.example.hiltsealed.data.model.Posts;
import retrofit2.Response;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/hiltsealed/data/remote/ApiServices;", "", "getPost", "Lretrofit2/Response;", "Lcom/example/hiltsealed/data/model/Posts;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiServices {
    @org.jetbrains.annotations.NotNull
    public static final com.example.hiltsealed.data.remote.ApiServices.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://run.mocky.io/v3/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_VALUE = "6903704f-917b-492c-9d20-a9648539348f";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "6903704f-917b-492c-9d20-a9648539348f")
    public abstract java.lang.Object getPost(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.hiltsealed.data.model.Posts>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/hiltsealed/data/remote/ApiServices$Companion;", "", "()V", "API_VALUE", "", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://run.mocky.io/v3/";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String API_VALUE = "6903704f-917b-492c-9d20-a9648539348f";
        
        private Companion() {
            super();
        }
    }
}