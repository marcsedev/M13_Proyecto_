package com.example.m13_proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.m13_proyecto.adapter.AlumnadoAdapter
import com.example.m13_proyecto.databinding.ActivityRecyclerviewBinding


class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerviewBinding

    //atributos que vamos a mostrar de los/las alumnos/as
    //creamos una data class: modelo de datos para añadir información que queramos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleview()
        //val db = Firebase.firestore

    }

    fun initRecycleview(){
        //hacer scroll
        binding.rvListClass.layoutManager= LinearLayoutManager(this)
        //adaptador
        binding.rvListClass.adapter=AlumnadoAdapter(AlumnadoProvider.alumnadolists)

    }



}