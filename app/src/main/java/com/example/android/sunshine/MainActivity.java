/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.sunshine.data.SunshinePreferences;
import com.example.android.sunshine.utilities.SunshineDateUtils;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView tvWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        tvWeatherData = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] weatherList = {"11/8 6° Partly cloudy",
                "11/9 16° Mostly cloudy with a little rain",
                "11/10 19° Intervals of clouds and sun",
                "11/11 20° Partly cloudy",
                "11/12 18° Mostly cloudy with a little rain",
                "11/13 15° Intervals of clouds and sun",
                "11/14 14° Partly cloudy",
                "11/15 16° Mostly cloudy with a little rain",
                "11/16 12° Intervals of clouds and sun"};

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (int i = 0; i < weatherList.length; i++) {
            tvWeatherData.append(weatherList[i] + "\n\n\n");
        }
    }
}