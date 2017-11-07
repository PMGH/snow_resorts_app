package com.example.peter.snowresorts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resort);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        TextView rank = (TextView) findViewById(R.id.rank_view);
        rank.setText(extras.getString("rank"));

        TextView country = (TextView) findViewById(R.id.country_view);
        country.setText(extras.getString("country"));

        TextView resortName = (TextView) findViewById(R.id.resortName_view);
        resortName.setText(extras.getString("resortName"));

        TextView elevation = (TextView) findViewById(R.id.elevation_view);
        elevation.setText("Elevation: "+ extras.getString("elevation") + "m");

        TextView lifts = (TextView) findViewById(R.id.lifts_view);
        lifts.setText("Lifts: " + extras.getString("lifts"));
    }


}
