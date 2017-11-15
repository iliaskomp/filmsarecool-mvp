package com.iliaskomp.filmsarecool.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.iliaskomp.filmsarecool.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class HomeFragment extends Fragment implements HomeMvpView {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
        Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void displayPopularFilms() {

    }

    @Override
    public void displayError() {

    }

    static class ViewHolder {
        @BindView(R.id.grid_view_film_list)
        GridView mGridViewFilmList;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }
}
