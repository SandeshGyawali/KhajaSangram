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

import java.util.List;

public class StaggeredViewAdapter extends RecyclerView.Adapter<StaggeredViewAdapter.GridHolder> {

    private List<Food> foods;
    private Context context;

    public StaggeredViewAdapter(List<Food> foods, Context context) {
        this.foods = foods;
        this.context = context;
    }

    @NonNull
    @Override
    public GridHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.staggered_gird_view,parent,false);
        GridHolder holder = new GridHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull GridHolder holder, int position) {
        Food food = foods.get(position);
        holder.textView.setText(food.getName());
        holder.imageView.setImageURI(Uri.parse(food.getImg_path()));
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class GridHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public GridHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivFoodImage);
            textView  = itemView.findViewById(R.id.tvFoodName);
        }
    }
}
