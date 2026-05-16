package com.example.praktam_2417051013.data.api

import com.example.praktam_2417051013.data.model.MbtiPage
import retrofit2.http.GET

interface ApiService {
    @GET("data_mbti.json")
    suspend fun getMbti(): List<MbtiPage>
}
