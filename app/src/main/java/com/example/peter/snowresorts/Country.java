package com.example.peter.snowresorts;

/**
 * Created by Peter on 08/11/2017.
 */

public enum Country {

    FRANCE("France", R.drawable.france),
    ITALY("Italy", R.drawable.italy),
    SCOTLAND("Scotland", R.drawable.scotland),
    SWITZERLAND("Switzerland", R.drawable.switzerland);

    private String name;
    private int imageSource;

    Country(String name, int imageSource) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }
}
