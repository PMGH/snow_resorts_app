package com.example.peter.snowresorts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.src;


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

        ImageView resortImage = (ImageView) listItemView.findViewById(R.id.image_view);
//        String image = currentResort.getImageSource();
//        resortImage.setImageResource(R.drawable.meribel);
//        Drawable.createFromPath("app/src/main/res/drawable/meribel.png");
//        resortImage.setImageURI(Uri.parse("app/src/main/res/drawable/" + currentResort.getImageSource()));
//        resortImage.setImageURI(Uri.parse("android.resource://com.example.peter.snowresorts/res/drawable/meribel.png"));

        listItemView.setTag(currentResort);

        return listItemView;
    }

}
