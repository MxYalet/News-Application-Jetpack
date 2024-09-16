package com.example.newappjetpackcompose.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newappjetpackcompose.R

data class Page(
    val title: String,
    val description:String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "yoyoyo yooyoyo yoyoy",
        description = "This is just a dummy text of my printing and typsetting industry",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "yoyoyo yooyoyo yoyoy",
        description = "This is just a dummy text of my printing and typsetting industry",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "yoyoyo yooyoyo yoyoy",
        description = "This is just a dummy text of my printing and typsetting industry",
        image = R.drawable.onboarding3
    )

)
