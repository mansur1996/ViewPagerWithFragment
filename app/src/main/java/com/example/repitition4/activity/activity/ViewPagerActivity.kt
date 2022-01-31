package com.example.repitition4.activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.repitition4.R
import com.example.repitition4.activity.adapter.ViewPagerAdapter
import com.example.repitition4.activity.fragment.FirstFragment
import com.example.repitition4.activity.fragment.SecondFragment
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        initViews()
    }

    private fun initViews(){
        viewPager = findViewById(R.id.vp_viewpager)
        //setting up the adapter
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        // add the fragments
        viewPagerAdapter.add(FirstFragment(), "Page 1")
        viewPagerAdapter.add(SecondFragment(), "Page 2")
        //set the adapter
        viewPager.adapter = viewPagerAdapter
        //The Page (fragment) titles will be displayed in the tabLayout hence we need to set the page viewer
        // we use the setupWithViewPager()
        tabLayout = findViewById(R.id.tl_tab_lay)
        tabLayout.setupWithViewPager(viewPager)
    }
}