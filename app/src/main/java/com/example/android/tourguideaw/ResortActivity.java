package com.example.android.tourguideaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ResortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort);

        ArrayList<PlaceInfo> placeInfo = new ArrayList<PlaceInfo>();

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station "));

        PlaceAdapter placeInfoAdapter = new PlaceAdapter(this, placeInfo);

        ListView resortListView = (ListView) findViewById(R.id.resort_list_view);
        resortListView.setAdapter(placeInfoAdapter);
    }
}
