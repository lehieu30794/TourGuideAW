package com.example.android.tourguideaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Start Resort Activity
        TextView resort = (TextView) findViewById(R.id.resort);
        resort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivity.this, ResortActivity.class);
                startActivity(i);
            }
        });


        // Start TouristAttractions Activity
        TextView  touristActtractions = (TextView) findViewById(R.id.tourist_attractions);
        touristActtractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivity.this, TouristAttraction.class);
                startActivity(i);
            }
        });

    }
}
