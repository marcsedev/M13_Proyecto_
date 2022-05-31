package com.example.m13_proyecto.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.m13_proyecto.Student
import com.example.m13_proyecto.databinding.ItemStudentBinding

class AlumnadoViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemStudentBinding.bind(view)

    fun render(studentModel:Student){

        binding.studentName.text=studentModel.name
        //Glide.with(binding.intolerancias.context).load(studentModel.photo).into(binding.intolerancias)
        itemView.setOnClickListener { (Toast.makeText(
            binding.studentName.context,
            studentModel.name,
            Toast.LENGTH_SHORT
        )).show() }

    }
}