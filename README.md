# viewpager2tablayoutSample
This is a sample using viewpager and tablayout.

add viewpager2 and material

<code>
implementation 'androidx.viewpager2:viewpager2:1.0.0'
implementation 'com.google.android.material:material:1.2.0-alpha05'
</code>

and style

<code>
<style name="CustomTabText" parent="TextAppearance.Design.Tab">
    <item name="android:textSize">22sp</item>
    <item name="android:textStyle">bold</item>
</style>
</code>

and edit string.xml

<string name="tab1">first tab</string>
<string name="tab2">second tab</string>
<string name="tab3">third tab</string>
<string name="tab4">fourth tab</string>

add edit activity_main.xml

<code>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/white"
    android:orientation="vertical">

    <com.google.android.material.tabs.TabLayout
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        app:tabGravity="fill"
        app:tabMode="fixed"
        app:tabMaxWidth="0dp"
        app:tabIndicatorColor="@android:color/black"
        app:tabIndicatorHeight="5dp"
        android:background="#dddddd"
        app:tabSelectedTextColor="@android:color/holo_red_light"
        app:tabTextAppearance="@style/CustomTabText"
        android:layout_height="60dp" />

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/viewpager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</LinearLayout>
</code>

and create fragment1~4.kt

package com.android.viewpager2tabsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Tab1Fragment : Fragment() {

    override fun onCreateView (
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab1, container)
    }

    companion object {
        fun create(): Tab1Fragment {
            return Tab1Fragment()
        }
    }
}

and create fragment_tab1.xml ~ 4

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/tab1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

and create ResourceStore

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





