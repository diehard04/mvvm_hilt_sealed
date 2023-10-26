package com.example.hiltsealed.ui.theme.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.hiltsealed.R;
import com.example.hiltsealed.data.model.Employee;
import com.example.hiltsealed.data.model.Posts;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tH\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/hiltsealed/ui/theme/view/PostAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "employeeList", "", "Lcom/example/hiltsealed/data/model/Employee;", "(Landroid/content/Context;Ljava/util/List;)V", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "setData", "", "postList", "ViewHolder", "app_debug"})
public final class PostAdapter extends android.widget.BaseAdapter {
    private final android.content.Context context = null;
    private java.util.List<com.example.hiltsealed.data.model.Employee> employeeList;
    
    public PostAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.hiltsealed.data.model.Employee> employeeList) {
        super();
    }
    
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.Object getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable
    android.view.View convertView, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.hiltsealed.data.model.Employee> postList) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/hiltsealed/ui/theme/view/PostAdapter$ViewHolder;", "", "nameTextView", "Landroid/widget/TextView;", "emailTextView", "ageTextView", "(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V", "getAgeTextView", "()Landroid/widget/TextView;", "getEmailTextView", "getNameTextView", "app_debug"})
    static final class ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView nameTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView emailTextView = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView ageTextView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.widget.TextView nameTextView, @org.jetbrains.annotations.NotNull
        android.widget.TextView emailTextView, @org.jetbrains.annotations.NotNull
        android.widget.TextView ageTextView) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getEmailTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getAgeTextView() {
            return null;
        }
    }
}