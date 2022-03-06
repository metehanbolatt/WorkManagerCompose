package com.metehanbolat.workmanagercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.workmanagercompose.ui.theme.WorkManagerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkManagerComposeTheme {

            }
        }
    }
}
