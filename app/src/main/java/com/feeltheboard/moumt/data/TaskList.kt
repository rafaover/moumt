package com.feeltheboard.moumt.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.feeltheboard.moumt.ui.components.StatefulTaskItem

/** Method to generate list of random tasks */
private fun generateTaskList() =
    List(30) {
        Task(it, "Task # $it")
    }

@Composable
fun TaskList(
    modifier: Modifier = Modifier,
    list: List<Task> = remember { generateTaskList() }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) {task ->
            StatefulTaskItem(taskName = task.label)
        }
    }
}