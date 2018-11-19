package com.example.mayada.homework4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mayada.homework4.Item
import com.example.mayada.homework4.R
import com.example.mayada.homework4.adapters.ItemAdapter
import kotlinx.android.synthetic.main.zodiac_sign_fragment.view.*

class ZodiacSignFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.zodiac_sign_fragment, container, false)
        val recyclerView = view.zodiac_sign_recycler_view
        val layoutManager = LinearLayoutManager(context)
        val items:ArrayList<Item> = ArrayList()
        items.add(Item("Aries", R.drawable.aries))
        items.add(Item("Taurus", R.drawable.taurus))
        items.add(Item("Gemini", R.drawable.gemini))
        items.add(Item("Cancer", R.drawable.cancer))
        items.add(Item("Leo", R.drawable.leo))
        items.add(Item("Virgo", R.drawable.virgo))
        items.add(Item("Libra", R.drawable.libra))
        items.add(Item("Scorpio", R.drawable.scorpio))
        items.add(Item("Sagittarius", R.drawable.sagittarius))
        items.add(Item("Capricorn", R.drawable.capricorn))
        items.add(Item("Aquarius", R.drawable.aquarius))
        items.add(Item("Pisces", R.drawable.pisces))
        val adapter = ItemAdapter(items)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        return view
    }
}