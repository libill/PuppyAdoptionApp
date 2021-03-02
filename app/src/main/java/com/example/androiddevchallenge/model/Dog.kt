package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: dog data class
 * SinceVer: 1.0.0
 */
data class Dog(
    val name: String,
    val description: String,
    val location: String,
    val age: String,
    val gender: String,
    val size: String,
    @DrawableRes val image: Int,
)