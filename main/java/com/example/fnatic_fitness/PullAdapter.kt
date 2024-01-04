package com.example.fnatic_fitness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PullAdapter(private val mList: List<Model>) : RecyclerView.Adapter<PullAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PullAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder (holder: ViewHolder, position : Int){
        val dataPull = mList[position]
        holder.setupView(dataPull.Title, dataPull.Title_Description, dataPull.Image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var TitlePullProgram : TextView
        var DescriptionPullProgram : TextView
        var ImagePullProgram : ImageView

        init {
            TitlePullProgram= view.findViewById(R.id.Judul_program)
            DescriptionPullProgram = view.findViewById(R.id.keterangan_program)
            ImagePullProgram = view.findViewById(R.id.imageprogram)
        }

        fun setupView(titleData: String, descriptionData: String, imageData : Int) {
            TitlePullProgram.text = titleData
            DescriptionPullProgram.text = descriptionData
            ImagePullProgram.setImageResource(imageData)
        }
    }
}