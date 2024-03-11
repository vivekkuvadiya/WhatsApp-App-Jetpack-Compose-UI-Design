package com.project.whatsappcomposeui.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.whatsappcomposeui.data.TabData
import com.project.whatsappcomposeui.data.tabs
import com.project.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabsComponents(
    pagerState: PagerState,
    onTabSelected: (Int) -> Unit,
) {

    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }

    LaunchedEffect(key1 = pagerState) {
        snapshotFlow { pagerState.currentPage }.collectLatest {
            selectedTabIndex = it
        }
    }

    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.surfaceTint,
        indicator = {
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(it[selectedTabIndex]),
                color = MaterialTheme.colorScheme.surfaceTint,
                height = 4.dp
            )
        }
    ) {
        tabs.forEachIndexed { index, tab ->
            Tab(
                selected = index == selectedTabIndex,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                },
                text = {
                    TabWithUnReadCount(tab)
                },
            )
        }
    }
}

@Composable
fun TabWithUnReadCount(tab: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabTitle(title = tab.title)
        tab.unreadCount?.let {
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = it.toString(), modifier = Modifier
                    .size(16.dp)
                    .background(
                        MaterialTheme.colorScheme.background,
                        CircleShape
                    ),
                style = TextStyle(
                    color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
            )
        }
    }
}

@Composable
fun TabTitle(title: String) {
    Text(text = title, style = TextStyle(fontSize = 16.sp))

}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
private fun TabsComponentsPreview() {
    WhatsAppComposeUITheme {

    }
}