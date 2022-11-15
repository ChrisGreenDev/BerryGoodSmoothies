package com.example.berrygoodsmoothies.ListView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SmoothieTypeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SmoothieTypeFragment extends Fragment {

    ListView listView;
    ListView listViewTtl;
    ListView listViewImg;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 ="param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    public SmoothieTypeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SmoothieTypeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SmoothieTypeFragment newInstance(String param1, String param2, int param3) {
        SmoothieTypeFragment fragment = new SmoothieTypeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_smoothie_type, container, false);
        listView = view.findViewById(R.id.flavorListView);
        listViewImg = view.findViewById(R.id.listViewImage);
        listViewTtl = view.findViewById(R.id.listViewTitle);
        ArrayList<SmoothieType> flavors = new ArrayList<>();
        flavors.add(new SmoothieType(R.drawable.bananajar,"Banana Smoothie"));
        flavors.add(new SmoothieType(R.drawable.applejar,"Apple Smoothie"));
        flavors.add(new SmoothieType(R.drawable.applejar,"Strawberry Smoothie"));
        flavors.add(new SmoothieType(R.drawable.mangojar,"Mango Smoothie"));
        flavors.add(new SmoothieType(R.drawable.jartest3,"Pear Smoothie"));
        flavors.add(new SmoothieType(R.drawable.greentopscreenimage,"Green Smoothie"));
        flavors.add(new SmoothieType(R.drawable.carrotjar,"Carrot Smoothie"));


        listView.setAdapter(new CustomListViewAdapter(getContext(), flavors));
        return view;
    }
}