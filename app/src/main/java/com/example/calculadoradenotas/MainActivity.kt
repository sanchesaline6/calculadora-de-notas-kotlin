package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadoradenotas.databinding.ActivityMainBinding
import kotlinx.parcelize.Parcelize



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var btnCalcular = binding.btnCalcular

        btnCalcular.setOnClickListener{

            var nota1 = Integer.parseInt(binding.textNota1.text.toString())
            var nota2 = Integer.parseInt(binding.textNota2.text.toString())
            var faltas = Integer.parseInt(binding.textFaltas.text.toString())
            var media: Int = (nota1 + nota2)/2

            if(media >= 6 && faltas < 11){
                binding.textResultado.setText("Aluno foi Aprovado\nNota final: $media\nFaltas: $faltas")
                binding.textResultado.setTextColor(Color.GREEN)
            }
            else if(faltas > 10){
                binding.textResultado.setText("Aluno foi Reprovado por Falta\nNota final: $media\nFaltas: $faltas")
                binding.textResultado.setTextColor(Color.YELLOW)
            }
            else{
                binding.textResultado.setText("Aluno foi Reprovado\nNota final: $media\nFaltas: $faltas")
                binding.textResultado.setTextColor(Color.RED)
            }

        }


    }
}