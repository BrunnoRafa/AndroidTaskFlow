package com.brunorafael.taskflow.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.brunorafael.taskflow.ui.components.AddTaskButton
import com.brunorafael.taskflow.ui.components.EmptyState
import com.brunorafael.taskflow.ui.components.HomeTopBar

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        HomeTopBar()
        EmptyState()
        AddTaskButton()
    }
}