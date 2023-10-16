package com.example.jetpackcomposebasics

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebasics.ui.theme.HomeScreen
import com.example.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme
import com.example.jetpackcomposebasics.ui.theme.SootheBottomNavigation
import com.example.jetpackcomposebasics.ui.theme.SootheNavigationRail

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            MySootheApp(windowSizeClass)
        }
    }
}

@Composable
fun MySootheApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            MySootheAppPortrait()
        }
        WindowWidthSizeClass.Expanded -> {
            MySootheAppLandscape()
        }
    }
}

@Composable
fun MySootheAppPortrait() {
    JetpackComposeBasicsTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

@Preview
@Composable
fun MySootheAppPortraitPreview() {
    MySootheAppPortrait()
}

@Composable
fun MySootheAppLandscape() {
    JetpackComposeBasicsTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                SootheNavigationRail()
                HomeScreen()
            }
        }
    }
}


@Preview(uiMode = Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun MySootheAppLandscapePreview() {
    MySootheAppLandscape()
}













