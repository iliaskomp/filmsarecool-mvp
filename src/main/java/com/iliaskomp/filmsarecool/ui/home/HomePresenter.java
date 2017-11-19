package com.iliaskomp.filmsarecool.ui.home;

import com.iliaskomp.filmsarecool.data.DataManager;
import com.iliaskomp.filmsarecool.data.model.FilmPopular;

import java.util.List;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class HomePresenter implements HomeMvpPresenter {
    private HomeMvpView view;
    private DataManager dataManager;

    public HomePresenter(HomeMvpView view, DataManager dataManager) {
        this.view = view;
        this.dataManager = dataManager;
    }

    @Override
    public void getPopularMovies() {
        List<FilmPopular> popularFilms = dataManager.getPopularFilms();
        view.displayPopularFilms(popularFilms);
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
