package com.github.langsky.cardweather.api;

import com.github.langsky.cardweather.bean.BaseInfo;
import com.github.langsky.cardweather.bean.CityInfo;
import com.github.langsky.cardweather.bean.ConditionInfo;
import com.github.langsky.cardweather.bean.ForecastInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by swd1 on 17-1-26.
 */


public interface Api {

    @GET("yql")
    Observable<ConditionInfo> getConditionInfo(@Query("q") String query, @Query("format") String format);

   /* @GET("yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20{woeid}%20and%20u=%22c%22&format=json")
    Observable<ForecastInfo> getForecastInfo(@Path("woeid") int woeid);

    @GET("yql?q=select%20woeid%2C%20name%2C%20admin1.content%2C%20country.content%20from%20geo.places%20where%20text%3D%22{info}%22&format=json")
    Observable<CityInfo> getLocationInfo(@Path("info") String info);

    @GET("yql?q=select%20units%2C%20location%2C%20wind%2C%20atomsphere%2C%20astronomy%20%2C%20item.condition%2C%20item.forecast%20from%20weather.forecast%20where%20woeid%3D{woeid}&format=json")
    Observable<BaseInfo> getBaseInfo(@Path("woeid") int woeid);*/


}
