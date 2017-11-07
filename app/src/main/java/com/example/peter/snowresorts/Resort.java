package com.example.peter.snowresorts;

/**
 * Created by Peter on 07/11/2017.
 */

public class Resort {

    private int rank;
    private String resortName;
    private String country;
    private int elevation;
    private int lifts;
    private String imageSource;

    public Resort(Integer rank, String resortName, String country, Integer elevation, Integer lifts, String imageSource) {
        this.rank = rank;
        this.resortName = resortName;
        this.country = country;
        this.elevation = elevation;
        this.lifts = lifts;
        this.imageSource = imageSource;
    }

    public Integer getRank() {
        return this.rank;
    }

    public String getResortName() {
        return this.resortName;
    }

    public String getCountry() {
        return this.country;
    }

    public Integer getElevation() {
        return this.elevation;
    }

    public Integer getLifts() {
        return this.lifts;
    }

    public String getImageSource() {
        return imageSource;
    }
}
