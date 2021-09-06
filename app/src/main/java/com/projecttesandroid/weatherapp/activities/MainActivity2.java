package com.projecttesandroid.weatherapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.projecttesandroid.weatherapp.R;
import com.projecttesandroid.weatherapp.fragment.Activitymain2Fragment;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity2, new Activitymain2Fragment()).commit();
    }
    }
