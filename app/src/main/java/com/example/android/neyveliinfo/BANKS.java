package com.example.android.neyveliinfo;

import android.content.Context;

import java.util.List;

public class BANKS {

    public static void initBanksList(List<Location> list, Context context) {
        /**
         * all the infos are stored in string
         * all the banks info are stored  here
         * and it can be retrieved through Location.java class
         */
        list.add(new Location(
                context.getString(R.string.bank_icici),
                context.getString(R.string.bank_icici_description),
                context.getString(R.string.bank_icici_address),
                context.getString(R.string.bank_icici_phone),
                context.getString(R.string.bank_icici_schedule),
                R.drawable.icici));
        list.add(new Location(
                context.getString(R.string.bank_sbi),
                context.getString(R.string.bank_sbi_description),
                context.getString(R.string.bank_sbi_address),
                context.getString(R.string.bank_sbi_phone),
                context.getString(R.string.bank_sbi_schedule),
                R.drawable.sbi));
        list.add(new Location(
                context.getString(R.string.bank_can),
                context.getString(R.string.bank_can_description),
                context.getString(R.string.bank_can_address),
                context.getString(R.string.bank_can_phone),
                context.getString(R.string.bank_can_schedule),
                R.drawable.canarabank));
        list.add(new Location(
                context.getString(R.string.bank_lvb),
                context.getString(R.string.bank_lvb_description),
                context.getString(R.string.bank_lvb_address),
                context.getString(R.string.bank_lvb_phone),
                context.getString(R.string.bank_lvb_schedule),
                R.drawable.lvb));
    }
}