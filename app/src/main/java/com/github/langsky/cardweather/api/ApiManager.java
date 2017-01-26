package com.github.langsky.cardweather.api;

import com.github.langsky.cardweather.CardWeather;
import com.github.langsky.cardweather.utils.C;
import com.github.langsky.cardweather.utils.NetworkState;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by swd1 on 17-1-26.
 */

public class ApiManager {

    public static class ApiHandler {

        private static Api api = new Retrofit.Builder()
                .baseUrl(C.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(HttpClientHandler.client)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Api.class);

        public static Api getApi() {
            return api;
        }
    }

    private static class HttpClientHandler {

        private static OkHttpClient client = new OkHttpClient.Builder()
                .addNetworkInterceptor(CACHE_CONTROL_INTERCEPTOR)
                .addInterceptor(CACHE_CONTROL_INTERCEPTOR)
                .cache(cache)
                .build();

        public static OkHttpClient getClient() {
            return client;
        }
    }

    private static Interceptor CACHE_CONTROL_INTERCEPTOR = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response originalResponse = chain.proceed(chain.request());
            if (NetworkState.isNetworkAvailable(CardWeather.instance)) {
                int maxAge = 60;
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader("Cache-Control")
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .build();
            } else {
                int maxStale = 60 * 60 * 24 * 28;
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .removeHeader("Cache-Control")
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .build();
            }
        }
    };

    private static File httpCacheDir = new File(CardWeather.instance.getCacheDir(), "WeatherCache");
    private static long cacheSize = 10 * 1024 * 1024;
    private static Cache cache = new Cache(httpCacheDir, cacheSize);

}

