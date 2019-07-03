package com.example.khajasangram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewResturants;
    private RecyclerView recyclerViewFood;

    private RecyclerView.Adapter adapterRestaurant;
    private RecyclerView.Adapter adapterFood;

    private List<Restaurant> restaurants;
    private List<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Recycler View For the Nearby Restaurants
        recyclerViewResturants = findViewById(R.id.recyclerViewContainer);
        recyclerViewResturants.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("https://i.redd.it/qn7f9oqu7o501.jpg","Test Name","1.1km"));
        restaurants.add(new Restaurant("https://i.redd.it/j6myfqglup501.jpg","Best Name","1.5km"));

        adapterRestaurant = new  RestaurantAdapter(restaurants,this);
        recyclerViewResturants.setAdapter(adapterRestaurant);

//        Recycler View with staggered Grid Layout For the Food
        recyclerViewFood = (RecyclerView) findViewById(R.id.rvPopularFood); //rv For Recycler View
        recyclerViewFood.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        Create Data For foods.
        foods = new ArrayList<>();
        foods.add(new Food("1","Momo",2,400,"https://i.redd.it/qn7f9oqu7o501.jpg",2));
        foods.add(new Food("1","Chowmin",2,400,"https://i.redd.it/qn7f9oqu7o501.jpg",2));
        foods.add(new Food("1","Pizza",2,400,"https://i.redd.it/qn7f9oqu7o501.jpg",2));
        foods.add(new Food("1","Sandwitch",2,400,"https://i.redd.it/qn7f9oqu7o501.jpg",2));
//      Set Adapter
        adapterFood = new StaggeredViewAdapter(foods, MainActivity.this);
        recyclerViewFood.setAdapter(adapterFood);



    }
}
