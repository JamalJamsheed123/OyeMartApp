package com.yesnet.oyemart.features.onboarding.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.model.ChildModel1


class ChildMyAdapter1(private val productlist1: ArrayList<ChildModel1>) : RecyclerView.Adapter<ChildMyAdapter1.MyViewHolder1>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder1 {
        val itemView1 = LayoutInflater.from(parent.context).inflate(
            R.layout.child_item_row1,
            parent,false)
        return MyViewHolder1(itemView1)
    }

    override fun onBindViewHolder(holder: MyViewHolder1, position: Int) {
        val currentItem = productlist1[position]
        holder.titleImage1.setImageResource(currentItem.childimage)
    }

    override fun getItemCount(): Int {
        return productlist1.size
    }

    class MyViewHolder1(itemView1 : View) : RecyclerView.ViewHolder(itemView1)
    {
        val titleImage1 : ShapeableImageView = itemView1.findViewById(R.id.child_image1)


    }

}