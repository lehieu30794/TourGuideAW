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


public class ResortFragment extends Fragment {

    public ResortFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment. This layout must be a container
        View rootView = inflater.inflate(R.layout.activity_resort,
                container, false);


        // COPY THE CODE FROM RESORT ACTIVITY OVER
        ArrayList<PlaceInfo> placeInfo = new ArrayList<PlaceInfo>();

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));


        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));


        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        placeInfo.add(new PlaceInfo("Novotel Danang Premier Han River",
                "Uniquely located in downtown Danang, on the beautifully-designed " +
                        "West Bank of the Han River, the Novotel has taken its place as a leading " +
                        "hotel venue for both business and leisure travelers. It is Danang's first " +
                        "upscale internationally-managed hotel with serviced-apartments, " +
                        "with the highest and hippest panoramic bar in the city alongside " +
                        "world-class facilities and restaurants. So be it business or pleasure, " +
                        "know that at the Novotel Danang, " +
                        "our professional staff are looking forward to welcoming you.",
                R.drawable.novotel));

        PlaceAdapter placeInfoAdapter = new PlaceAdapter(getActivity(), placeInfo);

        ListView resortListView = (ListView) rootView.findViewById(R.id.resort_list_view);

        resortListView.setAdapter(placeInfoAdapter);

        return rootView;
    }

}
