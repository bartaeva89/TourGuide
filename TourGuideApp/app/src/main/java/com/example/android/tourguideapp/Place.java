package com.example.android.tourguideapp;


public class Place {
    private String name;
    private String address;
    private int mImageResourceId;

    public Place(String name, String address, int mImageResourceId) {
        this.name = name;
        this.address = address;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
