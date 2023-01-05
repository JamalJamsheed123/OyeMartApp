package com.yesnet.oyemart.features.onboarding.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.model.ParentProducts

class ParentMyAdapter(private val productlist: ArrayList<ParentProducts>) : RecyclerView.Adapter<ParentMyAdapter.MyViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.parent_item_row,
        parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productlist[position]
        holder.titleImage.setImageResource(currentItem.image)
        holder.tvheading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return productlist.size
   }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvheading : TextView = itemView.findViewById(R.id.oliHeading)

    }
}