package com.github.langsky.cardweather;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.langsky.cardweather.mvp.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PresenterImpl p = new PresenterImpl(this);
        p.getConditionInfo(1212653);
    }

}
