package com.example.android.tourguideaw;

public class PlaceInfo {

    private String mPlaceName;

    private String mPlaceDetail;

    public PlaceInfo(String placeName, String placeInfo){
        mPlaceName = placeName;
        mPlaceDetail = placeInfo;
    }

    public String getPlaceName (){
        return mPlaceName;
    }

    public String getPlaceDetail (){
        return mPlaceDetail;
    }
}
