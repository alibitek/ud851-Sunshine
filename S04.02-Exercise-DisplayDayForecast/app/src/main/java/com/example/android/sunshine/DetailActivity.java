package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherForecast = (TextView) findViewById(R.id.tv_weather_forecast);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        if (intent.hasExtra(FORECAST_SHARE_HASHTAG)) {
            String forecast = intent.getStringExtra(FORECAST_SHARE_HASHTAG);
            if (forecast != null) {
                mWeatherForecast.setText(forecast);
            }
        }
    }
}