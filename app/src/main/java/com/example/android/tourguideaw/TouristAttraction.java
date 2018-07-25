package com.example.android.tourguideaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristAttraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attraction);

        ArrayList<PlaceInfo> placeInfo = new ArrayList<PlaceInfo>();

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));

        placeInfo.add(new PlaceInfo("Ba Na hills", "Bà Nà Hill Station is a hill station is a hill station and resort " +
                "located in the Trường Sơn Mountains west of the city of Da Nang, in central Vietnam. " +
                "The station, advertised as \"the Da Lat of Danang province\" by local tourism authorities, was founded in 1919 by French colonists. " +
                "Linh Ung Pagoda is situated near the station, with a cable car nearby to carry tourists to and from the resort."
                , R.drawable.bana));


        PlaceAdapter placeInfoAdapter = new PlaceAdapter(this, placeInfo);

        ListView resortListView = (ListView) findViewById(R.id.tourist_attraction_list_view);
        resortListView.setAdapter(placeInfoAdapter);
    }
}
