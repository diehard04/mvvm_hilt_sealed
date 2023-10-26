package com.example.hiltsealed.data.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("employees")
    @Expose
    val employees: List<Employee>? = null
)

data class Employee(
    @SerializedName("name")
    @Expose
    val name: String? = null,

    @SerializedName("email")
    @Expose
    val email: String? = null,

    @SerializedName("age")
    @Expose
    val age: Int? = null
)

