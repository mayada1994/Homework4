package com.example.mayada.homework4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mayada.homework4.R
import kotlinx.android.synthetic.main.month_fragment.view.*

class MonthFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.month_fragment, container, false)
        val recyclerView = view.month_recycler_view
        val layoutManager = LinearLayoutManager(context)
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        return view
    }
}