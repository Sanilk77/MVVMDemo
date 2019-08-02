package com.example.mvvmdemo.ui.home.favourite_movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.databinding.LayoutMoviesItemBinding
import com.example.mvvmdemo.ui.base.IBaseRecyclerListener
import java.util.*

class FavoriteAdapter : RecyclerView.Adapter<FavoriteAdapter.MoviesViewHolder>(){

    private var listener: IBaseRecyclerListener? = null
    private val movies: MutableList<MovieWrapper.ResultsBean>

    init {
        movies = ArrayList()
    }

    fun addMovies(movies: List<MovieWrapper.ResultsBean>) {
        clearMovies()
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    fun clearMovies() {
        this.movies.clear()
    }

    fun setListener(listener: IBaseRecyclerListener) {
        this.listener = listener
    }

    fun updateMovie(position: Int, bean: MovieWrapper.ResultsBean) {
        movies[position] = bean
        notifyItemChanged(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = DataBindingUtil.inflate<LayoutMoviesItemBinding>(LayoutInflater.from(parent.context), R.layout.layout_movies_item, null, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.bean = movie
        holder.binding.executePendingBindings()

        holder.binding.imgFav.setOnClickListener(holder)
        holder.binding.rootLayout.setOnClickListener(holder)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    inner class MoviesViewHolder(val binding: LayoutMoviesItemBinding) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        override fun onClick(v: View) {
            listener?.onClick(v, adapterPosition, movies[adapterPosition])
        }
    }
}
