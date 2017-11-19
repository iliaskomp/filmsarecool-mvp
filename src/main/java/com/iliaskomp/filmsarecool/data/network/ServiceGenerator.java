package com.iliaskomp.filmsarecool.data.network;

import com.iliaskomp.filmsarecool.utils.TmdbConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by IliasKomp on 13/11/17.
 */

public class ServiceGenerator {
    private static String apiBaseUrl = TmdbConfig.API_BASE_URL;

    private static Retrofit.Builder builder = new Retrofit.Builder()
        .baseUrl(apiBaseUrl)
        .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static Interceptor apiKeyInterceptor = createApiKeyInterceptor();

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();


    private ServiceGenerator() {
    }

    public static void changeApiBaseUrl(String newApiBaseUrl) {
        apiBaseUrl = newApiBaseUrl;
        builder = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(apiBaseUrl);
    }

    public static <S> S createService(Class<S> serviceClass) {
//        if (!httpClient.interceptors().contains(logging)) {
//            httpClient.addInterceptor(logging);
//            builder.client(httpClient.build());
//            retrofit = builder.build();
//        }

        if (!httpClient.interceptors().contains(apiKeyInterceptor)) {
            httpClient.addInterceptor(apiKeyInterceptor);
            builder.client(httpClient.build());
            retrofit = builder.build();
        }
        return retrofit.create(serviceClass);
    }

    private static Interceptor createApiKeyInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                HttpUrl httpUrl = original.url();

                HttpUrl newHttpUrl = httpUrl.newBuilder()
                    .addQueryParameter("api_key", TmdbConfig.API_KEY)
                    .build();

                Request.Builder requestBuilder = original.newBuilder().url(newHttpUrl);
                Request request = requestBuilder.build();

                return chain.proceed(request);
            }
        };
    }
}
