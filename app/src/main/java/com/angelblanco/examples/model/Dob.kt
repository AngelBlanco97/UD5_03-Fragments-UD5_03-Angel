package com.angelblanco.examples.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Dob(
    @SerializedName("age")
    @Expose
    val age: Int,
    @SerializedName("date")
    @Expose
    val date: String
)