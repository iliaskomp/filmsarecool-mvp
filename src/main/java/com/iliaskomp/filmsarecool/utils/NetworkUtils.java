package com.iliaskomp.filmsarecool.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by IliasKomp on 15/11/17.
 */

public final class NetworkUtils {

  private NetworkUtils() {
  }

  public static boolean isNetworkConnected(Context context) {
    ConnectivityManager cm =
        (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
    return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
  }
}
