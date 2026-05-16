package com.example.praktam_2417051013.data.model

import com.google.gson.annotations.SerializedName

data class MbtiPage(
    @SerializedName("nama")
    val nama: String? = null,

    @SerializedName("deskripsi")
    val deskripsi: String? = null,

    @SerializedName("sifatUtama")
    val sifatUtama: String? = null,

    @SerializedName("image_name")
    val imageUrl: String? = null,

    var isFavorite: Boolean = false
)
