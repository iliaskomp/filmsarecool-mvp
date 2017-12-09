package com.iliaskomp.filmsarecool.data.network;

import com.iliaskomp.filmsarecool.data.model.response.FilmDetailsResponse;
import com.iliaskomp.filmsarecool.data.wrapper.FilmsWrapper;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface TmdbClient {

    @GET("movie/popular")
    Single<FilmsWrapper> popularFilms();

    @GET("movie/{movie_id}")
    Call<FilmDetailsResponse> filmDetails();
}
