package kr.lul.template.ui.page

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kr.lul.template.ui.state.SampleState

@Composable
fun SecondPage(
    data: SampleState?,
    onClickBack: () -> Unit = { }
) {
    Log.v(TAG, "#SecondPage args : data=$data, onClickBack=$onClickBack")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second Page", style = MaterialTheme.typography.displayLarge)

        if (null == data) {
            Text(text = "Loading...", Modifier.padding(16.dp))
        } else {
            Text(text = "$data", Modifier.padding(16.dp))
        }

        Button(onClick = onClickBack) {
            Text(text = "Go back")
        }
    }
}
