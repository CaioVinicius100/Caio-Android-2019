package com.example.intentedcomun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.phoneNumber
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.R.attr.phoneNumber
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {
            val number = editText2.text.toString()
            chamarDiscador(number)
        }

        btnCall.setOnClickListener {
            val number = editText2.text.toString()
            chamarTelefone(number)
        }

    }

    fun chamarDiscador(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    fun chamarTelefone(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}
