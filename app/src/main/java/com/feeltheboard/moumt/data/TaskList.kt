package com.feeltheboard.moumt.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feeltheboard.moumt.ui.components.StatelessTaskItem

@Composable
fun TaskList(
    modifier: Modifier = Modifier,
    list: List<Task>,
    onCloseTask: (Task) -> Unit,
    onCheckedTask: (Task, Boolean) -> Unit
) {
    /* The composable function rememberLazyListState creates an initial state for the list using
    rememberSaveable. When the Activity is recreated, the scroll state is maintained without you
     having to code anything.
     */
    val lazyListState = rememberLazyListState()
    LazyColumn(
        modifier = modifier,
        state = lazyListState
    ) {
        items(
            items = list,
            key = { task -> task.id }
        ) { task ->
            StatelessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onClose = { onCloseTask(task) },
                onCheckedTask = { checked -> onCheckedTask(task, checked) }
            )
        }
    }
}