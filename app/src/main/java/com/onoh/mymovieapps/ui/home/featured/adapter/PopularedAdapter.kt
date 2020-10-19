package com.onoh.mymovieapps.ui.home.featured.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.onoh.mymovieapps.R
import com.onoh.mymovieapps.data.popular.PopularedMoviesEntity
import kotlinx.android.synthetic.main.item_poster_potrait.view.*
import java.util.ArrayList

class PopularedAdapter : RecyclerView.Adapter<PopularedAdapter.PopularedViewHolder>() {

    private var listPopular = ArrayList<PopularedMoviesEntity>()

    fun setPopular(popular: List<PopularedMoviesEntity>?) {
        if (popular == null) return
        listPopular.clear()
        listPopular.addAll(popular)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_poster_potrait, parent, false)
        return PopularedViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularedViewHolder, position: Int) {
        val popular = listPopular[position]
        holder.bind(popular)
    }

    override fun getItemCount(): Int = listPopular.size


    class PopularedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(popular: PopularedMoviesEntity) {
            with(itemView) {
                tv_title_popular_movie.text = popular.title
                tv_desc_popular_movie.text = popular.description
//                setOnClickListener {
//                    val intent = Intent(context, DetailMovieActivity::class.java).apply {
//                        putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
//                    }
//                    context.startActivity(intent)
//                }
                Glide.with(context)
                    .load(popular.posterImage)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_error)
                            .error(R.drawable.ic_error))
                    .into(img_poster_popular_movies)
            }
        }
    }
}