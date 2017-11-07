package com.example.peter.snowresorts;

import java.util.ArrayList;

/**
 * Created by Peter on 07/11/2017.
 */

public class TopSnowResorts {

    private ArrayList<Resort> resorts;

    public TopSnowResorts() {
        resorts = new ArrayList<Resort>();

        resorts.add(new Resort(1, "Meribel", "France", 1450, 53, "meribel.png"));
        resorts.add(new Resort(2, "Val Thorens", "France", 2300, 32, "val_thorens.png"));
        resorts.add(new Resort(3, "La Tania", "France", 1400, 57, "la_tania.png"));
        resorts.add(new Resort(4, "Courchevel", "France", 1750, 52, "courchevel.png"));
        resorts.add(new Resort(5, "Breuil-Cervinia", "Italy", 2050, 24, "cervinia.png"));
        resorts.add(new Resort(6, "Zermatt", "Switzerland", 1600, 54, "zermatt.png"));
        resorts.add(new Resort(7, "Cairngorms", "Scotland, UK", 1300, 11, "cairngorms.png"));
        resorts.add(new Resort(8, "Glencoe", "Scotland, UK", 700, 8, "glencoe.png"));
    }

    public ArrayList<Resort> getResorts() {
        return resorts;
    }

    public int numResorts(){
        return resorts.size();
    }

}
