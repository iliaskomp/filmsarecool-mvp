package com.iliaskomp.filmsarecool.data;

import com.iliaskomp.filmsarecool.data.model.FilmPopular;
import com.iliaskomp.filmsarecool.data.network.ServiceGenerator;
import com.iliaskomp.filmsarecool.data.network.TmdbClient;
import com.iliaskomp.filmsarecool.data.wrapper.FilmsWrapper;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by IliasKomp on 16/11/17.
 */

public class AppDataManager implements DataManager {

    @Override
    public List<FilmPopular> getPopularFilms() {
        TmdbClient tmdbClient = ServiceGenerator.createService(TmdbClient.class);
        Call<FilmsWrapper> call = tmdbClient.popularFilms();

        call.enqueue(new Callback<FilmsWrapper>() {
            @Override
            public void onResponse(Call<FilmsWrapper> call, Response<FilmsWrapper> response) {
                List<FilmPopular> films = response.body().getFilmsList();
            }

            @Override
            public void onFailure(Call<FilmsWrapper> call, Throwable t) {
                System.out.println("RESPONSE ERROR" + call + t);
            }
        });
        return null;
    }
}
