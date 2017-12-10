package com.iliaskomp.filmsarecool.ui.home.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iliaskomp.filmsarecool.R;
import com.iliaskomp.filmsarecool.data.model.FilmPopular;

import java.util.List;

/**
 * Created by IliasKomp on 10/12/17.
 */

public class PopularFilmsAdapter extends RecyclerView.Adapter<PopularFilmsViewHolder>{
    private List<FilmPopular> films;

    public PopularFilmsAdapter(List<FilmPopular> films) {
        this.films = films;
    }

    @Override
    public PopularFilmsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_film_popular, parent, false);

        return new PopularFilmsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PopularFilmsViewHolder holder, int position) {
        holder.setFilmPopularInfo(films.get(position));
    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
