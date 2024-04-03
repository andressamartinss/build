package com.example.appupdate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appupdate.ui.theme.AppUpdateTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCard()
        }
    }
}
@Composable
fun BirthdayCard() {
    MaterialTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Happy Birthday Sam", style = MaterialTheme.typography.headlineLarge)
            Text(text = "from Emma", style = MaterialTheme.typography.bodySmall)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewBirthdayCard() {
    BirthdayCard()
}