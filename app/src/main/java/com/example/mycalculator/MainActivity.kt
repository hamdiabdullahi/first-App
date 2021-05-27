package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnc = findViewById<Button>(R.id.btnc)
        val btnb = findViewById<Button>(R.id.btnb)
        val btna = findViewById<Button>(R.id.btna)
        val btnd = findViewById<Button>(R.id.btnd)
        val tva = findViewById<TextView>(R.id.tva)
        val etc = findViewById<TextView>(R.id.etc)
        val etl = findViewById<TextView>(R.id.etl)




        btnc.setOnClickListener {
            if (etc.text.toString().equals("") || etl.text.toString().equals("")) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                val etc = etc.text.toString().toInt()
                val etl = etl.text.toString().toInt()
                val number = etc + etl
                tva.setText(number.toString())
            }
        }


        btna.setOnClickListener {
            if (etc.text.toString().equals("") || etl.text.toString().equals("")) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                val etc = etc.text.toString().toInt()
                val etl = etl.text.toString().toInt()
                val number = etc * etl
                tva.setText(number.toString())
            }
        }
        btnb.setOnClickListener {
            if (etc.text.toString().equals("") || etl.text.toString().equals("")) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                val etc = etc.text.toString().toInt()
                val etl = etl.text.toString().toInt()
                val number = etc - etl
                tva.setText(number.toString())
            }

        }


   btnd.setOnClickListener {
    if (etc.text.toString().equals("") || etl.text.toString().equals("")) {
        Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
    } else {
        val etc = etc.text.toString().toInt()
        val etl = etl.text.toString().toInt()
        val number = etc % etl
        tva.setText(number.toString())
    }

}}}



