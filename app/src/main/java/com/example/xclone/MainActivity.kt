package com.example.xclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.xclone.bottom_navigation.BottomBarInvoke
import com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen.DrawerPanel
import com.example.xclone.bottom_navigation_screens.home_screen.top_bar_home_screen.TopAppBar
import com.example.xclone.bottom_navigation_screens.home_screen.top_navigation_bar.SetupNavGraphForHomeScreen
import com.example.xclone.ui.theme.XCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomBarInvoke()
//                    DrawerPanel()
                }
            }
        }
    }
}