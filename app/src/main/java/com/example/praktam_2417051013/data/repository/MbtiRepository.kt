package com.example.praktam_2417051013.data.repository

import com.example.praktam_2417051013.data.api.RetrofitClient
import com.example.praktam_2417051013.data.model.MbtiPage

class MbtiRepository {
    suspend fun getMbti(): List<MbtiPage> {
        return try {
            RetrofitClient.instance.getMbti()
        } catch (e: Exception) {
            emptyList()
        }
    }
}
