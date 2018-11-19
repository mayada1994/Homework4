package com.example.mayada.homework4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mayada.homework4.R
import kotlinx.android.synthetic.main.week_days_fragment.view.*


class WeekDayFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.week_days_fragment, container, false)
        val recyclerView = view.week_days_recycler_view
        val layoutManager = LinearLayoutManager(context)
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        return view
    }
}