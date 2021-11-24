package com.angelblanco.examples.network

import com.angelblanco.examples.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface RandomUserService {
    @GET("?results=50")
    fun getUsers(): Call<UserResponse>
}