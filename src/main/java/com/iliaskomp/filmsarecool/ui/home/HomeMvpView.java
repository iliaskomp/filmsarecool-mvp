package com.iliaskomp.filmsarecool.ui.home;

import com.iliaskomp.filmsarecool.data.wrapper.FilmsWrapper;

/**
 * Created by IliasKomp on 15/11/17.
 */

public interface HomeMvpView {
    void displayPopularFilms(FilmsWrapper popularFilms);

    void displayError();
}
