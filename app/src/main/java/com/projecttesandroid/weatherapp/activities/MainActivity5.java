package com.projecttesandroid.weatherapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.fragment.WeatherFragment;


public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity, new WeatherFragment()).commit();
    }
}
