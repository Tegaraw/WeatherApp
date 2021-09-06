package com.projecttesandroid.weatherapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.fragment.WarszawaFragment;


public class HomeActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity3, new WarszawaFragment()).commit();

    }
}