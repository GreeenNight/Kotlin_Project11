package com.footballkick.project11


import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val childList : List<ChildItem>) :
    RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    var onItemClick : ((ChildItem) -> Unit)? = null


    inner class ChildViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val image1 : ImageView = itemView.findViewById(R.id.firstTeam)
        val image2 : ImageView = itemView.findViewById(R.id.secondTeam)
        val ourTeam : TextView = itemView.findViewById(R.id.ourTeam)
        val opponentTeam : TextView = itemView.findViewById(R.id.opponentTeam)
        val score : TextView = itemView.findViewById(R.id.scoreTv)
        val date : TextView = itemView.findViewById(R.id.dateTv)
        val constraintLayout : ConstraintLayout = itemView.findViewById(R.id.constraintLayout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)


        return ChildViewHolder(view)
    }

    override fun getItemCount(): Int {
        return childList.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val child = childList[position]
        holder.image1.setImageResource(child.image1)
        holder.image2.setImageResource(child.image2)
        holder.ourTeam.text = child.ourTeam
        holder.opponentTeam.text = child.opponentTeam
        holder.score.text = child.score
        holder.date.text = child.date

        holder.itemView.setOnClickListener{


            Data.team1=child.ourTeam
            Data.team2=child.opponentTeam
            Data.image1=child.image1
            Data.image2=child.image2
            Data.finalScore=child.score
//            Data.finalScore="${child.ourTeam} ${child.score} ${child.opponentTeam}"
            Data.date=child.date
            Data.gameNumber=position

            onItemClick?.invoke(childList[position])
        }

        val gradientDrawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT, intArrayOf(
                ContextCompat.getColor(holder.constraintLayout.context,R.color.red),
                ContextCompat.getColor(holder.constraintLayout.context,R.color.neutral),
                ContextCompat.getColor(holder.constraintLayout.context,R.color.green)
            )
        )
        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT
        gradientDrawable.orientation = GradientDrawable.Orientation.LEFT_RIGHT
        gradientDrawable.gradientRadius = 0f

        val gradientDrawableGrey = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT, intArrayOf(
                ContextCompat.getColor(holder.constraintLayout.context,R.color.neutral),
                ContextCompat.getColor(holder.constraintLayout.context,R.color.neutral),
                ContextCompat.getColor(holder.constraintLayout.context,R.color.neutral)
            )
        )
        gradientDrawable.gradientType = GradientDrawable.LINEAR_GRADIENT
        gradientDrawable.orientation = GradientDrawable.Orientation.LEFT_RIGHT
        gradientDrawable.gradientRadius = 0f

        if (child.score.first() > child.score.last()) {
            gradientDrawable.orientation = GradientDrawable.Orientation.RIGHT_LEFT
            holder.constraintLayout.background = gradientDrawable
        } else if (child.score.first() < child.score.last()) {
            gradientDrawable.orientation = GradientDrawable.Orientation.LEFT_RIGHT
            holder.constraintLayout.background = gradientDrawable
        } else {
            holder.constraintLayout.background = gradientDrawableGrey
        }

    }
}