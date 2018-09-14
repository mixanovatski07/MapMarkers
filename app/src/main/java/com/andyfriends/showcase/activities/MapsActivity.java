package com.andyfriends.showcase.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.andyfriends.showcase.R;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import android.view.MenuItem;
import android.view.Menu;

public class MapsActivity extends ActionBarActivity  {
    private GoogleMap mMap;
    Location latitude;
    Location longitude;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setUpMapIfNeeded();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
           // @Override
           public void onClick(View view) {
               Intent intent = new Intent(MapsActivity.this, Activity.class);
               startActivity(intent);

               finish();
           }
       });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
           // return true;
        //}

       // return super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent i = new Intent(this,Activityv2.class);
                this.startActivity(i);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        if (mMap != null) {
            return;
        }
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (mMap != null) {



            //Marker m1 = mMap.addMarker(new MarkerOptions()
                  //  .position(new LatLng(38.609556, -1.139637))
                   // .anchor(0.5f, 0.5f)
                   // .title("Title1")
                  //  .snippet("Snippet1")
                   // .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_club)));


          //  Marker m2 = mMap.addMarker(new MarkerOptions()
                //    .position(new LatLng(40.4272414,-3.7020037))
                 //   .anchor(0.5f, 0.5f)
                  //  .title("Title2")
                  //  .snippet("Snippet2")
                  //  .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_club)));


           // Marker m3 = mMap.addMarker(new MarkerOptions()
                 //   .position(new LatLng(43.2568193,-2.9225534))
                 //   .anchor(0.5f, 0.5f)
                  //  .title("Title3")
                  //  .snippet("Snippet3")
                   // .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_club)));
            LatLngBounds AUSTRALIA = new LatLngBounds(
                    new LatLng(-44, 113), new LatLng(-10, 154));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(AUSTRALIA.getCenter(), 15));


            LatLng Paparazzi = new LatLng(59.4365480, 24.7489300);
            mMap.addMarker(new MarkerOptions().position(Paparazzi)
                    .title("Paparazzi")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club))
            );

            mMap.moveCamera(CameraUpdateFactory.newLatLng(Paparazzi));




            LatLng VenusKlubi = new LatLng(59.4370841, 24.7526080);
            mMap.addMarker(new MarkerOptions().position(VenusKlubi)
                    .title("VenusKlubi")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club))
            );
            mMap.moveCamera(CameraUpdateFactory.newLatLng(VenusKlubi));

            LatLng DelMareBaar = new LatLng(59.422254, 24.698996);
            mMap.addMarker(new MarkerOptions().position(DelMareBaar)
                    .title("DelMareBaar")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club))
            );
            mMap.moveCamera(CameraUpdateFactory.newLatLng(DelMareBaar)
            );

            LatLng Jamaicabaar = new LatLng(59.4309197, 24.7442982);
            mMap.addMarker(new MarkerOptions().position(Jamaicabaar)
                    .title("Jamaicabaar")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Jamaicabaar));

            LatLng Nightclubtheater = new LatLng(59.4370841, 24.7447196);
            mMap.addMarker(new MarkerOptions().position(Nightclubtheater)
                    .title("Nightclubtheatery")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Nightclubtheater));

            LatLng Wellklubi = new LatLng(59.4529034, 24.8753043);
            mMap.addMarker(new MarkerOptions().position(Wellklubi)
                    .title("Wellklubi")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Wellklubi));

            LatLng NightclubIBIZA = new LatLng(59.4303143, 24.7465216);
            mMap.addMarker(new MarkerOptions().position(NightclubIBIZA)
                    .title("NightclubIBIZA")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(NightclubIBIZA));

            LatLng CafeAMIGO = new LatLng(59.4365315, 24.7549409);
            mMap.addMarker(new MarkerOptions().position(CafeAMIGO)
                    .title("CafeAMIGO")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(CafeAMIGO));

            LatLng  ClubHollywood = new LatLng(59.4351587, 24.7455513);
            mMap.addMarker(new MarkerOptions().position(ClubHollywood)
                    .title("ClubHollywoody")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ClubHollywood));

            LatLng Vabank = new LatLng(59.434584, 24.743917);
            mMap.addMarker(new MarkerOptions().position(Vabank)
                    .title("Vabank")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Vabank));

            LatLng ZanzibarNightclub = new LatLng(59.431691, 24.821900);
            mMap.addMarker(new MarkerOptions().position(ZanzibarNightclub)
                    .title("Marker in Sydney")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ZanzibarNightclub));

            LatLng ClubStudio = new LatLng(59.435982, 24.747579);
            mMap.addMarker(new MarkerOptions().position(ClubStudio)
                    .title("Marker in Sydney")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.star_club)));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ClubStudio));



            //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude.getLatitude(), longitude.getLongitude()), 12.0f));


            //LatLng latLng = new LatLng(latitude.getLatitude(), longitude.getLongitude());
           // MarkerOptions markerOptions = new MarkerOptions()
                   // .position(latLng)
                   // .title("title")
                  //  .snippet("some text in ballon");
           // CameraPosition cameraPosition = new CameraPosition.Builder().target(latLng).zoom(18).build();//18 was a number it was fine to my situation.

           // Marker markerFinal = mMap.addMarker(markerOptions);
          //  markerFinal.showInfoWindow();//the marker comes with balloon already open.

           // mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));


            // Initialize map options. For example:
            // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        }

    }


}