package com.example.android.neyveliinfo;

/**
 * Created by ravi on 5/7/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lara on 1/9/16.
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    //fragment adapter will perform the major activity
    //he allots the seat for everyone
    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    //various activities will be displayed according to specified designation
    public Fragment getItem(int position) {
        if (position == 0) {
            return new infoFragment();
        } else if (position == 1) {
            return new TheatresFragment();
        } else if (position == 2) {
            return new BanksFragment();
        } else {
            return new HotelsFragment();
        }
    }

    //totally 4 activities are there
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_info);
        } else if (position == 1) {
            return context.getString(R.string.category_theatres);
        } else if (position == 2) {
            return context.getString(R.string.category_banks);
        } else {
            return context.getString(R.string.category_hotels);
        }
    }
}