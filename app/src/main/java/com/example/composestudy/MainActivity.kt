package com.example.composestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.composestudy.sample.sampleSections
import com.example.composestudy.ui.screens.HomeScreen
import com.example.composestudy.ui.theme.ComposeStudyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    ComposeStudyTheme {
        Surface {
            HomeScreen(
                sampleSections
            )
        }
    }
}

