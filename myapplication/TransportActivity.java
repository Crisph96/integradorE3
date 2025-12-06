package com.abraham.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abraham.myapplication.adapters.TransportAdapter;
import com.abraham.myapplication.models.Transport;

import java.util.ArrayList;
import java.util.List;

public class TransportActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Transport> transports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        transports = new ArrayList<>();
        transports.add(new Transport("Aeropuerto CDMX", "Hotel Reforma", 450));
        transports.add(new Transport("Centro", "Playa del Carmen", 600));

        recyclerView.setAdapter(new TransportAdapter(this, transports));
    }
}
