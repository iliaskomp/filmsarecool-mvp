package com.iliaskomp.filmsarecool.data.model.response;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class FilmDetailsResponse {
    private boolean adult;
    private String backdropPath;
    private Object belongsToCollection;
    private int budget;
    private ArrayList<Genre> genres;
    private String homepage;
    private int id;
    private String imdbId;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private double popularity;
    private String posterPath;
    private String releaseDate;
    private int revenue;
    private int runtime;
    private String status;
    private String tagline;
    private String title;
    private boolean video;
    private double voteAverage;
    private int voteCount;



    private Bitmap posterImage;

    private String imdbRating;
    private String imdbVotes;

    private class Genre {
        int id;
        String name;

        public String getName() {
            return name;
        }
    }

}
