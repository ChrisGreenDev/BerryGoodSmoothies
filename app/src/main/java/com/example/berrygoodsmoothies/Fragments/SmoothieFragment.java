package com.example.berrygoodsmoothies.Fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.berrygoodsmoothies.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SmoothieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SmoothieFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    FragmentManager fm;

    public SmoothieFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SmoothieFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SmoothieFragment newInstance(String param1, String param2) {
        SmoothieFragment fragment = new SmoothieFragment();
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
        View view = inflater.inflate(R.layout.fragment_smoothie, container, false);
        Button potassiumButton = view.findViewById(R.id.potassiumButton);
        potassiumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_smoothie_to_nav_clickable_home);
            }
        });

        Button vitaminCButton = view.findViewById(R.id.vitaminCButton);
        vitaminCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_smoothie_to_vitaminCFragment);
            }
        });

        Button vitaminAButton = view.findViewById(R.id.vitaminAButton);
        vitaminAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_smoothie_to_nav_vitamin_a);
            }
        });

        Button ironButton = view.findViewById(R.id.ironButton);
        ironButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_smoothie_to_nav_iron);
            }
        });

        Button calciumButton = view.findViewById(R.id.calciumButton);
        calciumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_smoothie_to_calciumFragment);
            }
        });

        TextView title = view.findViewById(R.id.menuTitle);
        TextView body = view.findViewById(R.id.menuDescription);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String fontSize = preferences.getString("fontSize", "small_font");

        //Font setting
        String font = preferences.getString("fontType", "baloo_font");
        Typeface balooFont = ResourcesCompat.getFont(getContext(), R.font.baloo);
        Typeface ubuntuFont = ResourcesCompat.getFont(getContext(), R.font.ubuntu);

        switch(font) {
            case "baloo_font":
                title.setTypeface(balooFont);
                body.setTypeface(balooFont);
                potassiumButton.setTypeface(balooFont);
                vitaminCButton.setTypeface(balooFont);
                vitaminAButton.setTypeface(balooFont);
                ironButton.setTypeface(balooFont);
                calciumButton.setTypeface(balooFont);
                break;
            case "ubuntu_font":
                title.setTypeface(ubuntuFont);
                body.setTypeface(ubuntuFont);
                potassiumButton.setTypeface(ubuntuFont);
                vitaminCButton.setTypeface(ubuntuFont);
                vitaminAButton.setTypeface(ubuntuFont);
                ironButton.setTypeface(ubuntuFont);
                calciumButton.setTypeface(ubuntuFont);
                break;
        }

        //Font size setting
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