package com.abraham.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTours, btnVehicles, btnTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTours = findViewById(R.id.btnTours);
        btnVehicles = findViewById(R.id.btnVehicles);
        btnTransport = findViewById(R.id.btnTransport);

        btnTours.setOnClickListener(v -> startActivity(new Intent(this, ToursActivity.class)));
        btnVehicles.setOnClickListener(v -> startActivity(new Intent(this, VehiclesActivity.class)));
        btnTransport.setOnClickListener(v -> startActivity(new Intent(this, TransportActivity.class)));
    }
}
