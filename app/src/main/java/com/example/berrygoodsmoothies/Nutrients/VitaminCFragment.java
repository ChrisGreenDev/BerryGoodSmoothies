package com.example.berrygoodsmoothies.Nutrients;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.berrygoodsmoothies.ClickableRecyclerView.SmoothieItem;
import com.example.berrygoodsmoothies.CustomMenuAdapters.CustomMenuAdapterVitaminC;
import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VitaminCFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VitaminCFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VitaminCFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VitaminCFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VitaminCFragment newInstance(String param1, String param2) {
        VitaminCFragment fragment = new VitaminCFragment();
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
        View view = inflater.inflate(R.layout.fragment_vitamin_c, container, false);
        ArrayList<SmoothieItem> smoothieItems = new ArrayList<>();
        smoothieItems.add(new SmoothieItem(R.drawable.ajar, R.drawable.capple, getString(R.string.appleName), getString(R.string.appleDescription), getString(R.string.appleIngredients), getString(R.string.appleServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.bjar, R.drawable.cbanana, getString(R.string.bananaName), getString(R.string.bananaDescription), getString(R.string.bananaIngredients), getString(R.string.bananaServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.cjar, R.drawable.ccarrot, getString(R.string.carrotName), getString(R.string.carrotDescription), getString(R.string.carrotIngredients), getString(R.string.carrotServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.gjar, R.drawable.cgreen, getString(R.string.greenName), getString(R.string.greenDescription), getString(R.string.greenIngredients), getString(R.string.greenServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.ljar,R.drawable.clime, getString(R.string.limeName), getString(R.string.limeDescription), getString(R.string.limeIngredients), getString(R.string.limeServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.mjar, R.drawable.cmango, getString(R.string.mangoName), getString(R.string.mangoDescription), getString(R.string.mangoIngredients), getString(R.string.mangoServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.pjar, R.drawable.cpear, getString(R.string.pearName), getString(R.string.pearDescription), getString(R.string.pearIngredients), getString(R.string.pearServing)));
        smoothieItems.add(new SmoothieItem(R.drawable.ajar, R.drawable.cstrawberry, getString(R.string.strawberryName), getString(R.string.strawberryDescription), getString(R.string.strawberryIngredients), getString(R.string.strawberryServing)));

        CustomMenuAdapterVitaminC adapter = new CustomMenuAdapterVitaminC(smoothieItems);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        Button webBtn = view.findViewById(R.id.webButtonVC);
        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yummly.com/recipes/pear-smoothie"));
                startActivity(intent);
            }
        });

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String fontSize = preferences.getString("fontSize", "small_font");

        //Font setting
        String font = preferences.getString("fontType", "baloo_font");
        Typeface balooFont = ResourcesCompat.getFont(getContext(), R.font.baloo);
        Typeface ubuntuFont = ResourcesCompat.getFont(getContext(), R.font.ubuntu);

        switch(font) {
            case "baloo_font":
                webBtn.setTypeface(balooFont);
                break;
            case "ubuntu_font":
                webBtn.setTypeface(ubuntuFont);
                break;
        }

        //Font size setting
        switch(fontSize){
            case "small_font":
                webBtn.setTextSize(getResources().getDimension(R.dimen.small_font));
                break;
            case "medium_font":
                webBtn.setTextSize(getResources().getDimension(R.dimen.medium_font));
        }

        return view;
    }
}