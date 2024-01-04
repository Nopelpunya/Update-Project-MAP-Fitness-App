package com.example.fnatic_fitness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LegAdapter(private val mList: List<Model>) : RecyclerView.Adapter<LegAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LegAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder (holder: ViewHolder, position : Int){
        val dataLeg = mList[position]
        holder.setupView(dataLeg.Title, dataLeg.Title_Description, dataLeg.Image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var TitleLegProgram : TextView
        var DescriptionLegProgram : TextView
        var ImageLegProgram : ImageView

        init {
            TitleLegProgram= view.findViewById(R.id.Judul_program)
            DescriptionLegProgram = view.findViewById(R.id.keterangan_program)
            ImageLegProgram = view.findViewById(R.id.imageprogram)
        }

        fun setupView(titleData: String, descriptionData: String, imageData : Int) {
            TitleLegProgram.text = titleData
            DescriptionLegProgram.text = descriptionData
            ImageLegProgram.setImageResource(imageData)
        }
    }
}