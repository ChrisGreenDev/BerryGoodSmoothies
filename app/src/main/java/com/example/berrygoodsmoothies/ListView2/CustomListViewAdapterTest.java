package com.example.berrygoodsmoothies.ListView2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;

public class CustomListViewAdapterTest extends ArrayAdapter<com.example.berrygoodsmoothies.ListView2.Flavors> {
    public CustomListViewAdapterTest(@NonNull Context context, ArrayList<com.example.berrygoodsmoothies.ListView2.Flavors> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        com.example.berrygoodsmoothies.ListView2.Flavors item = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view2, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        name.setText(item.getName());
        TextView definition = convertView.findViewById(R.id.definition);
        definition.setText(item.getDescription());
        ImageView image = convertView.findViewById(R.id.testImage);
        image.setImageResource(item.getImage());
        return convertView;
    }
}
