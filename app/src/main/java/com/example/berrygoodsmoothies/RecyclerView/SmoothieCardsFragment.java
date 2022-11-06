package com.example.berrygoodsmoothies.RecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;

import com.example.berrygoodsmoothies.R;
import com.example.berrygoodsmoothies.pojo.Smoothie;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SmoothieCardsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SmoothieCardsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SmoothieCardsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SmoothieCardsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SmoothieCardsFragment newInstance(String param1, String param2) {
        SmoothieCardsFragment fragment = new SmoothieCardsFragment();
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
        View view = inflater.inflate(R.layout.fragment_smoothie_cards, container, false);
        ArrayList<Smoothie> smoothie = new ArrayList<>();
        smoothie.add(new Smoothie(R.drawable.newcarrotcard, "Carrot Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newapplecard, "Apple Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newmangocard, "Mango Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newgreencard, "Green Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newstrawberrycard, "Strawberry Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newbananacard, "Banana Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newlimecard, "Lime Smoothie"));
        smoothie.add(new Smoothie(R.drawable.newpearcard, "Pear Smoothie"));

        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new SmoothieRecyclerViewAdapter(smoothie));


        return view;
    }
}