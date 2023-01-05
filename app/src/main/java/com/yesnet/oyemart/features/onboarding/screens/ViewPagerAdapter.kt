package com.yesnet.oyemart.features.onboarding.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.model.PagesModel

class ViewPagerAdapter(private val images:List<PagesModel>): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {


    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val image:ImageView = itemView.findViewById(R.id.ivImage)
        val text:TextView = itemView.findViewById(R.id.pagerText)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.ViewPagerViewHolder{

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.ViewPagerViewHolder, position: Int) {

        val curImage = images[position]
        holder.text.text = curImage.text
        holder.image.setImageResource(curImage.imageName)

    }

    override fun getItemCount(): Int {
        return images.size
    }
}