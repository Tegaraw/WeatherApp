package com.projecttesandroid.weatherapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.projecttesandroid.weatherapp.R;


public class HomeActivity extends AppCompatActivity {
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardView2 =(CardView) findViewById(R.id.cd2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca2 = new Intent(getApplication(),MainActivity2.class);
                startActivity(ca2);
            }
        });

        cardView1 =(CardView) findViewById(R.id.cd1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca1 = new Intent(getApplication(), MainActivity5.class);
                startActivity(ca1);
            }
        });
        cardView3 =(CardView) findViewById(R.id.cd3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca3 = new Intent(getApplication(),HomeActivity4.class);
                startActivity(ca3);
            }
        });
        cardView4 =(CardView) findViewById(R.id.cd4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca4 = new Intent(getApplication(),MainActivity6.class);
                startActivity(ca4);
            }
        });
        cardView5 =(CardView) findViewById(R.id.cd5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca5 = new Intent(getApplication(),MainActivity7.class);
                startActivity(ca5);
            }
        });
    }
}