package com.example.praktam_2417051013

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktam_2417051013.data.MbtiPage
import com.example.praktam_2417051013.mbti.MbtiMainApp
import com.example.praktam_2417051013.mbti.PersonalityDetailScreen
import com.example.praktam_2417051013.ui.theme.PrakTAM_2417051013Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM_2417051013Theme {
                val navController = rememberNavController()
                AppNavigation(navController = navController)
            }
        }
    }
}

@Composable
fun AppNavigation(navController: NavHostController) {
    var mbtiList by remember { mutableStateOf<List<MbtiPage>>(emptyList()) }
    
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            MbtiMainApp(navController = navController) { fetchedMbti ->
                mbtiList = fetchedMbti
            }
        }
        composable("detail/{nama}") { backStackEntry ->
            val nama = backStackEntry.arguments?.getString("nama")
            val mbti = mbtiList.find { it.nama == nama }

            if (mbti != null) {
                PersonalityDetailScreen(
                    mbti = mbti,
                    navController = navController
                )
            }
        }
    }
}
