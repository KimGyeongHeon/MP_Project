package com.example.mp_project;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class cube extends AppCompatActivity implements OnMapReadyCallback {
    Button cubeb;
    private GoogleMap cMap;
    LocationManager locationManager;
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
         cMap = googleMap;
         LatLng E2 = new LatLng(36.364262, 127.346321);//공2 1층
         LatLng E6 = new LatLng(36.367410, 127.346141);//경상대
         LatLng E10 = new LatLng(36.369247, 127.352303);//농대1호관 1층
         LatLng E5 = new LatLng(36.366032, 127.345825);//2학 2층

         LatLng Dom = new LatLng(36.372694, 127.346295);//기숙사 총 3대

         LatLng W4 = new LatLng(36.370050, 127.343532);//사범, 자과대 1층
         LatLng W8 = new LatLng(36.367738, 127.343289);//1학 1층
         LatLng W7 = new LatLng(36.368338, 127.341755);//인문대 1층
         LatLng W6= new LatLng(36.368985, 127.343268);//약대 2층
         LatLng W3 = new LatLng(36.367613, 127.344680);//공1 1층
         LatLng W10 = new LatLng(36.367898, 127.340578);

         LatLng N14 = new LatLng(36.376071, 127.343869);//생과대  3층
         LatLng N11=new LatLng(36.376115, 127.342882);//생시대 1층

         MarkerOptions Dom_Options = new MarkerOptions();
         MarkerOptions N14_Options = new MarkerOptions();       MarkerOptions N11_Options=new MarkerOptions();

         MarkerOptions W4_Options = new MarkerOptions();         MarkerOptions W8_Options = new MarkerOptions();
         MarkerOptions W7_Options = new MarkerOptions();        MarkerOptions W10_Options = new MarkerOptions();
         MarkerOptions W6_Options = new MarkerOptions();                MarkerOptions W3_Options=new MarkerOptions();

         MarkerOptions E10_Options = new MarkerOptions();         MarkerOptions E6_Options = new MarkerOptions();
         MarkerOptions E2_Options = new MarkerOptions();           MarkerOptions E5_Options=new MarkerOptions();

         N14_Options.position(N14);         N14_Options.snippet("생활과학대학");        N14_Options.title("W14");             cMap.addMarker(N14_Options);
         N11_Options.position(N11);         N11_Options.snippet("생명시스템과학대학");        N11_Options.title("W11");             cMap.addMarker(N11_Options);

         W4_Options.position(W4);            W4_Options.snippet("사범대학, 자연과학대학 2호관");         W4_Options.title("W4");    cMap.addMarker(W4_Options);
         W7_Options.position(W7);         W7_Options.snippet("인문대학");         W7_Options.title("W7");                   cMap.addMarker(W7_Options);
         W8_Options.position(W8);         W8_Options.snippet("1학생회관");        W8_Options.title("W8");                   cMap.addMarker(W8_Options);
         W3_Options.position(W3);         W3_Options.snippet("공대 1호관");         W3_Options.title("W3");         cMap.addMarker(W3_Options);
         W6_Options.position(W6);          W6_Options.snippet("약학 대학");         W6_Options.title("W6");               cMap.addMarker(W6_Options);
         W10_Options.position(W6);          W10_Options.snippet("백마 교양관");        W10_Options.title("W10");               cMap.addMarker(W10_Options);

         E10_Options.position(E10);         E10_Options.snippet("농생대학 1호관");         E10_Options.title("E10");      cMap.addMarker(E10_Options);
         E6_Options.position(E6);         E6_Options.snippet("경상대학");                   E6_Options.title("E6");         cMap.addMarker(E6_Options);
         E2_Options.position(E2);         E2_Options.snippet("공대 2호관");                 E2_Options.title("E2");       cMap.addMarker(E2_Options);
         E5_Options.position(E5);         E5_Options.snippet("2학생 회관");                 E5_Options.title("E5");       cMap.addMarker(E5_Options);

         Dom_Options.position(Dom);         Dom_Options.snippet("기숙사 10동");     Dom_Options.title("Dormitory10");        cMap.addMarker(Dom_Options);



         cMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
             @Override
             public void onInfoWindowClick(Marker marker) {
                 Intent intent=new Intent(getApplicationContext(),cubeInfo.class);
                 startActivity(intent);
             }
         });
         LatLng cnu=new LatLng(36.370103, 127.346149);
         cMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cnu,18));
     }

}

