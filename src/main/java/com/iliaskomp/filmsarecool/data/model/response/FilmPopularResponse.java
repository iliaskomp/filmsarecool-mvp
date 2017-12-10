package com.iliaskomp.filmsarecool.data.model.response;

import java.util.ArrayList;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class FilmPopularResponse {
    private boolean adult;
    private String posterPath;
    private String overview;
    private String releaseDate;
    private ArrayList<Integer> genreIds;
    private int id;
    private String originalTitle;
    private String originalLanguage;
    private String title;
    private String backdropPath;
    private double popularity;
    private int voteCount;
    private boolean video;
    private double voteAverage;


    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getId() {
        return id;
    }
}
