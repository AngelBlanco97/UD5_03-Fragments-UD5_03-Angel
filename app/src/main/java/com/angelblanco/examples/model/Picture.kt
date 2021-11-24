package com.angelblanco.examples.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Picture(
    @SerializedName("large")
    @Expose
    val large: String,
    @SerializedName("medium")
    @Expose
    val medium: String,
    @SerializedName("thumbnail")
    @Expose
    val thumbnail: String
)