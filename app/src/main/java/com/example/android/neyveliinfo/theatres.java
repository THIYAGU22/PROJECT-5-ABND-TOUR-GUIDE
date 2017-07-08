package com.example.android.neyveliinfo;

import android.content.Context;

import java.util.List;

public class theatres {

    public static void initTheatresList(List<Location> list, Context context) {
        /**
         * all the infos are stored in string
         * all the theatres info are stored  here
         * and it can be retrieved through Location.java class
         */
        list.add(new Location(
                context.getString(R.string.jpa_theatre),
                context.getString(R.string.jpa_theatre_description),
                context.getString(R.string.jpa_theatre_address),
                context.getString(R.string.jpa_theatre_phone),
                context.getString(R.string.jpa_theatre_schedule),
                R.drawable.jayapriya
        ));
        list.add(new Location(
                context.getString(R.string.rn_theatre),
                context.getString(R.string.rn_theatre_description),
                context.getString(R.string.rn_theatre_address),
                context.getString(R.string.rn_theatre_phone),
                context.getString(R.string.rn_theatre_schedule),

                R.drawable.rangaa
        ));
        list.add(new Location(
                context.getString(R.string.nr_theatre),
                context.getString(R.string.nr_theatre_description),
                context.getString(R.string.nr_theatre_address),
                context.getString(R.string.nr_theatre_phone),
                context.getString(R.string.nr_theatre_schedule),
                R.drawable.nidhiratna
        ));
        list.add(new Location(
                context.getString(R.string.mhlk_theatre),
                context.getString(R.string.mhlk_theatre_description),
                context.getString(R.string.mhlk_theatre_address),
                context.getString(R.string.mhlk_theatre_phone),
                context.getString(R.string.mhlk_theatre_schedule),
                R.drawable.mahalakshmi
        ));
    }
}
