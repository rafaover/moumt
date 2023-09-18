package com.feeltheboard.moumt.data

data class Task(
    val id: Int,
    val label: String,
    var checked: Boolean = false
)
