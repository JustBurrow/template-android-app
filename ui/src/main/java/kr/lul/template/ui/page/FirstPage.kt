package kr.lul.template.ui.page

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FirstPage(
    list: List<Int>,
    onClick: (Int) -> Unit = { }
) {
    Log.v(TAG, "#FirstPage args : list=$list, onClick=$onClick")

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First Page",
            modifier = Modifier.padding(0.dp, 32.dp),
            style = MaterialTheme.typography.displayLarge
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(list) { id ->
                Button(
                    onClick = { onClick(id) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Go to Second Page #$id")
                }
            }
        }
    }
}
