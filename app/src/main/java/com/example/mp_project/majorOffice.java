package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class majorOffice extends AppCompatActivity implements OnMapReadyCallback {
    Button majorb;
    private GoogleMap majorMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_office);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.majorMap);
        mapFragment.getMapAsync(this);

        majorb=(Button)findViewById(R.id.major_office_back);
        majorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    public void onMapReady(GoogleMap googleMap){
        majorMap= googleMap;
        LatLng E2 = new LatLng(36.364262, 127.346321);
        LatLng E1 = new LatLng(36.367613, 127.344680);
        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions E1_option=new MarkerOptions();
        E1_option.position(E1);
        E1_option.title("공1");
        E1_option.snippet("공대1호관");
        majorMap.addMarker(E1_option);
        markerOptions.position(E2);
        markerOptions.title("공2");
        markerOptions.snippet("공대2호관");
        majorMap.addMarker(markerOptions);

        majorMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(36.370103, 127.346149)));
        majorMap.animateCamera(CameraUpdateFactory.zoomTo(50));


    }
}
