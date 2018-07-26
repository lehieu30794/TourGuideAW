package com.example.android.tourguideaw;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FragmentPagerAdapter can replace for sending intents to call an activity
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //getSupportFragmentManager() is fragment manager, we don't have to create a Fragment Manager ourselves
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
