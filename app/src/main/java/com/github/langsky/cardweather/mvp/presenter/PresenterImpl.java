package com.github.langsky.cardweather.mvp.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.github.langsky.cardweather.api.ApiManager;
import com.github.langsky.cardweather.bean.BaseInfo;
import com.github.langsky.cardweather.bean.CityInfo;
import com.github.langsky.cardweather.bean.ConditionInfo;
import com.github.langsky.cardweather.bean.ForecastInfo;


import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by swd1 on 17-1-26.
 */

public class PresenterImpl {

    private static final String TAG = "PresenterImpl";

    private Context context;

    public PresenterImpl(Context context) {
        this.context = context;
    }

    public void/*Observable<ConditionInfo>*/ getConditionInfo(int woeid) {

        ApiManager.ApiHandler.getApi().getConditionInfo("select item.condition from weather.forecast where woeid=2151330","json").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<ConditionInfo>() {
                    @Override
                    public void call(ConditionInfo conditionInfo) {
                        Log.e(TAG, "call: " + conditionInfo.getCondition().getText());
                        Toast.makeText(context, conditionInfo.getCondition().getText(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public Observable<ForecastInfo> getForecastInfo(int woeid) {
        return null;
    }

    public Observable<CityInfo> getLocationInfo(String info) {
        return null;
    }

    public Observable<BaseInfo> getBaseInfo(int woeid) {
        return null;
    }
}
