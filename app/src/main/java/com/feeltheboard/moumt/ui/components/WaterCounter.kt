package com.feeltheboard.moumt.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.feeltheboard.moumt.R

/**
 * Composable to increase and show amount of glasses of water and Tasks
 */
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(dimensionResource(R.dimen.medium_padding))
    ) {
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            Text(text = stringResource(R.string.glasses_count, count))

            if (showTask) {
                TaskItem(
                    taskName = "Stand-up and Walk",
                    onClose = { showTask = false }
                )
            }
        }
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = dimensionResource(R.dimen.small_padding)),
            enabled = count < 10
        ) {
            Text(stringResource(R.string.drink_one_more))
        }
    }
}
