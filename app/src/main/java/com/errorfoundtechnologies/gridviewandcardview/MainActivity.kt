package com.errorfoundtechnologies.gridviewandcardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cv1.setOnClickListener {
            Toast.makeText(this,"Cv1 clicked",LENGTH_SHORT).show()
        }
    }
}
