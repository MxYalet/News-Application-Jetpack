package com.example.newappjetpackcompose.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.newappjetpackcompose.presentation.onboarding.components.OnBoardingPage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen() {
    Column(modifier = Modifier.fillMaxSize()){
        val pageState = rememberPagerState(initialPage = 0) {
            pages.size
        }

        val buttonState = remember{
            derivedStateOf {
                when(pageState.currentPage){
                    0 -> listOf("","Next")
                    1 -> listOf("Back", "Next")
                    2 -> listOf("Back", "Get started")
                    else -> listOf("", "")
                }

            }
        }

        HorizontalPager(state = pageState) { index ->
            OnBoardingPage(page = pages[index])

        }
    }
}