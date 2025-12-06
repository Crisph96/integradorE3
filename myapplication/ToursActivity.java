package com.abraham.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abraham.myapplication.adapters.TourAdapter;
import com.abraham.myapplication.models.Tour;

import java.util.ArrayList;
import java.util.List;

public class ToursActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Tour> tours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tours = new ArrayList<>();
        tours.add(new Tour("Tour a las Cascadas", "Chiapas", 1200));
        tours.add(new Tour("Tour Zona Arqueológica", "Teotihuacán", 900));

        recyclerView.setAdapter(new TourAdapter(this, tours));
    }
}
