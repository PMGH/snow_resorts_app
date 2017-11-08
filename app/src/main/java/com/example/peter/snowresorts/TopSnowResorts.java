package com.example.peter.snowresorts;

import java.util.ArrayList;

import static com.example.peter.snowresorts.Country.FRANCE;
import static com.example.peter.snowresorts.Country.ITALY;
import static com.example.peter.snowresorts.Country.SCOTLAND;
import static com.example.peter.snowresorts.Country.SWITZERLAND;

/**
 * Created by Peter on 07/11/2017.
 */

public class TopSnowResorts {

    private ArrayList<Resort> resorts;

    public TopSnowResorts() {
        resorts = new ArrayList<Resort>();

        resorts.add(new Resort(1, "Meribel", FRANCE, 1450, 53, R.drawable.meribel));
        resorts.add(new Resort(2, "Val Thorens", FRANCE, 2300, 32, R.drawable.val_thorens));
        resorts.add(new Resort(3, "La Tania", FRANCE, 1400, 57, R.drawable.la_tania));
        resorts.add(new Resort(4, "Courchevel", FRANCE, 1750, 52, R.drawable.courchevel));
        resorts.add(new Resort(5, "Breuil-Cervinia", ITALY, 2050, 24, R.drawable.cervinia));
        resorts.add(new Resort(6, "Zermatt", SWITZERLAND, 1600, 54, R.drawable.zermatt));
        resorts.add(new Resort(7, "Cairngorms", SCOTLAND, 1300, 11, R.drawable.cairngorms));
        resorts.add(new Resort(8, "Glencoe", SCOTLAND, 700, 8, R.drawable.glencoe));
    }

    public ArrayList<Resort> getResorts() {
        return resorts;
    }

    public int numResorts(){
        return resorts.size();
    }

}
