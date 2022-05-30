package com.example.m13_proyecto.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.m13_proyecto.Alumnado
import com.example.m13_proyecto.databinding.ItemAlumnadoBinding

class AlumnadoViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemAlumnadoBinding.bind(view)

    fun render(alumnadoModel:Alumnado){

        binding.tvSuperHeroName.text = alumnadoModel.superhero
        binding.tvRealName.text=alumnadoModel.realName
        binding.tvPublisher.text=alumnadoModel.publisher
        Glide.with(binding.ivHero.context).load(alumnadoModel.photo).into(binding.ivHero)
        itemView.setOnClickListener { (Toast.makeText(
            binding.ivHero.context,
            alumnadoModel.superhero,
            Toast.LENGTH_SHORT
        )).show() }

    }
}