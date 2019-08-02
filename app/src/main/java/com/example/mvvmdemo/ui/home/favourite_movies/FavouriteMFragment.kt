package com.example.mvvmdemo.ui.home.favourite_movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.data.wrappers.MovieWrapper
import com.example.mvvmdemo.databinding.FavouriteMFragmentBinding
import com.example.mvvmdemo.ui.base.BaseFragment
import com.example.mvvmdemo.ui.base.IBaseRecyclerListener

class FavouriteMFragment : BaseFragment(), IBaseRecyclerListener {

    companion object {
        fun newInstance() = FavouriteMFragment()
    }

    private lateinit var model: FavouriteMViewModel
    private var moviesAdapter: FavoriteAdapter? = null
    private lateinit var binding: FavouriteMFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.favourite_m_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = ViewModelProviders.of(this).get(FavouriteMViewModel::class.java)

        observeEvents()
        createMoviesAdapter()
    }

    override fun onClick(view: View, position: Int, obj: Any) {
        val id = view.id
        when(id) {
            R.id.imgFav -> {
                val bean = obj as MovieWrapper.ResultsBean
                bean.isFavorite = !bean.isFavorite
                model.setFavorite(bean.id, bean.isFavorite)
                moviesAdapter?.updateMovie(position, bean)
            }
        }
    }

    private fun observeEvents() {
        model.getMovies()?.observe(this, Observer { movies ->
            if (movies.isEmpty()) {
                binding.rvMovies.visibility = View.GONE
                binding.lblNoRecords.visibility = View.VISIBLE
            } else {
                binding.rvMovies.visibility = View.VISIBLE
                binding.lblNoRecords.visibility = View.GONE
            }
            moviesAdapter?.addMovies(movies)
        })
    }

    private fun createMoviesAdapter() {
        moviesAdapter = FavoriteAdapter()
        moviesAdapter?.setListener(this)
        val manager = GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)
        binding.rvMovies.apply {
            adapter = moviesAdapter
            layoutManager = manager
        }
    }
}
