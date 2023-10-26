package com.example.hiltsealed

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ListView
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.hiltsealed.data.model.Employee
import com.example.hiltsealed.data.remote.BaseResponse
import com.example.hiltsealed.ui.theme.HiltSealedTheme
import com.example.hiltsealed.ui.theme.view.PostAdapter
import com.example.hiltsealed.viewmodel.PostsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val postsViewModel :PostsViewModel by viewModels()
    lateinit var employeeList:List<Employee>
    lateinit var postAdapter: PostAdapter
    lateinit var progressBar:ProgressBar
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()
        fetchData()
    }

    private fun fetchData() {
        postsViewModel.uiState.observe(this, Observer {
            it->
            progressBar.visibility = View.VISIBLE
            Log.d("fetchData " , Thread.currentThread().name )
            when(it) {
                is BaseResponse.Success -> {
                    postAdapter.setData(it.data ?: emptyList())
                    listView.visibility = View.VISIBLE
                    progressBar.visibility = View.GONE
                }
                is BaseResponse.Error -> {
                    listView.visibility = View.VISIBLE
                    progressBar.visibility = View.GONE
                }
                is BaseResponse.Loading -> {
                    listView.visibility = View.GONE
                    progressBar.visibility = View.VISIBLE
                }
            }
        })
    }

    private fun setView() {
        employeeList = arrayListOf<Employee>()
        postAdapter = PostAdapter(this, employeeList)
        listView = findViewById(R.id.listView)
        progressBar  = findViewById(R.id.progress_bar)
        listView.adapter = postAdapter
    }

}
