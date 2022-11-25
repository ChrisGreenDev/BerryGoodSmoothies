package com.example.berrygoodsmoothies.ViewPager;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.berrygoodsmoothies.R;

import java.util.Calendar;

public class CustomViewPagerAdapter extends FragmentStateAdapter {

    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
          position = position % 8;
        switch (position){
            case 0 : return CreditScreenFragment.newInstance("Home Screen Image Asset Created by Chris Green using Adobe Photoshop and Adobe illustrator.", R.drawable.homeiamge);
            case 1 : return CreditScreenFragment.newInstance("The image you see at the top of most screens is an image created by Chris Green using Adobe photoshop and Adobe Illustrator.", R.drawable.topimage);
            case 2 : return CreditScreenFragment.newInstance("The background image was created by Chris Green using Adobe Photoshop and Adobe Illustrator", R.drawable.background);
            case 3 : return CreditScreenFragment.newInstance("The bubble background was created and designed by Chris Green in Adobe Photoshop and Adobe Illustrator.", R.drawable.bubblebackground);
            case 4 : return CreditScreenFragment.newInstance("Launcher icon created by Chris Green in Adobe Photoshop and Adobe Illustrator", R.mipmap.jarsicon_round);
            case 5 : return CreditScreenFragment.newInstance("Jar icon was sourced and created by Chris Green. The original icon can be found here ", R.drawable.applejar);
            default : return CreditScreenFragment.newInstance("Looks like we dont have any smoothies that match.", R.drawable.ic_baseline_error_24);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int getItemCount() {
        // return Integer.MAX_VALUE;
        Calendar now = new Calendar.Builder().setDate(2022,12,12).build();
        now.getTimeInMillis();
        return 6;
    }
}
