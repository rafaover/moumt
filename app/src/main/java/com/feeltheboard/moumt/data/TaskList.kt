package com.feeltheboard.moumt.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
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
    list: List<Task> = generateTaskList()
) {
    val lazyListState = rememberLazyListState()
    LazyColumn(
        modifier = modifier,
        state = lazyListState
    ) {
        items(list) { task ->
            StatefulTaskItem(taskName = task.label)
        }
    }
}