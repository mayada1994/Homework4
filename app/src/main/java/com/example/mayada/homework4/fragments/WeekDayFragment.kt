package com.example.mayada.homework4.fragments

import android.graphics.drawable.ClipDrawable
import android.graphics.drawable.InsetDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mayada.homework4.CustomItemDecoration
import com.example.mayada.homework4.Item
import com.example.mayada.homework4.R
import com.example.mayada.homework4.adapters.ItemAdapter
import kotlinx.android.synthetic.main.week_days_fragment.view.*


class WeekDayFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.week_days_fragment, container, false)
        val recyclerView = view.week_days_recycler_view
        val layoutManager = LinearLayoutManager(context)
        val items: ArrayList<Item> = ArrayList()
        items.add(Item("Sunday", -1))
        items.add(Item("Monday", -1))
        items.add(Item("Tuesday", -1))
        items.add(Item("Wednesday", -1))
        items.add(Item("Thursday", -1))
        items.add(Item("Friday", -1))
        items.add(Item("Saturday", -1))
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(CustomItemDecoration(this.context!!))
        return view
    }
}