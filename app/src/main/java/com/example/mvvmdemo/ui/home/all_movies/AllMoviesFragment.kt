package com.example.mvvmdemo.ui.home.all_movies

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
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
import com.example.mvvmdemo.databinding.AllMoviesFragmentBinding
import com.example.mvvmdemo.ui.base.BaseFragment
import com.example.mvvmdemo.ui.base.IBaseRecyclerListener
import com.example.mvvmdemo.ui.details.MoviesDetailsActivity
import com.example.mvvmdemo.ui.home.MoviesAdapter
import com.example.mvvmdemo.utils.AppConstants
import com.example.mvvmdemo.utils.scrollWithManager
import com.example.mvvmdemo.utils.withNet

class AllMoviesFragment : BaseFragment(), IBaseRecyclerListener {

    companion object {
        fun newInstance() = AllMoviesFragment()
    }

    private lateinit var model: AllMoviesViewModel
    private var moviesAdapter: MoviesAdapter? = null
    private lateinit var binding: AllMoviesFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.all_movies_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = ViewModelProviders.of(this).get(AllMoviesViewModel::class.java)
        binding.model = model

        fetchMovies()
        observeEvents()
        createMoviesAdapter()

        binding.search.addTextChangedListener(object : TextWatcher{

            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                moviesAdapter?.filter?.filter(p0)
            }

        })
    }

    override fun onClick(view: View, position: Int, obj: Any) {
        val id = view.id
        val bean = obj as MovieWrapper.ResultsBean
        when(id) {
            R.id.imgFav -> {
                bean.isFavorite = !bean.isFavorite
                model.setFavorite(bean.id, bean.isFavorite)
                moviesAdapter?.updateMovie(position, bean)
            }
            R.id.rootLayout -> {
                MoviesDetailsActivity.viewMovieBean(activity!!, bean.id)
            }
        }
    }

    private fun observeEvents() {
        model.getProgress().observe(this, Observer {
            if (it!!) base().showProgress() else base().hideProgress()
        })

        model.getMovies()?.observe(this, Observer { movies ->
            Log.i(AppConstants.TAG,"called")
            moviesAdapter?.addMovies(movies)
        })
    }

    private fun createMoviesAdapter() {
        moviesAdapter = MoviesAdapter()
        moviesAdapter?.setListener(this)
        val manager = GridLayoutManager(context, 2, RecyclerView.VERTICAL, false)
        binding.rvMovies.apply {
            adapter = moviesAdapter
            layoutManager = manager
            scrollWithManager(manager) {
                if (!model.loading && binding.search.text.isNullOrEmpty()) {
                    fetchMovies()
                }
            }
        }
    }

    private fun fetchMovies() {
        base().withNet { model.fetchMovies() }
    }
}
