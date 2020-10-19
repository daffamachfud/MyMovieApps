package com.onoh.mymovieapps.ui.home.featured

import androidx.lifecycle.ViewModel
import com.onoh.mymovieapps.data.popular.PopularedMoviesEntity
import com.onoh.mymovieapps.data.popular.ThisWeekEntity
import com.onoh.mymovieapps.utils.DataPopularedDummy

class FeaturedViewModel : ViewModel() {
    fun getThisWeekPopular():List<ThisWeekEntity> = DataPopularedDummy.generateDummyThisWeek()
    fun getPopularMovie():List<PopularedMoviesEntity> = DataPopularedDummy.generateDummyPopularMovies()
}