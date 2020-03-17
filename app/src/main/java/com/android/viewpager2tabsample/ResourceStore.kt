package com.android.viewpager2tabsample

interface ResourceStore {
    companion object {
        val tabList = listOf(
            R.string.tab1, R.string.tab2, R.string.tab3, R.string.tab4
        )
        val pagerFragments = listOf(
            Tab1Fragment.create(), Tab2Fragment.create(),
            Tab3Fragment.create(), Tab4Fragment.create())
    }
}