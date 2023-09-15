package com.feeltheboard.moumt.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.feeltheboard.moumt.R

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 2
    Text(
        text = stringResource(R.string.glasses_count, count),
        modifier = Modifier.padding(dimensionResource(R.dimen.default_padding))
    )
}
