package com.example.berrygoodsmoothies.Nutrients;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.berrygoodsmoothies.CustomMenuAdapters.CustomMenuAdapter;
import com.example.berrygoodsmoothies.ClickableRecyclerView.SmoothieItem;
import com.example.berrygoodsmoothies.CustomMenuAdapters.CustomMenuAdapterVitaminA;
import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VitaminAFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VitaminAFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VitaminAFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VitaminAFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VitaminAFragment newInstance(String param1, String param2) {
        VitaminAFragment fragment = new VitaminAFragment();
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
        View view = inflater.inflate(R.layout.fragment_vitamin_a, container, false);
        ArrayList<SmoothieItem> smoothieItems = new ArrayList<>();
        smoothieItems.add(new SmoothieItem(R.drawable.bananajar,"Banana Smoothie", "How can you say no to banana?"));
        smoothieItems.add(new SmoothieItem(R.drawable.carrotjar,"Super Carrot", "Delicious and good for the eyes!"));
        smoothieItems.add(new SmoothieItem(R.drawable.greenjar,"Green Smoothie", "Not only healthy but tasty too!"));
        smoothieItems.add(new SmoothieItem(R.drawable.mangojar,"Tropical Mango Smoothie", "Vacation in a cup!"));
        smoothieItems.add(new SmoothieItem(R.drawable.jartest3,"Pear Smoothie", "Three pear smoothie!"));

        CustomMenuAdapterVitaminA adapter = new CustomMenuAdapterVitaminA(smoothieItems);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


        return view;
    }
}