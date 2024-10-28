package com.example.utsprincessparade

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengatur listener untuk setiap tombol princess
        val buttonMoana = findViewById<Button>(R.id.button_moana)
        buttonMoana.setOnClickListener {
            bukaDetailActivity("Moana", R.drawable.moana_image, getString(R.string.moana_description))
        }

        val buttonMulan = findViewById<Button>(R.id.button_mulan)
        buttonMulan.setOnClickListener {
            bukaDetailActivity("Mulan", R.drawable.mulan_image, getString(R.string.mulan_description))
        }

        // Tambahkan kode serupa untuk setiap princess lainnya...
    }

    private fun bukaDetailActivity(nama: String, gambar: Int, deskripsi: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("NAMA_PRINCESS", nama)
        intent.putExtra("GAMBAR_PRINCESS", gambar)
        intent.putExtra("DESKRIPSI_PRINCESS", deskripsi)
        startActivity(intent)
    }
}

}
}