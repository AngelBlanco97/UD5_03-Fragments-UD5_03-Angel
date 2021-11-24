package com.angelblanco.examples.model


import com.angelblanco.examples.model.Info
import com.angelblanco.examples.model.User
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class UserResponse(
    @SerializedName("info")
    @Expose
    val info: Info,
    @SerializedName("results")
    @Expose
    val users: List<User>
)