package com.feeltheboard.moumt.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.feeltheboard.moumt.data.TaskList
import com.feeltheboard.moumt.ui.components.StatefulWaterCounter

/** main screen composable */
@Composable
fun MoumtScreen(
    modifier: Modifier = Modifier,
    taskViewModel: TaskViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulWaterCounter()
        TaskList(
            modifier = modifier,
            list = taskViewModel.tasks,
            onCloseTask = { task -> taskViewModel.remove(task) },
            onCheckedTask = { task, checked->
                taskViewModel.changeTaskWhenChecked(task, checked)
            }
        )
    }
}

