package com.footballkick.project11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextAdapter(private val textList:ArrayList<Text>)
    : RecyclerView.Adapter<TextAdapter.TextViewHolder>(){


    class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text, parent, false)
        return TextViewHolder(view)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        val text = textList[position]
        holder.textView.text = text.text

    }
}