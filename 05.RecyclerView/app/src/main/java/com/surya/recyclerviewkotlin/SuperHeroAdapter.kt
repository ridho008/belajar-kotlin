package com.surya.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SuperHeroAdapter(private  val context: Context, private val superhero: List<SuperHero>, val listener: (SuperHero) -> Unit)
    : RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>(){
    class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        SuperHeroViewHolder(LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.
    }

    override fun getItemCount(): Int = superhero.size{
        TODO("Not yet implemented")
    }
}