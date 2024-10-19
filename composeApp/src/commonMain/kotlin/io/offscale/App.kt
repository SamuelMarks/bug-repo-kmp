package io.offscale

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            val openDialog = remember { mutableStateOf(false) }
            Row {
                if (openDialog.value) {
                    BasicAlertDialog(onDismissRequest = { openDialog.value = false }) {
                        Surface(
                            modifier = Modifier.wrapContentWidth().wrapContentHeight(),
                            shape = MaterialTheme.shapes.large,
                            tonalElevation = AlertDialogDefaults.TonalElevation
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text("Hello")
                                Spacer(modifier = Modifier.height(24.dp))
                                Button(onClick = { openDialog.value = false }) {
                                    Text("Close")
                                }
                            }
                        }
                    }
                } else {
                    Text("World")
                }
            }
            Spacer(Modifier.fillMaxSize(0.8F))
            Row {
                Button(onClick = { openDialog.value = true }) {
                    Text("Open")
                }
            }
        }

    }
}