package com.iliaskomp.filmsarecool.ui.home.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.iliaskomp.filmsarecool.R;
import com.iliaskomp.filmsarecool.data.AppDataManager;
import com.iliaskomp.filmsarecool.data.DataManager;
import com.iliaskomp.filmsarecool.data.model.FilmPopular;
import com.iliaskomp.filmsarecool.ui.home.presenter.PopularFilmsPresenter;
import com.iliaskomp.filmsarecool.ui.home.presenter.PopularFilmsPresenterImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class PopularFilmsFragment extends Fragment implements PopularFilmsView {

    @BindView(R.id.grid_view_film_list)
    RecyclerView mPopularFilmsList;

    Unbinder unbinder;
    private PopularFilmsPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
        Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);

        DataManager dataManager = new AppDataManager();
        presenter = new PopularFilmsPresenterImpl(this, dataManager);
        presenter.getPopularMovies();

        mPopularFilmsList.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.unsubscribe();
    }

    @Override
    public void displayPopularFilms(List<FilmPopular> films) {
        PopularFilmsAdapter adapter = new PopularFilmsAdapter(films);
        mPopularFilmsList.setAdapter(adapter);
    }

    @Override
    public void displayError() {
        Toast.makeText(getActivity(), "There was an error retrieving data.", Toast.LENGTH_SHORT).show();
    }

    public static PopularFilmsFragment newInstance() {
        return new PopularFilmsFragment();
    }
}
