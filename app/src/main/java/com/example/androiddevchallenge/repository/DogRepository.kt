package com.example.androiddevchallenge.repository

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Dog

/**
 * Author: libill
 * Date: 2021/3/1
 * Desc: dog repository
 * SinceVer: 1.0.0
 */
internal object DogRepository {
    var currentDog: Dog? by mutableStateOf(null)
    val dogList by mutableStateOf(
        listOf(
            Dog(
                "Puli", "The Puli is a compact dog of square proportion and medium build. Their gait at a trot is quick stepping, but not far reaching. The Puli is able to change directions instantly, and is often quick, agile, and even acrobatic. Their weatherproof coat consists of a soft, wooly, dense undercoat and a wavy or curly outer coat. This coat will form round or flattened cords, but it may also be brushed out.", "West Virginia - WV",
                "5 years", "girl", "Small", R.drawable.puli
            ),
            Dog(
                "Pumi", "his corkscrew-curled coat, expressive semi-erect ears and quirky expression, the Pumi is undeniably cute with an affinity for both work and play. This Hungarian herding breed is medium-sized, compact and agile, always on alert and ready for action. Versatile and adaptable, the Pumi is used to herd cattle, sheep and swine, and is equally skilled at gathering, driving and keeping livestock within its boundaries as directed by the shepherd.", "West Virginia - WV",
                "2 years", "Female", "Small", R.drawable.pumi
            ),
            Dog(
                "Pyrenean Shepherd", "A small, sinewy, light-boned dog, the Pyrenean Shepherd is a superb athlete, incredibly agile and ready for action. The Rough-Faced Pyrenean Shepherd is clearly longer than tall; the Smooth-Face Pyrenean Shepherd appears more square. The Rough-Faced dog’s coat can be of almost flat demi-long or long hair. Demi-long dogs have culottes on their rump. Longhaired dogs have wooly hair that may cord, especially on the elbows and thighs. The hair on their muzzle lengthens toward the cheeks, giving a windblown look. The Smooth-Faced dog’s muzzle has short hair on the muzzle and legs, with the body hair 2 to 3 inches long on the body, and some feathering on the legs. The Pyrenean Shepherd’s flowing gait is said to “shave the earth.”", "Vermont - VT",
                "3 years", "Male", "Large", R.drawable.pyrenean_shepherd
            ),
            Dog(
                "Rat Terrier", "The Rat Terrier is historically known for protecting homes or farms from rodents. They are sturdy and compact little dog but also elegant. There are two sizes of Rat Terriers, but both are slightly longer than tall (but not short-legged) with a moderate build. Their coat is short and smooth. The American Hairless Terrier is derived from Rat Terriers with a hairless mutation.", "Vermont - VT",
                "1 years", "Male", "Small", R.drawable.rat_terrier
            ),
            Dog(
                "Rottweiler", "The Rottweiler is a medium large breed, slightly longer than they are tall, and robust with a powerful, substantial build. Historically, they combine the abilities that were necessary for jobs that entail great strength, agility, and endurance. Their trot is sure and powerful, with strong reach and drive. Their coat is straight, coarse, and dense. Their muzzle is short enough for strength but long enough for proper breathing and cooling. Their expression reflects some of their best traits; noble, alert, and self-assured.", "Kentucky - KY",
                "1 years", "Female", "Large", R.drawable.rottweiler
            ),
            Dog(
                "Saint Bernard", "The Saint Bernard is powerful and proportionately tall. They are strong and well-muscled, necessary qualities that, in the past, helped them to travel through deep snow. Their coat comes in two types: smooth, in which the short hair is very dense and tough, and long, in which the medium length hair is straight to slightly wavy. Their expression is often thought to appear intelligent.", "Kentucky - KY",
                "2 years", "Male", "Medium", R.drawable.saint_bernard
            )
        )
    )
}