package com.example.berrygoodsmoothies.ViewPager;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.berrygoodsmoothies.R;
import com.example.berrygoodsmoothies.ViewPager.PotassiumFragment;

import java.util.Calendar;

public class CustomViewPagerAdapter extends FragmentStateAdapter {

    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //  position = position % 5;
        switch (position){
            case 0 : return PotassiumFragment.newInstance("Banana Smoothie", R.drawable.newbananacard);
            case 1 : return PotassiumFragment.newInstance("Apple Smoothie", R.drawable.newapplecard);
            case 2 : return PotassiumFragment.newInstance("Lime Smoothie", R.drawable.newlimecard);
            case 3 : return PotassiumFragment.newInstance("Strawberry Smoothie", R.drawable.newstrawberrycard);
            case 4 : return PotassiumFragment.newInstance("Pear Smoothie", R.drawable.newpearcard);
            default : return PotassiumFragment.newInstance("Looks like we dont have any smoothies that match.", R.drawable.ic_baseline_error_24);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int getItemCount() {
        // return Integer.MAX_VALUE;
        Calendar now = new Calendar.Builder().setDate(2022,12,12).build();
        now.getTimeInMillis();
        return 5;
    }
}
