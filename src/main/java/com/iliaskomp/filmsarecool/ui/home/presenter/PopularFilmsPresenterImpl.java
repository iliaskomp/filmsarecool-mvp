package com.iliaskomp.filmsarecool.ui.home.presenter;

import com.iliaskomp.filmsarecool.data.DataManager;
import com.iliaskomp.filmsarecool.data.model.wrapper.FilmsWrapper;
import com.iliaskomp.filmsarecool.ui.home.view.PopularFilmsView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by IliasKomp on 15/11/17.
 */

public class PopularFilmsPresenterImpl implements PopularFilmsPresenter {
    private PopularFilmsView view;
    private DataManager dataManager;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public PopularFilmsPresenterImpl(PopularFilmsView view, DataManager dataManager) {
        this.view = view;
        this.dataManager = dataManager;
    }

    @Override
    public void getPopularMovies() {
        compositeDisposable.add(
            dataManager.getPopularFilms()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<FilmsWrapper>() {
                    @Override
                    public void onSuccess(FilmsWrapper filmsWrapper) {
                        view.displayPopularFilms(filmsWrapper.getFilmsList());
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.displayError();
                        e.printStackTrace();
                    }
                })
        );
    }

    @Override
    public void onSearch(String query) {

    }

    @Override
    public void unsubscribe() {
        compositeDisposable.clear();
    }
}
