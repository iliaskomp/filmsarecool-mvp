package com.iliaskomp.filmsarecool.ui.home;

import com.iliaskomp.filmsarecool.data.model.response.FilmPopularResponse;
import com.iliaskomp.filmsarecool.data.network.ServiceGenerator;
import com.iliaskomp.filmsarecool.data.network.TmdbClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class HomePresenter implements HomeMvpPresenter {
    private HomeMvpView view;

    public HomePresenter(HomeMvpView view) {
        this.view = view;
    }

    @Override
    public void getPopularMovies() {
        TmdbClient tmdbClient = ServiceGenerator.createService(TmdbClient.class);
        Call<List<FilmPopularResponse>> call = tmdbClient.popularFilms();

        call.enqueue(new Callback<List<FilmPopularResponse>>() {
            @Override
            public void onResponse(Call<List<FilmPopularResponse>> call, Response<List<FilmPopularResponse>> response) {
                System.out.println(response);
                view.displayPopularFilms();
            }

            @Override
            public void onFailure(Call<List<FilmPopularResponse>> call, Throwable t) {
                view.displayError();
            }
        });

    }

    @Override
    public void onSearch(String query) {

    }

    @Override
    public void onRequestCompleted() {

    }

    @Override
    public void onRequestError() {

    }
}
