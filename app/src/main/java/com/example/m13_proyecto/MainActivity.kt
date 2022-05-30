package com.example.m13_proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.m13_proyecto.adapter.AlumnadoAdapter
import com.example.m13_proyecto.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //atributos que vamos a mostrar de los/las alumnos/as
    //creamos una data class: modelo de datos para añadir información que queramos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleview()

    }

    fun initRecycleview(){
        binding.rvListClass.layoutManager= LinearLayoutManager(this)
        binding.rvListClass.adapter=AlumnadoAdapter(AlumnadoProvider.alumnadolist)

    }



}