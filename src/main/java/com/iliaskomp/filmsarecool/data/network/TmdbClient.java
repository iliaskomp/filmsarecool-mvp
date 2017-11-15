package com.iliaskomp.filmsarecool.data.network;

import com.iliaskomp.filmsarecool.data.model.response.FilmDetailsResponse;
import com.iliaskomp.filmsarecool.data.model.response.FilmPopularResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface TmdbClient {

    @GET("/movie/popular")
    Call<List<FilmPopularResponse>> popularFilms(
    );

    @GET("/movie/{movie_id}")
    Call<FilmDetailsResponse> filmDetails(
        @Query("apikey") String apiKey
    );
}
