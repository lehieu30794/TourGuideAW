package com.example.android.tourguideaw;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristAttraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                // replace the useless container for a fragment,
                // which in turn inflates activity_tourist_fragment as a new container
                .replace(R.id.container, new TouristAttractionFragment())
                .commit();
    }
}
