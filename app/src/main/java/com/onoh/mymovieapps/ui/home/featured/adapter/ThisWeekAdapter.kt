package com.onoh.mymovieapps.ui.home.featured.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.onoh.mymovieapps.R
import com.onoh.mymovieapps.data.popular.ThisWeekEntity
import kotlinx.android.synthetic.main.item_poster_landscape.view.*
import java.util.ArrayList

class ThisWeekAdapter : RecyclerView.Adapter<ThisWeekAdapter.NewReleaseViewHolder>() {

    private var listNewRelease = ArrayList<ThisWeekEntity>()

    fun setMovie(thisWeeks: List<ThisWeekEntity>?) {
        if (thisWeeks == null) return
        listNewRelease.clear()
        listNewRelease.addAll(thisWeeks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewReleaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_poster_landscape, parent, false)
        return NewReleaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewReleaseViewHolder, position: Int) {
        val newRelease = listNewRelease[position]
        holder.bind(newRelease)
    }

    override fun getItemCount(): Int = listNewRelease.size


    class NewReleaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(thisWeek: ThisWeekEntity) {
            with(itemView) {
                tv_rating_movie.text = thisWeek.rating
//                setOnClickListener {
//                    val intent = Intent(context, DetailMovieActivity::class.java).apply {
//                        putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
//                    }
//                    context.startActivity(intent)
//                }
                Glide.with(context)
                    .load(thisWeek.posterImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_error)
                            .error(R.drawable.ic_error))
                    .into(img_poster_new_release)
            }
        }
    }
}