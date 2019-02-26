package com.vsahin.viewpager2example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*

class ViewPagerAdapter(private val colors: IntArray) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))

    override fun getItemCount(): Int = colors.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.itemView.run {
        textView.text = "Page $position"
        container.setBackgroundResource(colors[position])
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)