package com.ridho.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        R.id.bottomView = diambil di file activity_main.xml
        val bottomnavigationView = findViewById<BottomNavigationView>(R.id.bottomView)
//        R.id.fragmentContainerView = di file activity_main.xml
        val navController = findNavController(R.id.fragmentContainerView)

        bottomnavigationView.setupWithNavController(navController)
    }

}