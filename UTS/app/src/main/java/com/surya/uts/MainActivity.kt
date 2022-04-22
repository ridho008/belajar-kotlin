package com.surya.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.shoeharto,
                "Soeharto",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.kartini,
                "Kartini",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.shoekarno,
                "Soekarno",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.pangeran_diponegoro,
                "Pangeran Diponegoro",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.m_husni_thamrin,
                "M.Husni Thamrin",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.cutnyakdien,
                "Cut Nyak Dien",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.frans_kaisiepo,
                "Frans Kaisiepo",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.gator_mangkoepradja,
                "Gatot mangkoepradja",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.ki_hajar_dewantara,
                "Ki Hajar Dewantara",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
            Superhero(
                R.drawable.pattimura_pahlawan,
                "Pattimura",
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}