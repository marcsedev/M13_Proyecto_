package com.example.m13_proyecto.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.m13_proyecto.Mensaje
import com.example.m13_proyecto.databinding.ItemMensajeBinding

class MensajeViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemMensajeBinding.bind(view)

    fun render(mensajeModel: Mensaje){

        binding.mensajeName.text=mensajeModel.name
        binding.mensajeText.text=mensajeModel.text
        Glide.with(binding.imageMensaje.context).load(mensajeModel.photo).into(binding.imageMensaje)

    }
}