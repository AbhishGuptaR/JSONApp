package com.example.android.jsonapp;

import android.graphics.Bitmap;

public class Jsondata {

    String Imageurl;
    String Title;
    String Listings;
    String Amount;

    public Jsondata(){

    }
    public Jsondata(String imageurl,String title,String listings,String amount) {
        Imageurl = imageurl;
        Title = title;
        Listings = listings;
        Amount = amount;
    }

    public String getImageurl() {
        return Imageurl;
    }

    public void setImageurl(String imageurl) {
        Imageurl = imageurl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getListings() {
        return Listings;
    }

    public void setListings(String listings) {
        Listings = listings;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
