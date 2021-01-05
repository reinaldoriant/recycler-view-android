package com.example.recyclerview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.model.Binarian

class MainAdapter(private val data: MutableList<Binarian>,
private val listener:(Binarian)->Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    //untuk menentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder =
        MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )


    //set data untuk ke dalam model
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val model = data[position]
        holder.bind(model)
        holder.itemView.setOnClickListener {
            listener(model)
        }
    }

    override fun getItemCount(): Int = data.size

    //Class Holder
    //pake fun bind untuk mempermudah untuk dibaca
    class MainViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var photo: ImageView = v.findViewById(R.id.photo)
        private var name: TextView = v.findViewById(R.id.name)

        //fun bind harusnya di onBindViewHolder
        fun bind(model: Binarian) {
            photo.setImageResource(R.drawable.ic_launcher_background)
            name.text = model.name
        }
    }

}
