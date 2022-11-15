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

        smoothieItems.add(new SmoothieItem(R.drawable.bananajar, R.drawable.cbanana, "Banana Smoothie", "How can you say no to banana?", "\n\n1 banana\n" +
                "\n" +
                "1/2 orange, peeled and quartered\n" +
                "\n" +
                "1/3 cup Greek yogurt\n" +
                "\n" +
                "1/4 cup water or milk (dairy or non-dairy)\n" +
                "\n" +
                "1 to 2 teaspoons honey, optional\n\n"));

        smoothieItems.add(new SmoothieItem(R.drawable.carrotjar, R.drawable.ccarrot, "Super Carrot", "Delicious and good for the eyes!", "\n\n1 cup chopped carrots steamed and cooled if you do not have a high-power blender or to make extra smooth for kids\n\n" +
                "1/2 cup frozen sliced banana\n\n" +
                "1/2 cup plain Greek yogurt\n\n" +
                "1/2 cup unsweetened vanilla cashew milk unsweetened vanilla almond milk, or milk of your choice\n\n" +
                "1/4 cup frozen diced pineapple\n\n" +
                "2 tablespoons toasted walnuts\n\n" +
                "1 tablespoon flaked coconut optional\n\n" +
                "1/4 teaspoon cinnamon\n\n" +
                "Pinch nutmeg\n\n" +
                "shredded carrots, coconut, crushed walnuts for topping\n\n"));

        smoothieItems.add(new SmoothieItem(R.drawable.greenjar, R.drawable.cgreen, "Green Smoothie", "Not only healthy but tasty too!", "\n\n1 ½ cups unsweetened almond milk\n\n" +
                "2 cups spinach* frozen\n\n" +
                "1 medium banana frozen\n\n" +
                "1 cup fruit of choice**\n\n" +
                "Optional add ins: protein powder bee pollen, collagen, etc.\n\n"));

        smoothieItems.add(new SmoothieItem(R.drawable.mangojar, R.drawable.cmango, "Tropical Mango Smoothie", "Vacation in a cup!", "\n\n2 fresh mangoes or 2 cups of frozen mango\n\n" +
                "1 small frozen banana (or half of a large banana), you can use unfrozen if using frozen mango\n\n" +
                "½ cup milk, dairy or dairy-free\n\n" +
                "½ cup yogurt, dairy or dairy-free\n\n"));

        smoothieItems.add(new SmoothieItem(R.drawable.jartest3, R.drawable.cpear, "Pear Smoothie", "Three pear smoothie!", "\n" +
                "\n" +
                "1 medium ripe banana, sliced\n" +
                "\n" +
                "1 medium pear, seeded and diced\n" +
                "\n" +
                "2/3 cup almond milk\n" +
                "\n" +
                "2 to 4 slices fresh peeled ginger, or to taste\n" +
                "\n" +
                "2 tablespoons honey\n" +
                "\n" +
                "1/2 teaspoon pure vanilla extract\n" +
                "\n" +
                "1/4 teaspoon ground cinnamon, or to taste\n" +
                "\n" +
                "1 1/2 cups coarsely chopped kale\n" +
                "\n" +
                "1 cup ice\n" +
                "\n"));

        CustomMenuAdapterVitaminA adapter = new CustomMenuAdapterVitaminA(smoothieItems);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);


        return view;
    }
}