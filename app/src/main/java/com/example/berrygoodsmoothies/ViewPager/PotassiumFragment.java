package com.example.berrygoodsmoothies.ViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.berrygoodsmoothies.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PotassiumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PotassiumFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "name";
    private static final String ARG_PARAM2 = "photo";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;

    public PotassiumFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment FactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PotassiumFragment newInstance(String param1, int param2) {
        //FactFragment.newInstance("Cai", R.drawable.picOfCai);
        //Font.font("Times New Roman");
        PotassiumFragment fragment = new PotassiumFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_potassium, container, false);
        if(mParam1 != null){
            TextView textView =   view.findViewById(R.id.viewPagerTitle);
            textView.setText(mParam1);
        }
        if(mParam2 != 0){
            ImageView imageView = view.findViewById(R.id.viewPagerImage);
            imageView.setImageResource(mParam2);
        }

        return view;
    }
}