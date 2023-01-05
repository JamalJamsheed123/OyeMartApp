package com.yesnet.oyemart.features.onboarding.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.yesnet.oyemart.R
import com.yesnet.oyemart.model.ChildModel2
import com.yesnet.oyemart.model.ChildModel3
import kotlinx.android.synthetic.main.activity_main.view.*

class ChildMyAdapter3(private val productlists3: ArrayList<ChildModel3>) : RecyclerView.Adapter<ChildMyAdapter3.MyViewHolder3>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder3 {
        val itemView3 = LayoutInflater.from(parent.context).inflate(
            R.layout.child_item_row3,
            parent, false
        )
        return MyViewHolder3(itemView3)
    }

    override fun onBindViewHolder(holder: MyViewHolder3, position: Int) {
        val currentItem = productlists3[position]
        holder.buttonText.text = currentItem.butText
    }

    override fun getItemCount(): Int {
        return productlists3.size
    }

    class MyViewHolder3(itemView3: View) : RecyclerView.ViewHolder(itemView3) {
        val buttonText: Button = itemView3.findViewById(R.id.catogory_text)

    }

}