package com.example.myapplicationtinosmark16

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the system navigation bar (immersive mode)
        val decorView = window.decorView
        val uiOptions = (
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_FULLSCREEN
                )
        decorView.systemUiVisibility = uiOptions

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        val pagerAdapter = MyPagerAdapter(supportFragmentManager)

        // Add WebViewFragment instances to the adapter
        pagerAdapter.addFragment(fragment1(), "ΑΡΧΙΚΗ")
        pagerAdapter.addFragment(fragment2(), "ΦΑΡΜΑΚΕΙΟ")
        pagerAdapter.addFragment(fragment3(), "ΒΕΝΖΙΝH")
        pagerAdapter.addFragment(fragment4(), "Tinos Today")

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}

