package com.brunorafael.taskflow.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.brunorafael.taskflow.ui.components.AddTaskButton
import com.brunorafael.taskflow.ui.components.EmptyState
import com.brunorafael.taskflow.ui.components.HomeTopBar

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            HomeTopBar()
        },
        floatingActionButton = {
            AddTaskButton()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            EmptyState()
        }
    }
}