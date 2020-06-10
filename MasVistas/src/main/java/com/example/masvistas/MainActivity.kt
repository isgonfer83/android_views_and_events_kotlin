package com.example.masvistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sePulsa(view: View) {
        salida?.text = (entrada?.text.toString().toFloat() * 2.0).toString()
    }

    fun sePulsa0(view: View) {
        entrada?.setText(entrada?.text.toString() + view.tag)
    }
}
