package com.iliaskomp.filmsarecool.ui.home;

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
