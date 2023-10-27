package com.example.dav4

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterCls(private val broList :ArrayList<recyModel>) : RecyclerView.Adapter<adapterCls.LeViewHolder>() {


    class LeViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val broNameField : TextView = itemView.findViewById(R.id.textViu)
        val broNameOccupation : TextView = itemView.findViewById(R.id.textViu2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recviewrow, parent, false)
        return LeViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return broList.size
    }

    override fun onBindViewHolder(holder: LeViewHolder, position: Int) {
        val currentItem = broList[position]
        holder.broNameField.setText(currentItem.broName)
        holder.broNameOccupation.setText(currentItem.brOccupation)
    }
}