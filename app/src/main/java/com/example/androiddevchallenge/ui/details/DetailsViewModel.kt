package com.example.androiddevchallenge.ui.details

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.repository.DogRepository

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: details repository
 * SinceVer: 1.0.0
 */
class DetailsViewModel : ViewModel() {
    private val dogRepository = DogRepository
    val currentDog get() = dogRepository.currentDog
}