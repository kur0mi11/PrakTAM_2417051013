package com.example.praktam_2417051013.data

import androidx.annotation.DrawableRes

data class MbtiPage(
    val nama: String,
    val deskripsi: String,
    val sifatUtama: String, // Menggantikan 'harga' agar sesuai konsep MBTI
    @param:DrawableRes val imageRes: Int
)
