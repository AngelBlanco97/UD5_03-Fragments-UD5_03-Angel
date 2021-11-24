package com.angelblanco.examples.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Street(
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("number")
    @Expose
    val number: Int
)