package com.projecttesandroid.weatherapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.fragment.KrakowFragment;


public class HomeActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity4, new KrakowFragment()).commit();

    }
}