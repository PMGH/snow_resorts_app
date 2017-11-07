package com.example.peter.snowresorts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Peter on 07/11/2017.
 */

public class TopSnowResortsAdapter extends ArrayAdapter<Resort> {

    public TopSnowResortsAdapter(Context context, ArrayList<Resort> resorts){
        super(context, 0, resorts);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.snow_resort_item, parent, false);
        }
        Resort currentResort = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.rank_text);
        ranking.setText(currentResort.getRank().toString());

        TextView resortName = (TextView) listItemView.findViewById(R.id.resortName_text);
        resortName.setText(currentResort.getResortName());

        TextView country = (TextView) listItemView.findViewById(R.id.country_text);
        country.setText(currentResort.getCountry());

        listItemView.setTag(currentResort);

        return listItemView;
    }

}
