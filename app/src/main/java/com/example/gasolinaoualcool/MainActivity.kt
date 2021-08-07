package com.example.gasolinaoualcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(view: View) {
        val prcGas = etGasolina.text.toString().toDouble()
        val prcAlc = etAlcool.text.toString().toDouble()

        if (prcGas == null || prcAlc == null) {
            Toast.makeText(this, "Insira os valores", Toast.LENGTH_SHORT).show()
        } else {
            val razao = prcAlc / prcGas
            Resultado(razao)
        }
    }

    fun Resultado(razao: Double) {
        if (razao >= 0.7) {
            //tvResultado.setTextColor(R.color.money_green.toInt())
            tvResultado.setTextColor(ContextCompat.getColor(this, R.color.money_green))
            tvResultado.setText("GASOLINA")
        } else {
            //tvResultado.setTextColor(R.color.alc_red.toInt())
            tvResultado.setTextColor(ContextCompat.getColor(this, R.color.alc_red))
            tvResultado.setText("ÁLCOOL")
        }
    }
}