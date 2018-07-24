package com.example.android.tourguideaw;

public class PlaceInfo {

    private String mPlaceName;

    private String mPlaceDetail;

    private int mImageResource;

    public PlaceInfo(String placeName, String placeInfo, int imageResource){
        mPlaceName = placeName;
        mPlaceDetail = placeInfo;
        mImageResource = imageResource;
    }

    public String getPlaceName (){
        return mPlaceName;
    }

    public String getPlaceDetail (){
        return mPlaceDetail;
    }

    public int getImageResource(){
        return mImageResource;
    }
}
