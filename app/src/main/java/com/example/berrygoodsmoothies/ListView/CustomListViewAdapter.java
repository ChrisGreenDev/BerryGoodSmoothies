package com.example.berrygoodsmoothies.ListView;

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

public class CustomListViewAdapter extends ArrayAdapter<SmoothieType> {
    public CustomListViewAdapter(@NonNull Context context, ArrayList<SmoothieType> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SmoothieType item = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);
        }
        TextView name = convertView.findViewById(R.id.listViewTitle);
        name.setText(item.getListViewTitle());
        ImageView image = convertView.findViewById(R.id.listViewImage);
        image.setImageResource(item.getListViewImage());
        return convertView;
    }

}
