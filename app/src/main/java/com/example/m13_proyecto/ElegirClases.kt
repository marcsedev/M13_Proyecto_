package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m13_proyecto.databinding.ActivityElegirClasesBinding

class ElegirClases : AppCompatActivity() {

    private lateinit var binding: ActivityElegirClasesBinding
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding = ActivityElegirClasesBinding.inflate(layoutInflater)
                setContentView(binding.root)

                elegirclase()



    }

    private fun elegirclase() {
        binding.tvInf4.setOnClickListener{

       showList()
        }

    }

    private fun showList() {
        val listIntent= Intent(this,RecyclerViewActivity::class.java).apply{
            //putExtra("email",clase)
            //putExtra("password", password.name)
        }
        startActivity(listIntent)

    }

}