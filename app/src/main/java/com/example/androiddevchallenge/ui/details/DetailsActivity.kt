package com.example.androiddevchallenge.ui.details

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val viewModel: DetailsViewModel = viewModel()
                viewModel.currentDog?.let {
                    DogDetails(it)
                }
            }
        }
    }
}
