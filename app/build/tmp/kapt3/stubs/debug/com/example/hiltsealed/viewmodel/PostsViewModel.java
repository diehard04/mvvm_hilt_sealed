package com.example.hiltsealed.viewmodel;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hiltsealed.data.model.Employee;
import com.example.hiltsealed.data.model.Posts;
import com.example.hiltsealed.data.remote.BaseResponse;
import com.example.hiltsealed.repository.PostsRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.Response;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0011\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/hiltsealed/viewmodel/PostsViewModel;", "Landroidx/lifecycle/ViewModel;", "postsRepository", "Lcom/example/hiltsealed/repository/PostsRepository;", "(Lcom/example/hiltsealed/repository/PostsRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/hiltsealed/data/remote/BaseResponse;", "", "Lcom/example/hiltsealed/data/model/Employee;", "uiState", "getUiState", "()Landroidx/lifecycle/MutableLiveData;", "fetchPostsData", "Lkotlinx/coroutines/Job;", "getPost", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handledResponse", "response", "Lretrofit2/Response;", "Lcom/example/hiltsealed/data/model/Posts;", "app_debug"})
public final class PostsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.hiltsealed.repository.PostsRepository postsRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.hiltsealed.data.remote.BaseResponse<java.util.List<com.example.hiltsealed.data.model.Employee>>> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.hiltsealed.data.remote.BaseResponse<java.util.List<com.example.hiltsealed.data.model.Employee>>> uiState = null;
    
    @javax.inject.Inject
    public PostsViewModel(@org.jetbrains.annotations.NotNull
    com.example.hiltsealed.repository.PostsRepository postsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.hiltsealed.data.remote.BaseResponse<java.util.List<com.example.hiltsealed.data.model.Employee>>> getUiState() {
        return null;
    }
    
    private final kotlinx.coroutines.Job fetchPostsData() {
        return null;
    }
    
    private final java.lang.Object getPost(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.example.hiltsealed.data.remote.BaseResponse<java.util.List<com.example.hiltsealed.data.model.Employee>> handledResponse(retrofit2.Response<com.example.hiltsealed.data.model.Posts> response) {
        return null;
    }
}