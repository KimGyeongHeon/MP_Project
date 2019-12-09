package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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

public class cafe99 extends AppCompatActivity implements OnMapReadyCallback {
    Button dbb;
    Button cafeb;
    GoogleMap cafeMap;
    SQLiteDatabase sqlDB;
    cafe99Info.myDBHelper myHelper;
    MarkerOptions Dom_Options = new MarkerOptions();
    MarkerOptions N14_Options = new MarkerOptions();       MarkerOptions N7_Options=new MarkerOptions();
    MarkerOptions N1_Options = new MarkerOptions();

    MarkerOptions W8_Options = new MarkerOptions();

    MarkerOptions E9_Options = new MarkerOptions();         MarkerOptions E1_1_Options = new MarkerOptions();
    MarkerOptions E5_Options=new MarkerOptions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe99);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.cafeMap);
        mapFragment.getMapAsync(this);
        cafeb = (Button) findViewById(R.id.cafe99_back);
        cafeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dbb=(Button)findViewById(R.id.cafe99B1);
        dbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("insert into cafe99 values('"+N1_Options.getTitle().toString()+"',"+N1_Options.getSnippet().toString()+"',"+N1_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+N14_Options.getTitle().toString()+"',"+N14_Options.getSnippet().toString()+"',"+N14_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+N7_Options.getTitle().toString()+"',"+N7_Options.getSnippet().toString()+"',"+N7_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+Dom_Options.getTitle().toString()+"',"+Dom_Options.getSnippet().toString()+"',"+Dom_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+E1_1_Options.getTitle().toString()+"',"+E1_1_Options.getSnippet().toString()+"',"+E1_1_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+E5_Options.getTitle().toString()+"',"+E5_Options.getSnippet().toString()+"',"+E5_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+E9_Options.getTitle().toString()+"',"+E9_Options.getSnippet().toString()+"',"+E9_Options.getTitle().toString()+");");
                sqlDB.execSQL("insert into cafe99 values('"+W8_Options.getTitle().toString()+"',"+W8_Options.getSnippet().toString()+"',"+W8_Options.getTitle().toString()+");");

            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        cafeMap= googleMap;
        LatLng E5 = new LatLng(36.366032, 127.345825);//2학 99
        LatLng E1_1 = new LatLng(36.362334, 127.345854);//언교원 99
        LatLng E9=new LatLng(36.368553, 127.350319);//상록회관

        LatLng Dom = new LatLng(36.372819, 127.346285);//와야

        LatLng W8 = new LatLng(36.367738, 127.343289);//1학 99, 영탑

        LatLng N14 = new LatLng(36.376071, 127.343869);//생과대 99
        LatLng N1 = new LatLng(36.370174, 127.346107); //도서관 99
        LatLng N7 = new LatLng(36.371503, 127.344729);// 3학 99



        N14_Options.position(N14);         N14_Options.snippet("생활과학대학 99");        N14_Options.title("N14 CAFE 99");             cafeMap.addMarker(N14_Options);
        N1_Options.position(N1);         N1_Options.snippet("도서관 99");        N1_Options.title("N1 CAFE 99");             cafeMap.addMarker(N1_Options);
        N7_Options.position(N7);         N7_Options.snippet("3 학생회관 99");        N7_Options.title("N7 CAFE 99");             cafeMap.addMarker(N7_Options);

        W8_Options.position(W8);         W8_Options.snippet("1학생회관 99, 영탑");        W8_Options.title("W8 CAFE99, YoungTop");       cafeMap.addMarker(W8_Options);

        E5_Options.position(E5);         E5_Options.snippet("2학생회관 99");                 E5_Options.title("E5 CAFE99");       cafeMap.addMarker(E5_Options);
        E1_1_Options.position(E1_1);         E1_1_Options.snippet("언어교육원 99");                 E1_1_Options.title("E1_1 CAFE99");       cafeMap.addMarker(E1_1_Options);
        E9_Options.position(E9);         E9_Options.snippet("상록회관 99");                 E9_Options.title("상록회관 CAFE99");       cafeMap.addMarker(E9_Options);

        Dom_Options.position(Dom);         Dom_Options.snippet("와야");     Dom_Options.title("CAFE WAYA");        cafeMap.addMarker(Dom_Options);

        cafeMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent=new Intent(getApplicationContext(),cafe99Info.class);
                intent.putExtra("name",marker.getTitle());
                intent.putExtra("snippet",marker.getSnippet());
                startActivity(intent);
            }
        });

        LatLng cnu=new LatLng(36.370103, 127.346149);
        cafeMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cnu,18));
    }
}
