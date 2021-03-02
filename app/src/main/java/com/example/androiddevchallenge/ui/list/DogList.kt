package com.example.androiddevchallenge.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.repository.DogRepository
import com.example.androiddevchallenge.ui.theme.MyTheme

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: list
 * SinceVer: 1.0.0
 */
@Composable
fun DogList(dogs: List<Dog>, onDogClick: (Dog) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogItem(
                dog,
                Modifier
                    .clickable {
                        onDogClick(dog)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Card(modifier) {
        Box {
            Image(
                painterResource(dog.image),
                "Picture of dog: ${dog.name}",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(shape = RoundedCornerShape(5.dp)),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier.padding(8.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(dog.name, style = MaterialTheme.typography.h6)
                Text(dog.gender)
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    MyTheme {
        DogList(DogRepository.dogList)
    }
}