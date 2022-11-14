package com.example.berrygoodsmoothies.CustomMenuAdapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.berrygoodsmoothies.ClickableRecyclerView.SmoothieItem;
import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;

public class CustomMenuAdapterCalcium extends RecyclerView.Adapter<CustomMenuAdapterCalcium.CustomViewHolder>{

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);
        return new CustomViewHolder(view);
    }

    ArrayList<SmoothieItem> smoothieItems;

    public CustomMenuAdapterCalcium(ArrayList<SmoothieItem> smoothieItems){
        this.smoothieItems = smoothieItems;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        SmoothieItem currentItem = smoothieItems.get(position);
        holder.smoothieImage.setImageResource(currentItem.getDrawable());
        holder.smoothieName.setText(currentItem.getName());
        holder.smoothieIngredients.setText(currentItem.getIngredients());
    }

    @Override
    public int getItemCount() {
        return smoothieItems.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        protected ImageView smoothieImage;
        protected TextView smoothieName;
        protected TextView smoothieIngredients;

        public CustomViewHolder(@NonNull View itemView){
            super(itemView);
            this.smoothieName = itemView.findViewById(R.id.sName);
            this.smoothieImage = itemView.findViewById(R.id.sImage);
            this.smoothieIngredients = itemView.findViewById(R.id.sDescription);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            SmoothieItem currentItem = smoothieItems.get(getAdapterPosition());
            Bundle bundle = new Bundle();
            bundle.putString("NAME", currentItem.getName());
            bundle.putInt("DRAWABLE",currentItem.getDrawable());
            bundle.putString("INGREDIENTS",currentItem.getIngredients());
            Navigation.findNavController(v).navigate(R.id.action_calciumFragment_to_nav_detailed, bundle);
        }
    }
}
