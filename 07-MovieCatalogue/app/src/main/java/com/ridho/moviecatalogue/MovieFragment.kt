package com.ridho.moviecatalogue

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

class MovieFragment : Fragment() {
    var movies: List<Movie> = null
    private lateinit var movieAdapter: MovieAdapter
    companion object {
        fun newInstance() = MovieFragment()
    }
    private lateinit var viewModel: MovieViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container:
        ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return
        inflater.inflate(R.layout.fragment_movie,
            container, false)
    }
    override fun
            onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieFragment::class.java)
        rv_movies_list.layoutManager =
            LinearLayoutManager(activity)
        rv_movies_list.setHasFixedSize(true)
        getMovieData { movies: List&lt;Movie&gt; -&gt;
            rv_movies_list.adapter =
                MovieAdapter(movies, object :MovieAdapter.OnAdapterListener {
                    override fun onClick(result: Movie)
                    {
                        val intent = Intent(activity,
                            DetailMovieActivity::class.java)
                        intent.putExtra(DetailMovieActivity.EXTRA_DATA,
                            result)
                        startActivity(intent)
                    }
                })
        }
    }
    private fun setupRecyclerView(){
        movieAdapter = MovieAdapter(arrayListOf(),
            object : MovieAdapter.OnAdapterListener {
                override fun onClick(result: Movie) {
                    val intent = Intent(activity,
                        DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_DATA,
                        result)
                    startActivity(intent)
                }
            })
        rv_movies_list.apply {
            layoutManager =
                LinearLayoutManager(context)
            adapter = movieAdapter
        }
    }
    private fun getMovieData(callback: (List&lt;Movie&gt;) -&gt; Unit){
        val apiService =
            MovieApiService.getInstance().create(MovieApiInterf
                    ace::class.java)
        apiService.getMovieList().enqueue(object :
            Callback&lt;MovieResponse&gt; {
            override fun onFailure(call:
                                   Call&lt;MovieResponse&gt;, t: Throwable) {
        }
            override fun onResponse(call:Call&lt;MovieResponse&gt;, response:
            Response&lt;MovieResponse&gt;) {
            movies = response.body()!!.movies
            return
            callback(response.body()!!.movies)
        }
        })
    }
}