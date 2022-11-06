package com.example.berrygoodsmoothies.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.berrygoodsmoothies.R;
import com.example.berrygoodsmoothies.pojo.Smoothie;

import java.util.ArrayList;

public class SmoothieRecyclerViewAdapter extends RecyclerView.Adapter<SmoothieRecyclerViewAdapter.CustomViewHolder> {


    ArrayList<Smoothie> smoothie;

    public SmoothieRecyclerViewAdapter(ArrayList<Smoothie> smoothie){
        this.smoothie = smoothie;
    }

    @NonNull
    @Override
    public SmoothieRecyclerViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_row, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SmoothieRecyclerViewAdapter.CustomViewHolder holder, int position) {
        Smoothie smoothies = smoothie.get(position);
        holder.smoothieCard.setImageResource(smoothies.getSmoothieCard());
    }

    @Override
    public int getItemCount() {
        return smoothie.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected ImageView smoothieCard;

        public CustomViewHolder(View view){
            super(view);
            this.smoothieCard = view.findViewById(R.id.smoothieCardImage);
        }
    }
}
