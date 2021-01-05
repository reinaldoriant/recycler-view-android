package com.example.recyclerview.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.model.Binarian

class MainActivity : AppCompatActivity() {
    private var rvMain: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf(
            Binarian("url", "Ghozi"),
            Binarian("url", "Aldo"),
            Binarian("url", "Agung"),
            Binarian("url", "Ilham"),
            Binarian("url", "Putut"),
            Binarian("url", "Lukas"),
            Binarian("url", "Karina"),
            Binarian("url", "Sams"),
            Binarian("url", "Sofi"),

            )
        val adapter = MainAdapter(data) {
            Toast.makeText(
                applicationContext, it.name, Toast.LENGTH_SHORT
            ).show()
        }
        rvMain = findViewById(R.id.rv_main)
        rvMain?.layoutManager = LinearLayoutManager(this)
        rvMain?.adapter = adapter
    }
}