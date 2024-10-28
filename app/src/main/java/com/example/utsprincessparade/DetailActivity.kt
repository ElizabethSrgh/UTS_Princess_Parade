package com.example.utsprincessparade

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mendapatkan data dari Intent
        val nama = intent.getStringExtra("NAMA_PRINCESS")
        val gambar = intent.getIntExtra("GAMBAR_PRINCESS", 0)
        val deskripsi = intent.getStringExtra("DESKRIPSI_PRINCESS")

        // Mengatur data ke dalam tampilan
        val imageView = findViewById<ImageView>(R.id.imageView_princess)
        val textViewNama = findViewById<TextView>(R.id.textView_nama)
        val textViewDeskripsi = findViewById<TextView>(R.id.textView_deskripsi)

        imageView.setImageResource(gambar)
        textViewNama.text = nama
        textViewDeskripsi.text = deskripsi
    }
}
