package com.example.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemListBinding
import com.example.recyclerview.model.Star

class StarAdapter(private val starList:ArrayList<Star>):RecyclerView.Adapter<StarAdapter.StarViewHolder>() {
    class StarViewHolder(val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StarViewHolder(view)
    }

    override fun onBindViewHolder(holder: StarViewHolder, position: Int) {
        val star = starList[position]
        holder.binding.apply {
            imgView.setImageResource(star.image)
            txtName.text = star.name
            txtDesc.text = star.description
        }
    }

    override fun getItemCount(): Int {
        return starList.size
    }
}