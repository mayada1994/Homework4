package com.example.mayada.homework4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.view.ViewPager




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById(R.id.view_pager) as ViewPager
        val adapter = CategoryAdapter(this, supportFragmentManager)
        viewPager.adapter = adapter
        tab_layout.setupWithViewPager(viewPager)
    }
}
