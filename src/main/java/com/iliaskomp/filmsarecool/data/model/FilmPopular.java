package com.iliaskomp.filmsarecool.data.model;

import com.iliaskomp.filmsarecool.data.model.response.FilmPopularResponse;

/**
 * Created by IliasKomp on 16/11/17.
 */

public class FilmPopular {
    private int id;
    private String title;
    private String posterPath;
    private String releaseDate;

    public FilmPopular(FilmPopularResponse filmPopularResponse) {
        this.id = filmPopularResponse.getId();
        this.title = filmPopularResponse.getTitle();
        this.posterPath = filmPopularResponse.getPosterPath();
        this.releaseDate = filmPopularResponse.getReleaseDate();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
