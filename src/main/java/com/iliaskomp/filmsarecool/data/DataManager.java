package com.iliaskomp.filmsarecool.data;

import com.iliaskomp.filmsarecool.data.model.FilmPopular;

import java.util.List;

/**
 * Created by IliasKomp on 16/11/17.
 */

public interface DataManager {
    List<FilmPopular> getPopularFilms();
}
