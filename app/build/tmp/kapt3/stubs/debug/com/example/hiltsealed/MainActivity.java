package com.example.hiltsealed;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Observer;
import com.example.hiltsealed.data.model.Employee;
import com.example.hiltsealed.data.remote.BaseResponse;
import com.example.hiltsealed.ui.theme.view.PostAdapter;
import com.example.hiltsealed.viewmodel.PostsViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020#H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006("}, d2 = {"Lcom/example/hiltsealed/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "employeeList", "", "Lcom/example/hiltsealed/data/model/Employee;", "getEmployeeList", "()Ljava/util/List;", "setEmployeeList", "(Ljava/util/List;)V", "listView", "Landroid/widget/ListView;", "getListView", "()Landroid/widget/ListView;", "setListView", "(Landroid/widget/ListView;)V", "postAdapter", "Lcom/example/hiltsealed/ui/theme/view/PostAdapter;", "getPostAdapter", "()Lcom/example/hiltsealed/ui/theme/view/PostAdapter;", "setPostAdapter", "(Lcom/example/hiltsealed/ui/theme/view/PostAdapter;)V", "postsViewModel", "Lcom/example/hiltsealed/viewmodel/PostsViewModel;", "getPostsViewModel", "()Lcom/example/hiltsealed/viewmodel/PostsViewModel;", "postsViewModel$delegate", "Lkotlin/Lazy;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "fetchData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy postsViewModel$delegate = null;
    public java.util.List<com.example.hiltsealed.data.model.Employee> employeeList;
    public com.example.hiltsealed.ui.theme.view.PostAdapter postAdapter;
    public android.widget.ProgressBar progressBar;
    public android.widget.ListView listView;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.hiltsealed.viewmodel.PostsViewModel getPostsViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.hiltsealed.data.model.Employee> getEmployeeList() {
        return null;
    }
    
    public final void setEmployeeList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.hiltsealed.data.model.Employee> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.hiltsealed.ui.theme.view.PostAdapter getPostAdapter() {
        return null;
    }
    
    public final void setPostAdapter(@org.jetbrains.annotations.NotNull
    com.example.hiltsealed.ui.theme.view.PostAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ListView getListView() {
        return null;
    }
    
    public final void setListView(@org.jetbrains.annotations.NotNull
    android.widget.ListView p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchData() {
    }
    
    private final void setView() {
    }
}