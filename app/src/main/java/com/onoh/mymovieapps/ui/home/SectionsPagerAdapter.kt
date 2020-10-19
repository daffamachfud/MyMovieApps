package com.onoh.mymovieapps.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.onoh.mymovieapps.R
import com.onoh.mymovieapps.ui.home.documentary.DocumentaryFragment
import com.onoh.mymovieapps.ui.home.films.FilmsFragment
import com.onoh.mymovieapps.ui.home.origin.OriginFragment
import com.onoh.mymovieapps.ui.home.featured.FeaturedFragment
import com.onoh.mymovieapps.ui.home.series.SeriesFragment
import com.onoh.mymovieapps.ui.home.tvshow.TvShowFragment

class SectionsPagerAdapter (private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.featured,R.string.films,R.string.tvshow,R.string.series,R.string.origin,R.string.documentary)
    }

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> FeaturedFragment()
            1 -> FilmsFragment()
            2 -> TvShowFragment()
            3 -> SeriesFragment()
            4 -> OriginFragment()
            5 -> DocumentaryFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence? =
        mContext.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int = 6
}