package com.juanchaverra.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_area.*

class AreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)


        bt_area.setOnClickListener {
            var lado = tv_lado.text.toString().toInt()
            tv_area.text = (lado * lado).toString()

        }
    }


}
