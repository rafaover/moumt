package com.feeltheboard.moumt.data

/** Method to generate list of random tasks */
private fun taskList() {
    List(30) {
        Task(it, "Task # $it")
    }
}