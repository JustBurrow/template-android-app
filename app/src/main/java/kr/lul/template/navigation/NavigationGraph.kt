package kr.lul.template.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import kr.lul.template.ui.atom.TemplateTheme

@Composable
fun NavigationGraph() {
    TemplateTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "splash") {
            composable("splash") {
                NavSplashPage(navController)
            }
            composable("first") {
                NavFirstPage(navController)
            }
            composable(
                route = "second/{id}",
                arguments = listOf(
                    navArgument("id") {
                        type = NavType.IntType
                    }
                )
            ) {
                NavSecondPage(navController)
            }
        }
    }
}