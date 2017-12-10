package com.iliaskomp.filmsarecool.ui.home.presenter;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface PopularFilmsPresenter {

    void getPopularMovies();

    void onSearch(String query);

    void unsubscribe();
}
