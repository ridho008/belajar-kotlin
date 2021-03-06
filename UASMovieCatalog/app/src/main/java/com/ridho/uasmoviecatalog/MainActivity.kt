package com.ridho.uasmoviecatalog

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_movie.*

class MainActivity : AppCompatActivity() {
    var movies: List<Movie>? = null
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomView)
        val navController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.movieFragment, R.id.TVShowFragment, R.id.profileFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)



//        rv_movies_list.layoutManager = LinearLayoutManager(this)
//        rv_movies_list.setHasFixedSize(true)
//        getMovieData { movies : List<Movie> ->
//            rv_movies_list.adapter = MovieAdapter(movies, object : MovieAdapter.OnAdapterListener {
//                override fun onClick(result: Movie) {
//                    val intent = Intent(applicationContext, DetailMovieActivity::class.java)
//                    intent.putExtra(DetailMovieActivity.EXTRA_DATA, result)
//                    startActivity(intent)
//                }
//            })
//        }
    }

//    private fun getMovieData(callback: (List<Movie>) -> Unit){
//        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
//        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
//            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
//
//            }
//
//            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
//                movies = response.body()!!.movies
//                return callback(response.body()!!.movies)
//            }
//
//        })
//    }
//
//    private fun setupRecyclerView(){
//        movieAdapter = MovieAdapter(arrayListOf(), object : MovieAdapter.OnAdapterListener {
//            override fun onClick(result: Movie) {
//                val intent = Intent(applicationContext, DetailMovieActivity:: class.java)
//                intent.putExtra(DetailMovieActivity.EXTRA_DATA, result)
//                startActivity(intent)
//            }
//        })
//        rv_movies_list.apply {
//            layoutManager = LinearLayoutManager(context)
//            adapter = movieAdapter
//        }
//    }


}