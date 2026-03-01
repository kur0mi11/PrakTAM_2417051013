package com.example.praktam_2417051013

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.praktam_2417051013.mbti.MbtiApp
import com.example.praktam_2417051013.ui.theme.PrakTAM_2417051013Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051013Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MbtiApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
