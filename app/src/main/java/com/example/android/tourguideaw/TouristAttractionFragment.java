package com.example.android.tourguideaw;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TouristAttractionFragment extends Fragment {

    public TouristAttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Use LayoutInflater class object to inflate root layout
       View rootView = inflater.inflate(R.layout.activity_tourist_attraction, container, false);

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


        PlaceAdapter placeInfoAdapter = new PlaceAdapter(getActivity(), placeInfo);

        ListView touristAttractionListView = (ListView) rootView.findViewById(R.id.tourist_attraction_list_view);
        touristAttractionListView.setAdapter(placeInfoAdapter);

        return rootView;
    }


}
