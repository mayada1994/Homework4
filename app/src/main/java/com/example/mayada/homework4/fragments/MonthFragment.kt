package com.example.mayada.homework4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mayada.homework4.CustomItemDecoration
import com.example.mayada.homework4.Item
import com.example.mayada.homework4.R
import kotlinx.android.synthetic.main.month_fragment.view.*
import com.example.mayada.homework4.adapters.ItemAdapter

class MonthFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.month_fragment, container, false)
        val recyclerView = view.month_recycler_view
        val layoutManager = LinearLayoutManager(context)
        val items: ArrayList<Item> = ArrayList()
        items.add(Item("January", -1))
        items.add(Item("February", -1))
        items.add(Item("March", -1))
        items.add(Item("April", -1))
        items.add(Item("May", -1))
        items.add(Item("June", -1))
        items.add(Item("July", -1))
        items.add(Item("August", -1))
        items.add(Item("September", -1))
        items.add(Item("October", -1))
        items.add(Item("November", -1))
        items.add(Item("December", -1))
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(CustomItemDecoration(this.context!!))
        return view
    }
}