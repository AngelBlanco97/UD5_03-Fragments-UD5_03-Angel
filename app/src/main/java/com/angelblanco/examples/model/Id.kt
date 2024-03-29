package com.angelblanco.examples.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Id(
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("value")
    @Expose
    val value: String
)