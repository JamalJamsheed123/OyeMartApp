package com.yesnet.oyemart.features.onboarding.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.model.ChildModel2

class ChildMyAdapter2(private val productlists1: ArrayList<ChildModel2>) : RecyclerView.Adapter<ChildMyAdapter2.MyViewHolder2>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val itemView2 = LayoutInflater.from(parent.context).inflate(
            R.layout.child_item_row2,
            parent,false)
        return MyViewHolder2(itemView2)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val currentItem = productlists1[position]
        holder.titleImage2.setImageResource(currentItem.itemImage1)
    }

    override fun getItemCount(): Int {
        return productlists1.size
    }

    class MyViewHolder2(itemView2 : View) : RecyclerView.ViewHolder(itemView2)
    {
        val titleImage2 : ShapeableImageView = itemView2.findViewById(R.id.child_image2)

    }

}