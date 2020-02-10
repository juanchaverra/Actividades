package com.juanchaverra.actividades

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_receptor.*

class Receptor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptor)


        var datosRecibidos = intent.extras
        Log.d("nombre", datosRecibidos?.getString("nombre"))
        Log.d("nota", datosRecibidos?.getInt("calificaciones").toString())

        var correo ="jdavid.chaverra@udea.edu.co"
        var password = "123456"

        var intent = Intent()
        intent.putExtra("correo",correo)
        intent.putExtra("password", password)
        setResult(Activity.RESULT_CANCELED)



    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        super.onBackPressed()
        finish()
    }

}
