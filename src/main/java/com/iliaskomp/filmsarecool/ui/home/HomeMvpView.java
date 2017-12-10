package com.iliaskomp.filmsarecool.ui.home;

import com.iliaskomp.filmsarecool.data.model.FilmPopular;

import java.util.List;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface HomeMvpView {
    void displayPopularFilms(List<FilmPopular> popularFilms);

    void displayError();
}
