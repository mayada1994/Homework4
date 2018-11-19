package com.example.mayada.homework4.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mayada.homework4.Item
import com.example.mayada.homework4.R

class ItemAdapter(var items: ArrayList<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.itemText.text = items[position].text
        viewHolder.itemImage.id = items[position].imageResourceId
        when (viewHolder.itemImage.id) {
            -1 -> viewHolder.itemImage.visibility = View.GONE
            else -> {
                viewHolder.itemImage.setImageResource(viewHolder.itemImage.id)
                viewHolder.itemImage.visibility = View.VISIBLE
            }
        }
    }


    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemText: TextView = itemView.findViewById(R.id.item_text)
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
    }
}