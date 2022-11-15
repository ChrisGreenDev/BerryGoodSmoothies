package com.example.berrygoodsmoothies.ListView2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.berrygoodsmoothies.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlavorsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlavorsFragment extends Fragment {
    ListView listView;
    ListView listView2;
    TextView flavorDefinition;
    TextView flavorTitleDefinition;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 ="param3";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    public FlavorsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlavorsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FlavorsFragment newInstance(String param1, String param2, int param3) {
        FlavorsFragment fragment = new FlavorsFragment();
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
        flavorTitleDefinition = view.findViewById(R.id.flavorTitleDef);
        flavorDefinition = view.findViewById(R.id.flavorDescription);
        listView = view.findViewById(R.id.flavorListView);
        ArrayList<Flavors> flavors = new ArrayList<>();
        ArrayList<Flavors> flavors2 = new ArrayList<>();
        flavors.add(new Flavors("Banana Smoothie", "A healthy banana smoothie full of potassium", R.drawable.bananajar));
        flavors.add(new Flavors("Strawberry Lemonade Smoothie", "A fresh and tasty fruit smoothie with a little zing from the lemon!", R.drawable.limejar));
        flavors.add(new Flavors("Mango Smoothie", "A tropical flavored smoothie.", R.drawable.mangojar));
        flavors.add(new Flavors("Green Smoothie", "A smoothie packed with vegetables. A healthy alternative.", R.drawable.greenjar));
        flavors.add(new Flavors("PassionFruit Smoothie", "A smoothie that tastes as good as it looks.", R.drawable.pearjar));
        flavors.add(new Flavors("Orchard Smoothie", "An apple explosion", R.drawable.applejar));
        flavors.add(new Flavors("Custom Smoothie", "Your smoothie, your way.", R.drawable.bananajar));

        listView.setAdapter(new CustomListViewAdapterTest(getContext(), flavors));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("LOOKHERE", "" + position);
                Flavors flavors1 = (Flavors) listView.getItemAtPosition(position);
                flavorTitleDefinition.setText(flavors1.getName());
                flavorDefinition.setText(flavors1.getDescription());

            }
        });


        listView.setAdapter(new CustomListViewAdapterTest(getContext(), flavors));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("LOOKHERE", "" + position);
                Flavors flavors1 = (Flavors) listView.getItemAtPosition(position);
                flavorTitleDefinition.setText(flavors1.getName());
                flavorDefinition.setText(flavors1.getDescription());

            }
        });

        return view;
    }
}