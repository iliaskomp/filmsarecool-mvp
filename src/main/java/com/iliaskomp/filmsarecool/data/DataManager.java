package com.iliaskomp.filmsarecool.data;

import com.iliaskomp.filmsarecool.data.model.wrapper.FilmsWrapper;

import io.reactivex.Single;

/**
 * Created by IliasKomp on 16/11/17.
 */

public interface DataManager {
    Single<FilmsWrapper> getPopularFilms();
}
