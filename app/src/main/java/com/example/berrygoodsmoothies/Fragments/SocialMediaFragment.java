package com.example.berrygoodsmoothies.Fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.berrygoodsmoothies.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SocialMediaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SocialMediaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SocialMediaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SocialMediaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SocialMediaFragment newInstance(String param1, String param2) {
        SocialMediaFragment fragment = new SocialMediaFragment();
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
        View view = inflater.inflate(R.layout.fragment_social_media, container, false);

        Button boosterJuiceBtn = view.findViewById(R.id.boosterJuiceButton);
        boosterJuiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/boosterjuice/?hl=en"));
                startActivity(intent);
            }
        });

        Button nutrition519Btn = view.findViewById(R.id.nutrition519Button);
        nutrition519Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/nutrition519_/?hl=en"));
                startActivity(intent);
            }
        });

        Button freshiiBtn = view.findViewById(R.id.freshiiButton);
        freshiiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/freshii/?hl=en"));
                startActivity(intent);
            }
        });

        TextView title = view.findViewById(R.id.socialTitle);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());

        //Font setting
        String font = preferences.getString("fontType", "baloo_font");
        Typeface balooFont = ResourcesCompat.getFont(getContext(), R.font.baloo);
        Typeface ubuntuFont = ResourcesCompat.getFont(getContext(), R.font.ubuntu);

        switch(font) {
            case "baloo_font":
                title.setTypeface(balooFont);
                boosterJuiceBtn.setTypeface(balooFont);
                nutrition519Btn.setTypeface(balooFont);
                freshiiBtn.setTypeface(balooFont);
                break;
            case "ubuntu_font":
                title.setTypeface(ubuntuFont);
                boosterJuiceBtn.setTypeface(ubuntuFont);
                nutrition519Btn.setTypeface(ubuntuFont);
                freshiiBtn.setTypeface(ubuntuFont);
                break;
        }

        return view;
    }
}