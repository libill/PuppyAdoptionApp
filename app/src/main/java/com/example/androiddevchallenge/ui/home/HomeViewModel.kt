package com.example.androiddevchallenge.ui.home

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.repository.DogRepository

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: home viewModel
 * SinceVer: 1.0.0
 */
internal class HomeViewModel : ViewModel() {
    private val dogRepository = DogRepository
    val dogList = dogRepository.dogList

    fun updateCurrentDog(dog: Dog?) {
        dogRepository.currentDog = dog
    }
}