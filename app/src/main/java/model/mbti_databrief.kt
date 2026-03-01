package com.praktam_2417051013.model
import androidx.annotation.DrawableRes

data class mbti_databrief(
    val nama: String,
    val deksripsi: String, 
    @DrawableRes val imageRes: Int
)
