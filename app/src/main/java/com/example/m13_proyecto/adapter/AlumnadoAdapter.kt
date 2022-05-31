package com.example.m13_proyecto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m13_proyecto.R
import com.example.m13_proyecto.Student

//estos son los métodos
class AlumnadoAdapter (private val studentList:List<Student>,) : RecyclerView.Adapter<AlumnadoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnadoViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return AlumnadoViewHolder(layoutInflater.inflate(R.layout.item_student, parent,false))
    }

    override fun onBindViewHolder(holder: AlumnadoViewHolder, position: Int) {
        val item = studentList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =studentList.size

//cambio2

}


