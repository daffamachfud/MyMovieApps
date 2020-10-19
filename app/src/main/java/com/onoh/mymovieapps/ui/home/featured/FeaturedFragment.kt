package com.onoh.mymovieapps.ui.home.featured

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.onoh.mymovieapps.R
import com.onoh.mymovieapps.ui.home.featured.adapter.PopularedAdapter
import com.onoh.mymovieapps.ui.home.featured.adapter.ThisWeekAdapter
import kotlinx.android.synthetic.main.layout_popular_movies.*
import kotlinx.android.synthetic.main.layout_trending_wthis_week.*


class FeaturedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_featured, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(activity != null){
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[FeaturedViewModel::class.java]
            val thisWeek = viewModel.getThisWeekPopular()
            val popular = viewModel.getPopularMovie()

            val thisWeekAdapter = ThisWeekAdapter()
            val popularAdapter = PopularedAdapter()

            thisWeekAdapter.setMovie(thisWeek)
            with(rv_new_releases){
                layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
                setHasFixedSize(true)
                adapter = thisWeekAdapter
            }

            popularAdapter.setPopular(popular)
            with(rv_popular_movie){
                layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
                setHasFixedSize(true)
                adapter = popularAdapter
            }
        }


    }

}
