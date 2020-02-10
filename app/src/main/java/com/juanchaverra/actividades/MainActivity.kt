package com.juanchaverra.actividades

import android.app.Activity
import android.app.Activity.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super .onStart()
        Log.d("método", "onStart")
    }

    override fun onResume(){
        super .onResume()
        Log.d("método", "onResume")
    }

    override fun onPause(){
        super .onPause()
        Log.d("método", "onPause")
    }

    override fun onStop(){
        super .onStop()
        Log.d("método", "onStop")
    }

    override fun onRestart(){
        super .onRestart()
        Log.d("método", "onRestart")
    }

    override fun onDestroy(){
        super .onDestroy()
        Log.d("método", "onDestroy")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.menu_overflow, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_abrir){
           // Toast.makeText(this, "Menu", Toast.LENGTH_LONG).show()
            var intent = Intent(this, Receptor::class.java)
            intent.putExtra("nombre", "Juan")
            intent.putExtra("calificaciones", 5)
            startActivityForResult(intent, 1234)
          //  startActivity(intent)
           // finish()

        }
        else if(item.itemId == R.id.area){
            var intent_area= Intent(this, AreaActivity::class.java)
            startActivity(intent_area)
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1234 && resultCode == Activity.RESULT_CANCELED) {
            Toast.makeText(this, "No envio nada", Toast.LENGTH_SHORT).show()
        }

        if (requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            Toast.makeText(this, data?.extras?.getString("correo"), Toast.LENGTH_SHORT).show()
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this, "Bye", Toast.LENGTH_SHORT)
    }

}
