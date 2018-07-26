package com.example.android.tourguideaw;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// In order to populate pages (fragment) onto the screen, need to have an adapter, which is FragmentPagerAdapter
public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            // Why we need to have a word "new" here? Why can't we just call w/o 'new'
            return new ResortFragment();
        } else {
            return new TouristAttractionFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
