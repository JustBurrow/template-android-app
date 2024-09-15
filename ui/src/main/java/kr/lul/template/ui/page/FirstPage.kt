package kr.lul.template.ui.page

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kr.lul.template.viewmodel.FirstViewModel

@Composable
fun FirstPage(
    navController: NavController = rememberNavController(),
    viewModel: FirstViewModel = hiltViewModel()
) {
    Log.v(TAG, "#FirstPage args : navController=$navController, viewModel=$viewModel")

    val list by viewModel.list.collectAsStateWithLifecycle()

    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "First Page", style = MaterialTheme.typography.displayLarge)

        list.forEach { id ->
            Button(onClick = { navController.navigate("second/$id") }, modifier = Modifier.padding(8.dp)) {
                Text(text = "Go to Second Page #$id")
            }
        }
    }
}
