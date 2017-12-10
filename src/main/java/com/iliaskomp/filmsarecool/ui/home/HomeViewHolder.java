package com.iliaskomp.filmsarecool.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.iliaskomp.filmsarecool.R;
import com.iliaskomp.filmsarecool.data.model.FilmPopular;

/**
 * Created by IliasKomp on 10/12/17.
 */

public class HomeViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTextView;
    private ImageView posterImageView;

    public HomeViewHolder(View itemView) {
        super(itemView);

        titleTextView = itemView.findViewById(R.id.film_popular_title_text_view);
        posterImageView = itemView.findViewById(R.id.film_popular_poster_image_view);
    }

    public void setFilmPopularInfo(FilmPopular film) {
        titleTextView.setText(film.getTitle());
    }


}
