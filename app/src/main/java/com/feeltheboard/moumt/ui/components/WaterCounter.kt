package com.feeltheboard.moumt.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.feeltheboard.moumt.R

/**
 * Composable to increase and show amount of glasses of water and Tasks.
 * The role of the StatelessCounter is to display the count and call a function when you
 * increment the count. To do this, follow the pattern described above and pass the state,
 * count (as a parameter to the composable function), and a lambda (onIncrement), that is
 * called when the state needs to be incremented.
 */
@Composable
fun StatelessWaterCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(dimensionResource(R.dimen.medium_padding))
    ) {
        if (count > 0) {
            Text(text = stringResource(R.string.glasses_count, count))
        }
        Button(
            onClick = onIncrement,
            modifier = Modifier.padding(end = dimensionResource(R.dimen.small_padding)),
            enabled = count < 10
        ) {
            Text(stringResource(R.string.drink_one_more))
        }
    }
}

/**
 * StatefulCounter owns the state. That means that it holds the count state and modifies
 * it when calling the StatelessCounter function. Hoisted count from StatelessCounter to
 * StatefulCounter
 */
@Composable
fun StatefulWaterCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0)}
    StatelessWaterCounter(count = count, onIncrement = { count++ }, modifier)
}