package com.example.brandnewcars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView exit = findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        CardView harrier = findViewById(R.id.cardHARRIER);
        harrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, HarrierActivity.class));
            }
        });

        CardView mercedezBenz = findViewById(R.id.cardMERCEDEZBENZ);
        mercedezBenz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MercedesBenzActivity.class));
            }
        });

        CardView prado = findViewById(R.id.cardPRADO);
        prado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, PradoActivity.class));
            }
        });

        CardView subaruforester = findViewById(R.id.cardSUBARUFORESTER);
        subaruforester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SubaruForester.class));
            }
        });

        CardView v8 = findViewById(R.id.cardV8);
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, V8Activity.class));
            }
        });

    }
}