package com.example.praktam_2417051013.network

import com.example.praktam_2417051013.data.MbtiPage
import retrofit2.http.GET

interface ApiService {
    @GET("data_mbti.json")
    suspend fun getMbti(): List<MbtiPage>
}
