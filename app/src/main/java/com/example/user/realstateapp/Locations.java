package com.example.user.realstateapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Locations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng property1 = new LatLng(29.443263,75.6719476);
        mMap.addMarker(new MarkerOptions().position(property1).title("2 BHK FLAT IN OWNERSHIP OF KING REAL STATE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property1));
        LatLng property2 = new LatLng(29.44164,75.6764943);
        mMap.addMarker(new MarkerOptions().position(property2).title("3 BHK FLAT IN OWNERSHIP OF KING REAL STATE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property2));

        LatLng property3 = new LatLng(26.7416955,83.8805839);
        mMap.addMarker(new MarkerOptions().position(property3).title("1 BHK FLAT IN OWNERSHIP OF KING REAL STATE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property3));

        LatLng property4 = new LatLng(26.475881,83.1339103);
        mMap.addMarker(new MarkerOptions().position(property4).title("APARTMENT IN OWNERSHIP OF KING REAL STATE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(property4));


    }
}
