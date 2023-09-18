package com.feeltheboard.moumt.ui

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.feeltheboard.moumt.data.Task

class TaskViewModel: ViewModel() {
    private val _tasks = generateTaskList().toMutableStateList()
    val tasks: List<Task>
        get() = _tasks

    fun remove(item: Task) {
        _tasks.remove(item)
    }

    private fun generateTaskList() =
        List(20) {
            Task(it, "Task # $it")
        }

}