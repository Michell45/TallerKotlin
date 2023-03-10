package com.mira.componentesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular: Button = findViewById(R.id.bntnCalcular)
        botonCalcular.setOnClickListener { realizarCalculo() }

    }

    private fun realizarCalculo() {
        val textview: EditText = findViewById<EditText>(R.id.editTextPersonName2)
        var text = textview.text.toString()
        val radioButton: RadioGroup = findViewById(R.id.radioGroup)
        val radio: Int = radioButton.checkedRadioButtonId
        val selectRadioButton: RadioButton = findViewById(radio)
        val textRadioG: String = selectRadioButton.text.toString()


        Toast.makeText(this, "$text, $textRadioG", Toast.LENGTH_LONG).show()

    }

}