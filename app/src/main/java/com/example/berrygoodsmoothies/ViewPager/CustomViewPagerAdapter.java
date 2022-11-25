package com.example.berrygoodsmoothies.ViewPager;

import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.berrygoodsmoothies.R;

import java.util.Calendar;

public class CustomViewPagerAdapter extends FragmentStateAdapter {
    private Context context;

    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, Context context) {
        super(fragmentActivity);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
          position = position % 8;
        switch (position){
            case 0 : return CreditScreenFragment.newInstance(context.getString(R.string.credits1), R.drawable.homeiamge);
            case 1 : return CreditScreenFragment.newInstance(context.getString(R.string.credits2), R.drawable.topimage);
            case 2 : return CreditScreenFragment.newInstance(context.getString(R.string.credits3), R.drawable.background);
            case 3 : return CreditScreenFragment.newInstance(context.getString(R.string.credits4), R.drawable.bubblebackground);
            case 4 : return CreditScreenFragment.newInstance(context.getString(R.string.credits5), R.mipmap.jarsicon_round);
            case 5 : return CreditScreenFragment.newInstance(context.getString(R.string.credits6), R.drawable.applejar);
            default : return CreditScreenFragment.newInstance(context.getString(R.string.credits7), R.drawable.ic_baseline_error_24);
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
