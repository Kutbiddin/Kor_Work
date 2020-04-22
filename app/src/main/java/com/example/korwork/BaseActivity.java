package com.example.korwork;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

public class BaseActivity extends AppCompatActivity {

    ImageButton services_for_hour,offers_for_hour,job_offer,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        services_for_hour = findViewById(R.id.services_for_hour);
        offers_for_hour = findViewById(R.id.offers_for_hour);
        job_offer = findViewById(R.id.job_offer);
        settings = findViewById(R.id.settings);

        offers_for_hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showForHour();
            }
        });
        offers_for_hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSettings();
            }
        });
    }

    private void showSettings() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Settings");

        LayoutInflater offer = LayoutInflater.from(this);
        View offers = offer.inflate(R.layout.activity_settigs, null);
        dialog.setView(offers);
    }

    private void showForHour() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Work");

        LayoutInflater offer = LayoutInflater.from(this);
        View offers = offer.inflate(R.layout.activity_base, null);
        dialog.setView(offers);
    }
}
