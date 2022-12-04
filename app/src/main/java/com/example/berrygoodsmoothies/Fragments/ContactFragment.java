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
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        //Email Intent
        Button emailButton = view.findViewById(R.id.emailButton);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] emailAddresses = {"w0795059@myscc.ca"};
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, emailAddresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Questions about...");
                startActivity(intent);
            }
        });

        //Phone Intent
        Button callButton = view.findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5195144195"));
                startActivity(intent);
            }
        });

        //Text Intent
        Button textButton = view.findViewById(R.id.textButton);
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:5195144195"));
                startActivity(intent);
            }
        });

        /**
         * Settings section for text size and font type
         * Text size uses a string to get the size value
         * Font type uses Typeface to set the font throughout the application
         * The font type is set to the title, description and all buttons on this page
         */

        TextView title = view.findViewById(R.id.contactTitle);
        TextView description = view.findViewById(R.id.contactDescription);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String fontSize = preferences.getString("fontSize", "small_font");

        //Font setting
        String font = preferences.getString("fontType", "baloo_font");
        Typeface balooFont = ResourcesCompat.getFont(getContext(), R.font.baloo);
        Typeface ubuntuFont = ResourcesCompat.getFont(getContext(), R.font.ubuntu);

        switch(font) {
            case "baloo_font":
                title.setTypeface(balooFont);
                description.setTypeface(balooFont);
                emailButton.setTypeface(balooFont);
                callButton.setTypeface(balooFont);
                textButton.setTypeface(balooFont);
                break;
            case "ubuntu_font":
                title.setTypeface(ubuntuFont);
                description.setTypeface(ubuntuFont);
                emailButton.setTypeface(ubuntuFont);
                callButton.setTypeface(ubuntuFont);
                textButton.setTypeface(ubuntuFont);
                break;
        }

        //Font size setting
        switch(fontSize){
            case "small_font":
                description.setTextSize(getResources().getDimension(R.dimen.small_font));
                break;
            case "medium_font":
                description.setTextSize(getResources().getDimension(R.dimen.medium_font));
        }


        return view;
    }
}