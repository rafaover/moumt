package com.feeltheboard.moumt.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.feeltheboard.moumt.data.ListGenerator
import com.feeltheboard.moumt.data.TaskList
import com.feeltheboard.moumt.ui.components.StatefulWaterCounter

/** main screen composable */
@Composable
fun MoumtScreen(modifier: Modifier = Modifier) {
    var ListGenerator = ListGenerator()
    Column(modifier = modifier) {
        StatefulWaterCounter()
        var taskList = remember {
            ListGenerator.generateTaskList().toMutableStateList()
        }
        TaskList(modifier, taskList, onCloseTask = { task -> taskList.remove(task)})
    }
}

