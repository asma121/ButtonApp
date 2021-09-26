package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button
    lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun incdec(b:Button){
            var input=textView.text.toString().toInt()
            when(b){
                button1->input+=1
                button->input-=1
            }
            if (input>0){
                textView.setTextColor(Color.parseColor("#00FF00"))
            }else if (input<0){
                textView.setTextColor(Color.parseColor("#FF0000"))
            }else{
                textView.setTextColor(Color.parseColor("#000000"))
            }
            textView.text=input.toString()
        }

        textView = findViewById(R.id.textView)
        button=findViewById(R.id.button)
        button1=findViewById(R.id.button1)

        button.setOnClickListener(){

            incdec(button)
        }

        button1.setOnClickListener(){

            incdec(button1)

        }
    }
}