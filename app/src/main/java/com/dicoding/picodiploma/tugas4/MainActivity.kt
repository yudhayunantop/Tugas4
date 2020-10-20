package com.dicoding.picodiploma.tugas4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtnAdd = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtnAdd.setOnClickListener({
            Toast.makeText(this@MainActivity, "Pesanan Berhasil!", Toast.LENGTH_LONG).show()
        })

        val imgBtnCancel = findViewById<ImageButton>(R.id.imgButtonCancel)
        imgBtnCancel.setOnClickListener({
            Toast.makeText(this@MainActivity, "Pesanan Dibatalkan!", Toast.LENGTH_LONG).show()
        })
    }
}