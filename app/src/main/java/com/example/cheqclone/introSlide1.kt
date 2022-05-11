package com.example.cheqclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class introSlide1 : AppCompatActivity() {
    lateinit var viewPager : ViewPager
    var layouts: List<Int> = listOf(R.layout.slide1,R.layout.slide2,R.layout.slide3,R.layout.slide4)
    lateinit var mpagerAdaptor: mPagerAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_slide1)
        viewPager = findViewById(R.id.viewPager)
        mpagerAdaptor = mPagerAdaptor(this,layouts)
        viewPager.setAdapter(mpagerAdaptor)


    }
}
