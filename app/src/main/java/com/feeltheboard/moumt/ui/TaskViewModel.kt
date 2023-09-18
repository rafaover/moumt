package com.feeltheboard.moumt.ui

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.feeltheboard.moumt.data.Task

class TaskViewModel: ViewModel() {
    private val _tasks = generateTaskList().toMutableStateList()
    val tasks: List<Task>
        get() = _tasks

    /** Method to remove a specific Task from a List */
    fun remove(item: Task) {
        _tasks.remove(item)
    }

    fun changeTaskWhenChecked(
        item: Task,
        checked: Boolean
    ) =
        tasks.find { it.id == item.id }?.let {task ->
            task.checked = checked
        }

    /** Method to generate a random list */
    private fun generateTaskList() =
        List(20) {
            Task(it, "Task # $it")
        }

}