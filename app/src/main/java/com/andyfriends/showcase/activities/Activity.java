package com.andyfriends.showcase.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.andyfriends.showcase.R;

public class Activity extends android.app.Activity {

    private static int SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this,MapsActivity.class);
                startActivity(intent);

                finish();
            }
        });





    }
}
