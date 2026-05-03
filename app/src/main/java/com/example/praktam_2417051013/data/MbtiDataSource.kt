package com.example.praktam_2417051013.data

import android.content.Context

object MbtiDataSource {
    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}
