package com.example.androiddevchallenge.ui.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.ui.composable.DogList

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: home
 * SinceVer: 1.0.0
 */
@Composable
internal fun Home(onClick: (Dog) -> Unit = {}) {
    val viewModel: HomeViewModel = viewModel()
    val hostState = SnackbarHostState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Puppy Adoption")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState)
        }
    ) {
        DogList(viewModel.dogList) { dog ->
            viewModel.updateCurrentDog(dog)
            onClick(dog)
        }
    }
}