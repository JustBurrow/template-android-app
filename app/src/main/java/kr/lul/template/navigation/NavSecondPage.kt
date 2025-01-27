package kr.lul.template.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kr.lul.template.ui.page.SecondPage
import kr.lul.template.viewmodel.SecondViewModel

@Composable
fun NavSecondPage(
    navController: NavController = rememberNavController(),
    viewModel: SecondViewModel = hiltViewModel()
) {
    Log.v(TAG, "#NavSecondPage args : navController=$navController, viewModel=$viewModel")

    val data by viewModel.data.collectAsStateWithLifecycle()
    val onClickBack: () -> Unit = {
        navController.popBackStack()
    }

    SecondPage(data = data, onClickBack = onClickBack)
}