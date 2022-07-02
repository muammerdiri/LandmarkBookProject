package com.muammerdiri.landmarkbook;

import android.widget.ImageView;

public class Landmark {
    String country;
    String name;
    int image;

    public Landmark() {
    }

    public Landmark(String country, String name, int image) {
        this.country = country;
        this.name = name;
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
