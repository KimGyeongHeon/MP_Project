package com.example.mp_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class cube extends AppCompatActivity implements OnMapReadyCallback {
    Button cubeb;
    private GoogleMap cMap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager()
        .findFragmentById(R.id.cubeMap);
        mapFragment.getMapAsync(this);

        cubeb=(Button)findViewById(R.id.cubeback);
        cubeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
     @Override
    public void onMapReady( GoogleMap googleMap){
        cMap= googleMap;
         LatLng E2 = new LatLng(36.364262, 127.346321);
         LatLng E1 = new LatLng(36.367613, 127.344680);
         MarkerOptions markerOptions = new MarkerOptions();
         MarkerOptions E1_option=new MarkerOptions();
         E1_option.position(E1);
         E1_option.title("공1");
         E1_option.snippet("공대1호관");
         cMap.addMarker(E1_option);
         markerOptions.position(E2);
         markerOptions.title("공2");
         markerOptions.snippet("공대2호관");
         cMap.addMarker(markerOptions);

         cMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(36.370103, 127.346149)));
         cMap.animateCamera(CameraUpdateFactory.zoomTo(50));


     }
}

