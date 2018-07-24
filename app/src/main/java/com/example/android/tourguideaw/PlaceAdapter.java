package com.example.android.tourguideaw;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<PlaceInfo> {

    // Public constructor needs specifying ArrayList
    public PlaceAdapter (Activity context,
                         ArrayList<PlaceInfo> placeInfo){
        super (context, 0, placeInfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_view, parent, false);
        }

        PlaceInfo currentPlaceInfo = getItem(position);

        //To findViewById, need to refer to the View first, which is convertView. Because
        //we are in different class
        TextView placeName = (TextView) convertView.findViewById(R.id.place_name);
        placeName.setText(currentPlaceInfo.getPlaceName());

        TextView placeDetail = (TextView) convertView.findViewById(R.id.place_detail);
        placeDetail.setText(currentPlaceInfo.getPlaceDetail());

        //Add image to list_item_view
        ImageView placeImage = (ImageView) convertView.findViewById(R.id.place_image);
        //First need to use setImageResource, which a method of ImageView. Only call getImageResource after that,
        //which is defined by myself
        placeImage.setImageResource(currentPlaceInfo.getImageResource());


       /*//Why need to do a boolean, why not directly like mine above
       if (currentPlaceInfo.hasImage()){
           placeImage.setImageResource(currentPlaceInfo.getImageResource());
           placeImage.setVisibility(View.VISIBLE);
       } else {
           placeImage.setVisibility(View.GONE);
       }*/

        return convertView;
    }
}
