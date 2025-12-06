package com.abraham.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.abraham.myapplication.adapters.VehicleAdapter;
import com.abraham.myapplication.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehiclesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Vehicle> vehicles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda", "Civic", 850));
        vehicles.add(new Vehicle("Volkswagen", "Jetta", 780));

        recyclerView.setAdapter(new VehicleAdapter(this, vehicles));
    }
}
