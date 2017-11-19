package com.iliaskomp.filmsarecool.data.model;

import com.iliaskomp.filmsarecool.data.model.response.FilmPopularResponse;

/**
 * Created by IliasKomp on 16/11/17.
 */

public class FilmPopular {
    private FilmPopularResponse filmPopularResponse;

    public FilmPopular(FilmPopularResponse filmPopularResponse) {
        this.filmPopularResponse = filmPopularResponse;
    }

    public String getTitle() {
        return filmPopularResponse.getTitle();
    }
}
