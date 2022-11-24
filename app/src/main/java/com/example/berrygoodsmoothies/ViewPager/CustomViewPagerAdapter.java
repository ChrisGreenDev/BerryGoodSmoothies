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
            case 0 : return CreditScreenFragment.newInstance("Banana Smoothie", R.drawable.bananajar);
            case 1 : return CreditScreenFragment.newInstance("Apple Smoothie", R.drawable.applejar);
            case 2 : return CreditScreenFragment.newInstance("Lime Smoothie", R.drawable.limejar);
            case 3 : return CreditScreenFragment.newInstance("Strawberry Smoothie", R.drawable.applejar);
            case 4 : return CreditScreenFragment.newInstance("Pear Smoothie", R.drawable.pearjar);
            case 5 : return CreditScreenFragment.newInstance("Carrot Smoothie", R.drawable.carrotjar);
            case 6 : return CreditScreenFragment.newInstance("Mango Smoothie", R.drawable.mangojar);
            case 7 : return CreditScreenFragment.newInstance("Green Smoothie", R.drawable.greenjar);
            default : return CreditScreenFragment.newInstance("Looks like we dont have any smoothies that match.", R.drawable.ic_baseline_error_24);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int getItemCount() {
        // return Integer.MAX_VALUE;
        Calendar now = new Calendar.Builder().setDate(2022,12,12).build();
        now.getTimeInMillis();
        return 8;
    }
}
