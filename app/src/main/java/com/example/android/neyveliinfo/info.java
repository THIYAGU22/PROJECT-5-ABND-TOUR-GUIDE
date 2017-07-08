package com.example.android.neyveliinfo;

import android.content.Context;

import java.util.List;

public class info {
    /**
     * all the infos are stored in string
     * all the neyveli info are stored  here
     * and it can be retrieved through Location.java class
     */
    public static void initInfoList(List<Location> list, Context context) {
        list.add(new Location(
                context.getString(R.string.nvl_rail),
                context.getString(R.string.nvl_rail_des),
                null,
                null,
                null,
                R.drawable.neyvelirailway));
        list.add(new Location(
                context.getString(R.string.nvl_info),
                context.getString(R.string.nvl_des),
                null,
                null,
                null,
                R.drawable.nvlarch));
        list.add(new Location(
                context.getString(R.string.nvl_abt),
                context.getString(R.string.nvl_abt_des),
                null,
                null,
                null,
                R.drawable.machinery));
    }
}