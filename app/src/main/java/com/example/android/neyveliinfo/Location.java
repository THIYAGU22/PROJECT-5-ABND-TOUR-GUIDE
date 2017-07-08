package com.example.android.neyveliinfo;


import android.util.Log;

/**
 * Created by ravi on 5/7/2017.
 */

public class Location {

    //setting up the things for location info as string type by private methods
    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    //constant values that represents no image provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;
    //image resource id for this word
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /**
     * create a new location object
     *
     * @param name
     * @param description
     * @param address
     * @param phone
     * @param schedule
     * @param imageResourceId
     */
    public Location(String name, String description, String address, String phone, String schedule, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.imageResourceId = imageResourceId;
    }

    // name is retrieved through get method
    public String getName() {
        return name;
    }

    // getdescription is retrieved through get method
    public String getDescription() {
        return description;
    }

    // getaddress is retrieved through get method
    public String getAddress() {
        return address;
    }

    // getphone is retrieved through get method
    public String getPhone() {
        return phone;
    }

    // getschedule is retrieved through get method
    public String getSchedule() {
        return schedule;
    }

    // image is retrieved through get method
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * it checks whether there is an image provided
     */
    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * it checks whether there is a phone num provided
     */
    public boolean hasPhone() {
        return getPhone() != null;
    }

    /**
     * it checks whether there is an address provided
     */
    public boolean hasAddress() {
        return getAddress() != null;
    }

    /**
     * it checks whether there is a schedule provided
     */
    public boolean hasSchedule() {
        return getSchedule() != null;
    }

    // all the datas are assembled here in this tostring method()
    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId();
        return output;
    }
}
