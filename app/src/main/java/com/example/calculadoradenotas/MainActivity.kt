package com.example.calculadoradenotas

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoradenotas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnCalcular = binding.btnCalcular

        btnCalcular.setOnClickListener{

            val nota1 = Integer.parseInt(binding.textNota1.text.toString())
            val nota2 = Integer.parseInt(binding.textNota2.text.toString())
            val faltas = Integer.parseInt(binding.textFaltas.text.toString())
            val media: Int = (nota1 + nota2)/2

            if(media >= 6 && faltas < 11){
                binding.textResultado.text = "Aluno foi Aprovado\nNota final: $media\nFaltas: $faltas"
                binding.textResultado.setTextColor(Color.GREEN)
            }
            else if(faltas > 10){
                binding.textResultado.text = "Aluno foi Reprovado por Falta\nNota final: $media\nFaltas: $faltas"
                binding.textResultado.setTextColor(Color.YELLOW)
            }
            else{
                binding.textResultado.text = "Aluno foi Reprovado\nNota final: $media\nFaltas: $faltas"
                binding.textResultado.setTextColor(Color.RED)
            }

        }


    }
}