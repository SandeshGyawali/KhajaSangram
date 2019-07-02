package com.example.khajasangram;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private List<Restaurant> restaurants;
    private Context context;

    public RestaurantAdapter(List<Restaurant> restaurants, Context context) {
        this.restaurants = restaurants;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_view_single_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Get a single restaurant from the List of Restaurant
        Restaurant restaurant = restaurants.get(position);

        holder.rest_name.setText(restaurant.getRestaurant_name());
        holder.distance.setText(restaurant.getDistance());
        holder.img_rest.setImageURI(Uri.parse(restaurant.getImageurl()));
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_rest;
        public TextView rest_name;
        public TextView distance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_rest = itemView.findViewById(R.id.img_restaurant);
            rest_name = itemView.findViewById(R.id.restaurant_name);
            distance = itemView.findViewById(R.id.distance);

        }
    }
}
