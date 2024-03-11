package com.project.whatsappcomposeui.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.project.whatsappcomposeui.data.tabs
import com.project.whatsappcomposeui.ui.components.AppBarComponents
import com.project.whatsappcomposeui.ui.components.TabsComponents

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
        tabs.size
    }

    Column(Modifier.fillMaxSize()) {
        AppBarComponents()
        TabsComponents()
        HorizontalPager(state = pagerState) {
            when(it){
                0 -> ChatScreen()
                1 -> StatusScreen()
                2 -> CallScreen()
            }
        }
    }

}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}