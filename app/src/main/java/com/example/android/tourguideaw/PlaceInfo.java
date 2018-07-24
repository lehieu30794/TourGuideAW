package com.example.android.tourguideaw;

public class PlaceInfo {

    private String mPlaceName;

    private String mPlaceDetail;

    private int mImageResource = NO_IMAGE_PROVIDED;

    // need to understand this!
    private static final int NO_IMAGE_PROVIDED = -1;

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

    // Need to understand this
    public boolean hasImage(){
        return mImageResource != NO_IMAGE_PROVIDED;
    }
}
