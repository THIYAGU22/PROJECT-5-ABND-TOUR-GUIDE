package com.example.android.neyveliinfo;

import android.content.Context;

import java.util.List;

public class hotels {
    public static void initHotelsList(List<Location> list, Context context) {
        /**
         * all the infos are stored in string
         * all the hotels info are stored  here
         * and it can be retrieved through Location.java class
         */
        list.add(new Location(
                context.getString(R.string.hotel_bd),
                context.getString(R.string.hotel_bd_description),
                context.getString(R.string.hotel_bd_address),
                context.getString(R.string.hotel_bd_phone),
                context.getString(R.string.hotel_bd_schedule),
                R.drawable.bluediamond));
        list.add(new Location(
                context.getString(R.string.hotel_rad),
                context.getString(R.string.hotel_rad_description),
                context.getString(R.string.hotel_rad_address),
                context.getString(R.string.hotel_rad_phone),
                context.getString(R.string.hotel_rad_schedule),
                R.drawable.radhahotel));
        list.add(new Location(
                context.getString(R.string.hotel_krish),
                context.getString(R.string.hotel_krish_description),
                context.getString(R.string.hotel_krish_address),
                context.getString(R.string.hotel_krish_phone),
                context.getString(R.string.hotel_krish_schedule),
                R.drawable.krishna));
    }
}
