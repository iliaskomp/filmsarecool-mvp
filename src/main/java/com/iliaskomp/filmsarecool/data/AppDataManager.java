package com.iliaskomp.filmsarecool.data;

import com.iliaskomp.filmsarecool.data.network.ServiceGenerator;
import com.iliaskomp.filmsarecool.data.network.TmdbClient;
import com.iliaskomp.filmsarecool.data.model.wrapper.FilmsWrapper;

import io.reactivex.Single;

/**
 * Created by IliasKomp on 16/11/17.
 */

public class AppDataManager implements DataManager {

    @Override
    public Single<FilmsWrapper> getPopularFilms() {
        TmdbClient tmdbClient = ServiceGenerator.createService(TmdbClient.class);
        return tmdbClient.popularFilms();
    }
}
