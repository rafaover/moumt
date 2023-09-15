package com.feeltheboard.moumt.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.feeltheboard.moumt.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = modifier.padding(dimensionResource(R.dimen.medium_padding))
    ) {
        Text(
            text = stringResource(R.string.glasses_count, count),
        )
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = dimensionResource(R.dimen.small_padding))
        ) {
            Text(stringResource(R.string.drink_one_more))
        }
    }
}
