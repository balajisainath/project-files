package com.example.ca1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        val radio_btn=findViewById<RadioButton>(R.id.radio)
        val check_box=findViewById<CheckBox>(R.id.checkbox)


        radio_btn.setOnClickListener {

            Toast.makeText(applicationContext, "RADIOBUTTON PRESSED", Toast.LENGTH_SHORT).show()
        }
        
        check_box.setOnClickListener {
            Toast.makeText(applicationContext, "CHECKBOX PRESSED", Toast.LENGTH_SHORT).show()
        }




    }
}