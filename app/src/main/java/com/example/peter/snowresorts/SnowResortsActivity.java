package com.example.peter.snowresorts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class SnowResortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snow_resorts_list);

        TopSnowResorts topSnowResorts = new TopSnowResorts();
        ArrayList<Resort> resortList = topSnowResorts.getResorts();

        TopSnowResortsAdapter snowResortsAdapter = new TopSnowResortsAdapter(this, resortList);
        ListView resortListView = (ListView) findViewById(R.id.resort_list);
        resortListView.setAdapter(snowResortsAdapter);
    }

    public void getResort(View listItem){
        Resort resort = (Resort) listItem.getTag();

        Intent i = new Intent(this, ResortActivity.class);

        i.putExtra("rank", resort.getRank().toString());
        i.putExtra("country", resort.getCountry().getName());
        i.putExtra("countryImage", resort.getCountry().getImageSource());
        i.putExtra("resortName", resort.getResortName());
        i.putExtra("elevation", resort.getElevation().toString());
        i.putExtra("lifts", resort.getLifts().toString());
        i.putExtra("imageSource", resort.getImageSource());

        startActivity(i);
    }

}
