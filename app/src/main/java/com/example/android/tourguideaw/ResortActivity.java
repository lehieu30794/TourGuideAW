package com.example.android.tourguideaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ResortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort);

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

        PlaceAdapter placeInfoAdapter = new PlaceAdapter(this, placeInfo);

        ListView resortListView = (ListView) findViewById(R.id.resort_list_view);

        resortListView.setAdapter(placeInfoAdapter);


    }
}
