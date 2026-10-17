package com.footballkick.project11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamAdapter(private val teamList:ArrayList<Team>)
    : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>(){

    var onItemClick : ((Team) ->  Unit)? = null

    class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_team, parent, false)
        return TeamViewHolder(view)
    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = teamList[position]
        holder.imageView.setImageResource(team.image)
        holder.textView.text = team.name

        holder.itemView.setOnClickListener{
            Data.teamNumber=position
            onItemClick?.invoke(team)
        }
    }
}