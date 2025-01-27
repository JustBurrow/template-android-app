package kr.lul.template.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kr.lul.template.ui.page.FirstPage
import kr.lul.template.viewmodel.FirstViewModel

@Composable
fun NavFirstPage(
    navController: NavController = rememberNavController(),
    viewModel: FirstViewModel = hiltViewModel()
) {
    Log.v(TAG, "#NavFirstPage args : navController=$navController, viewModel=$viewModel")

    val list by viewModel.list.collectAsStateWithLifecycle()
    val onClick: (Int) -> Unit = {
        navController.navigate("second/$it")
    }

    FirstPage(list = list, onClick = onClick)
}