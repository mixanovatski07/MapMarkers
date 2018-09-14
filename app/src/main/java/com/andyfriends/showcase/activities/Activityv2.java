package com.andyfriends.showcase.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.andyfriends.showcase.R;

public class Activityv2 extends AppCompatActivity {

    private static int SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activityv2.this,MapsActivity.class);
                startActivity(intent);

                finish();
            }
        });





    }
}
