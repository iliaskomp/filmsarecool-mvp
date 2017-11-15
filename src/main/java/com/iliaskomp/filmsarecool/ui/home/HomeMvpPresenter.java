package com.iliaskomp.filmsarecool.ui.home;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface HomeMvpPresenter {

    void getPopularMovies();

    void onSearch(String query);

    void onRequestCompleted();

    void onRequestError();
}
