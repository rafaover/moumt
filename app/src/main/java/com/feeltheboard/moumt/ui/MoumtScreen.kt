package com.feeltheboard.moumt.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.moumt.ui.components.StatefulWaterCounter

/** main screen composable */
@Composable
fun MoumtScreen(modifier: Modifier = Modifier) {
    StatefulWaterCounter(modifier)
}