package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.m13_proyecto.adapter.MensajeAdapter
import com.example.m13_proyecto.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        initRecycleviewMensajes()



    }

    override fun onBackPressed() {
        if (count == 0) {
            Toast.makeText(this, "Presiona otra vez para salir", Toast.LENGTH_SHORT).show()
            count++
        } else {
            showSplash()
        }
        object : CountDownTimer(3000, 1000) {
            override fun onTick(l: Long) {}
            override fun onFinish() {
                count = 0

            }
        }.start()

    }

    private fun showSplash(){//(email:String,password:PasswordType) {
        val splashIntent= Intent(this,Portada::class.java).apply{
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(splashIntent)

    }


    private fun initRecycleviewMensajes() {
        binding.rvMsg.layoutManager= LinearLayoutManager(this)
        binding.rvMsg.adapter= MensajeAdapter(MensajesProvider.mensajeList)
    }

    private fun setup() {
        binding.button.setOnClickListener{
            showClasslist()
        }
      }

    private fun showClasslist() {
        val classIntent= Intent(this,ElegirClases::class.java).apply{
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(classIntent)
    }
}