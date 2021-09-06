package com.projecttesandroid.weatherapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.fragment.WroclawFragment;


public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity6, new WroclawFragment()).commit();
    }
}
