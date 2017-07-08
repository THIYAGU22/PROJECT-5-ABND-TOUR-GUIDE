package com.example.android.neyveliinfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //array list will be created here and the hotels info are stored in specific and alloted layout
        List<Location> list = new ArrayList<>();
        hotels.initHotelsList(list, getContext());
        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        //hotels info are updated by listview in acitivity loccationlist
        View view = inflater.inflate(R.layout.activity_locationlist, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        return view;
    }
}