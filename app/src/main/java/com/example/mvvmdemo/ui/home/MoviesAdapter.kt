package com.example.mvvmdemo.ui.home

import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.databinding.LayoutMoviesItemBinding
import com.example.mvvmdemo.ui.base.IBaseRecyclerListener
import com.example.mvvmdemo.utils.AppConstants
import java.util.*

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(), Filterable {

    private var listener: IBaseRecyclerListener? = null
    private val movies: MutableList<MovieWrapper.ResultsBean>
    private var filteredMovies: MutableList<MovieWrapper.ResultsBean>
    private var moviesFilter : MoviesFilter?= null

    init {
        movies = ArrayList()
        filteredMovies = ArrayList()
    }

    fun addMovies(movies: List<MovieWrapper.ResultsBean>) {
        clearMovies()
        this.movies.addAll(movies)
        this.filteredMovies.addAll(movies)
        notifyDataSetChanged()
    }

    fun clearMovies() {
        this.movies.clear()
        this.filteredMovies.clear()
    }

    fun setListener(listener: IBaseRecyclerListener) {
        this.listener = listener
    }

    fun updateMovie(position: Int, bean: MovieWrapper.ResultsBean) {
        filteredMovies[position] = bean
        notifyItemChanged(position)
    }

    override fun getFilter(): Filter {

        if (moviesFilter == null){
            moviesFilter = MoviesFilter()
        }

        return moviesFilter!!
    }

    inner class MoviesFilter : Filter() {
        override fun performFiltering(constraint: CharSequence): Filter.FilterResults {
            val results = Filter.FilterResults()

            Log.i(AppConstants.TAG,"value $constraint")
            if (TextUtils.isEmpty(constraint)) {
                results.values = movies
            } else {
                val cities = ArrayList<MovieWrapper.ResultsBean>()
                for (bean in movies) {
                    if (bean.title.toLowerCase() == constraint.toString().toLowerCase() || bean.title.toLowerCase().contains(constraint.toString().toLowerCase())) {
                        cities.add(bean)
                    }
                }
                results.values = cities
            }
            return results
        }

        override fun publishResults(constraint: CharSequence, results: Filter.FilterResults) {
            filteredMovies = results.values as ArrayList<MovieWrapper.ResultsBean>
            Log.i(AppConstants.TAG,"value ${filteredMovies.size}")
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = DataBindingUtil.inflate<LayoutMoviesItemBinding>(LayoutInflater.from(parent.context), R.layout.layout_movies_item, null, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = filteredMovies[position]
        holder.binding.bean = movie
        holder.binding.executePendingBindings()

        holder.binding.imgFav.setOnClickListener(holder)
        holder.binding.rootLayout.setOnClickListener(holder)
    }

    override fun getItemCount(): Int {
        return filteredMovies.size
    }

    inner class MoviesViewHolder(val binding: LayoutMoviesItemBinding) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        override fun onClick(v: View) {
            listener?.onClick(v, adapterPosition, filteredMovies[adapterPosition])
        }
    }
}
