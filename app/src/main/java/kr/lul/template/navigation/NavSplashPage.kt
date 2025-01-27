package kr.lul.template.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kr.lul.template.ui.page.SplashPage

@Composable
fun NavSplashPage(
    navController: NavController
) {
    Log.v(TAG, "#NavSplashPage args : navController=$navController")

    val scope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        scope.launch {
            delay(3000L)
            navController.navigate("first") {
                popUpTo("splash") {
                    inclusive = true
                }
            }
        }
    }

    SplashPage()
}