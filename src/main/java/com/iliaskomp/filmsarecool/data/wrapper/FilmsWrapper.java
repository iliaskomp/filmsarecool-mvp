package com.iliaskomp.filmsarecool.data.wrapper;

import com.google.gson.annotations.SerializedName;
import com.iliaskomp.filmsarecool.data.model.FilmPopular;
import com.iliaskomp.filmsarecool.data.model.response.FilmPopularResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IliasKomp on 19/11/17.
 */

public class FilmsWrapper {

    @SerializedName("results")
    private List<FilmPopularResponse> filmsResponse = new ArrayList<>();

    public List<FilmPopular> getFilmsList() {
        List<FilmPopular> films = new ArrayList<>();

        for (FilmPopularResponse f : filmsResponse) {
            FilmPopular film = new FilmPopular(f);
            films.add(film);
        }
        return films;
    }
}
