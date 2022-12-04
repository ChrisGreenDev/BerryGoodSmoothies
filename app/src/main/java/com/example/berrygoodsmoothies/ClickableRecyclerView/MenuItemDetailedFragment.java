package com.example.berrygoodsmoothies.ClickableRecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.berrygoodsmoothies.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuItemDetailedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuItemDetailedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuItemDetailedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuItemDetailedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuItemDetailedFragment newInstance(String param1, String param2) {
        MenuItemDetailedFragment fragment = new MenuItemDetailedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_item_detailed, container, false);
        Bundle extras = getArguments();
        if(extras != null){
            TextView smoothieName = view.findViewById(R.id.smoothieName);
            smoothieName.setText(extras.getString("NAME"));
            ImageView smoothieImage = view.findViewById(R.id.smoothieImage);
            smoothieImage.setImageResource(extras.getInt("DRAWABLE"));
            TextView smoothieIngredients = view.findViewById(R.id.smoothieIngredients);
            smoothieIngredients.setText(extras.getString("INGREDIENTS"));
            TextView smoothieServing = view.findViewById(R.id.smoothieServing);
            smoothieServing.setText(extras.getString("SERVING"));
        }

        Button recipeButtonWeb = view.findViewById(R.id.smoothieLocationButton);
        recipeButtonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Uri location = Uri.parse("geo:42.31799457080979, -83.03851879593401?&q=Booster+Juice ");
               Intent intent = new Intent(Intent.ACTION_VIEW, location);
               startActivity(intent);
            }
        });

        TextView body = view.findViewById(R.id.smoothieIngredients);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String fontSize = preferences.getString("fontSize", "small_font");

        switch(fontSize){
            case "small_font":
                body.setTextSize(getResources().getDimension(R.dimen.small_font));
                break;
            case "medium_font":
                body.setTextSize(getResources().getDimension(R.dimen.medium_font));
        }
        return view;
    }
}