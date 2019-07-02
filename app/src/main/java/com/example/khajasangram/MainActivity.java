package com.example.khajasangram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Restaurant> restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("https://i.redd.it/qn7f9oqu7o501.jpg","Test Name","1.1km"));
        restaurants.add(new Restaurant("https://i.redd.it/j6myfqglup501.jpg","Best Name","1.5km"));

        adapter = new  RestaurantAdapter(restaurants,this);
        recyclerView.setAdapter(adapter);
    }
}
