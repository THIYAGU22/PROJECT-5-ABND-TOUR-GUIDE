package com.example.android.neyveliinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ravi on 5/7/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    //location adapter lets us the exact place to assume the infos
    public LocationAdapter(Context context, int resources, List<Location> locationList) {
        super(context, 0, locationList);
    }

    //infos are retrieved through getview
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Location currentLocation = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }
        //setting up the location name by nametextview id
        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        //setting up the description name by descriptiontextview id
        TextView descriptionLocationTextView = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        //setting up the address name by addresstextview id
        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        //setting up the phone num by phonetextview id
        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        //setting up the schedule name by scheduletextview id
        TextView scheduleLocationTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        scheduleLocationTextView.setText(currentLocation.getSchedule());

        //setting up the photos abt location by photoimage viewid
        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        //photos are viewed with the help of setvisibity mode
        //if the photo is present it will be viewed by "view.visible "
        //else the photo isnt present it wont be shown
        if (currentLocation.hasImage()) {
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        //schedule are viewed with the help of setvisibity mode
        //if the schedule is present it will be viewed by "view.visible "
        //else the schedule isnt present it wont be shown
        if (currentLocation.hasSchedule()) {
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }
        //address are viewed with the help of setvisibity mode
        //if the address is present it will be viewed by "view.visible "
        //else the address isnt present it wont be shown
        if (currentLocation.hasAddress()) {
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        //phone num are viewed with the help of setvisibity mode
        //if the phone num is present it will be viewed by "view.visible "
        //else the phone num isnt present it wont be shown
        if (currentLocation.hasPhone()) {
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}







