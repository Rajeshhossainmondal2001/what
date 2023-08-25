package com.example.whatsappopenerapk

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editText = findViewById<EditText>(R.id.et)

    }

    fun openWhatsapp(view: View) {
        var Value = editText.text.toString()
        whatsAppOpener(Value)
    }

    fun whatsAppOpener(number: String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$number")
        startActivity(intent)
    }
}