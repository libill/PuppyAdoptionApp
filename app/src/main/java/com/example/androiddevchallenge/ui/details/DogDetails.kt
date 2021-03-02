package com.example.androiddevchallenge.ui.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Dog
import kotlinx.coroutines.launch

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: dog details
 * SinceVer: 1.0.0
 */
@Composable
fun DogDetails(dog: Dog) {
    val coroutineScope = rememberCoroutineScope()
    val hostState = SnackbarHostState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(dog.name)
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState)
        }
    ) {
        Column(
            Modifier
                .fillMaxHeight()
                .fillMaxSize()
                .background(MaterialTheme.colors.secondary)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painterResource(dog.image),
                "Dog image ${dog.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Box {
                Column(Modifier.padding(16.dp, 8.dp)) {
                    Text("Name: ${dog.name}", style = MaterialTheme.typography.h5)
                    ProvideTextStyle(MaterialTheme.typography.body1) {
                        Text("Location: ${dog.location}")
                        Text("Age: ${dog.age}")
                        Text("Gender: ${dog.gender}")
                        Text("Size: ${dog.size}")
                        Text("Description: ${dog.description}")
                    }
                }
                Button(
                    {
                        coroutineScope.launch {
                            hostState.showSnackbar("You have adopted ${dog.name}")
                        }
                    },
                    Modifier
                        .align(Alignment.TopEnd)
                        .padding(12.dp)
                ) {
                    Text(text = "Adopt")
                }
            }
        }
    }
}

@Preview
@Composable
fun DogDetailsPreview() {
    DogDetails(
        Dog(
            "Puli", "The Puli is a compact dog of square proportion and medium build. Their gait at a trot is quick stepping, but not far reaching. The Puli is able to change directions instantly, and is often quick, agile, and even acrobatic. Their weatherproof coat consists of a soft, wooly, dense undercoat and a wavy or curly outer coat. This coat will form round or flattened cords, but it may also be brushed out.", "Sunnyvale, CA",
            "5", "girl", "small", R.drawable.puli
        )
    )
}