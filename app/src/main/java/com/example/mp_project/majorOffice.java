package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        LatLng E1 = new LatLng(36.367613, 127.344680);
        LatLng E2 = new LatLng(36.364262, 127.346321);//공2 1층
        LatLng E6 = new LatLng(36.367410, 127.346141);//경상대
        LatLng E10 = new LatLng(36.369247, 127.352303);//농대1호관 1층
        LatLng E10_3 = new LatLng(36.370448, 127.351897);//농3
        LatLng E10_2 = new LatLng(36.370368, 127.352781);//농2


        LatLng W2 = new LatLng(36.366731, 127.344327);//공5
        LatLng W3 = new LatLng(36.367613, 127.344680);//공1 1층
        LatLng W4 = new LatLng(36.369961, 127.343434);//사범, 자과대2 1층
        LatLng W5 = new LatLng(36.369375, 127.343623);//자과대1 1층
        LatLng W6 = new LatLng(36.368985, 127.343268);//약대 2층
        LatLng W7 = new LatLng(36.368338, 127.341755);//인문대 1층
        LatLng W11_1 = new LatLng(36.366866, 127.340113);//기초2호관
        LatLng W11_2 = new LatLng(36.366307, 127.340058);//기초 1호관
        LatLng W12_1 =new LatLng(36.366375, 127.342279);//사과대

        LatLng N2 = new LatLng(36.370535, 127.347720);//군사학부
        LatLng N9_1 = new LatLng(36.371076, 127.343661);//예대1
        LatLng N9_2 = new LatLng(36.371628, 127.343409);//예대2
        LatLng N10_1 = new LatLng(36.373176, 127.344148);//음대1
        LatLng N10_2 = new LatLng(36.373793, 127.344167);//음대2
        LatLng N11 = new LatLng(36.376115, 127.342882);//생시대 1층
        LatLng N12 = new LatLng(36.376786, 127.344924);//생시대 1층
        LatLng N13 = new LatLng(36.376902, 127.343670);//생시대 1층
        LatLng N14 = new LatLng(36.376071, 127.343869);//생과대  3층

        MarkerOptions N2_option = new MarkerOptions();
        MarkerOptions N9_1_option = new MarkerOptions();
        MarkerOptions N9_2_option = new MarkerOptions();
        MarkerOptions N10_1_option = new MarkerOptions();
        MarkerOptions N10_2_option = new MarkerOptions();
        MarkerOptions N11_option = new MarkerOptions();
        MarkerOptions N12_option = new MarkerOptions();
        MarkerOptions N13_option = new MarkerOptions();
        MarkerOptions N14_option = new MarkerOptions();

        N2_option.title("N2");        N2_option.snippet("국가안보융합학부");  N2_option.position(N2);
        N9_1_option.title("N9_1");        N9_1_option.snippet("예술대학 1호관");  N9_1_option.position(N9_1);
        N9_2_option.title("N9_2");        N9_2_option.snippet("예술대학 2호관");  N9_2_option.position(N9_2);
        N10_1_option.title("N10_1");        N10_1_option.snippet("음악대학 1호관");  N10_1_option.position(N10_1);
        N10_2_option.title("N10_2");        N10_2_option.snippet("음악대학 2호관");  N10_2_option.position(N10_2);
        N11_option.title("N11");        N11_option.snippet("생명시스템대학");  N11_option.position(N11);
        N12_option.title("N12");        N12_option.snippet("생명과학대학");  N12_option.position(N12);
        N13_option.title("N13");        N13_option.snippet("법대");  N13_option.position(N13);
        N14_option.title("N14");        N14_option.snippet("수의대");  N14_option.position(N14);
        majorMap.addMarker(N2_option);majorMap.addMarker(N9_2_option);majorMap.addMarker(N10_2_option);majorMap.addMarker(N12_option);majorMap.addMarker(N14_option);
        majorMap.addMarker(N9_1_option);majorMap.addMarker(N10_1_option);majorMap.addMarker(N11_option);majorMap.addMarker(N13_option);

        MarkerOptions W2_option = new MarkerOptions();
        MarkerOptions W3_option = new MarkerOptions();
        MarkerOptions W4_option = new MarkerOptions();
        MarkerOptions W5_option = new MarkerOptions();
        MarkerOptions W6_option = new MarkerOptions();
        MarkerOptions W7_option = new MarkerOptions();
        MarkerOptions W11_1_option = new MarkerOptions();
        MarkerOptions W11_2_option = new MarkerOptions();
        MarkerOptions W12_1_option = new MarkerOptions();

        W2_option.title("W2");        W2_option.snippet("공대 5호관");  W2_option.position(W2);
        W3_option.title("W3");        W3_option.snippet("공대 1호관");  W3_option.position(W3);
        W4_option.title("W4");        W4_option.snippet("사범대, 자과대 2호관");  W4_option.position(W4);
        W5_option.title("W5");        W5_option.snippet("자과대 1호관");  W5_option.position(W5);
        W6_option.title("W6");        W6_option.snippet("약대");  W6_option.position(W6);
        W7_option.title("W7");        W7_option.snippet("인문대");  W7_option.position(W7);
        W11_1_option.title("W11_1");        W11_1_option.snippet("기초 1호관 ");  W11_1_option.position(W11_1);
        W11_2_option.title("W11_2");        W11_2_option.snippet("기초 2호관");  W11_2_option.position(W11_2);
        W12_1_option.title("W12_1");        W12_1_option.snippet("사과대");  W12_1_option.position(W12_1);

        majorMap.addMarker(W2_option);majorMap.addMarker(W4_option);majorMap.addMarker(W6_option);majorMap.addMarker(W11_2_option);
        majorMap.addMarker(W3_option);majorMap.addMarker(W5_option);majorMap.addMarker(W7_option);majorMap.addMarker(W11_1_option);majorMap.addMarker(W12_1_option);




        MarkerOptions E2_option = new MarkerOptions();
        MarkerOptions E1_option=new MarkerOptions();
        MarkerOptions E5_option=new MarkerOptions();
        MarkerOptions E6_option=new MarkerOptions();
        MarkerOptions E10_option=new MarkerOptions();
        MarkerOptions E10_2_option=new MarkerOptions();
        MarkerOptions E10_3_option=new MarkerOptions();

        E1_option.title("E1");        E1_option.snippet("공대1호관");  E1_option.position(E1);
        E2_option.title("E2");      E2_option.snippet("공대2호관"); E2_option.position(E2);
        E6_option.title("E6");      E6_option.snippet("경상대학교"); E6_option.position(E6);
        E10_option.title("E10");      E10_option.snippet("농생대 1호관"); E10_option.position(E10);
        E10_2_option.title("E10_2");      E10_2_option.snippet("농생대 2호관"); E10_2_option.position(E10_2);
        E10_3_option.title("E10_3");      E10_3_option.snippet("농생대 3호관"); E10_3_option.position(E10_3);

        majorMap.addMarker(E1_option);
        majorMap.addMarker(E2_option);
        majorMap.addMarker(E6_option);
        majorMap.addMarker(E10_option);
        majorMap.addMarker(E10_2_option);
        majorMap.addMarker(E10_3_option);

        majorMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent=new Intent(getApplicationContext(),cafe99Info.class);
                intent.putExtra("name",marker.getTitle());
                intent.putExtra("snippet",marker.getSnippet());
                startActivity(intent);
            }
        });

        LatLng cnu=new LatLng(36.370103, 127.346149);
        majorMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cnu,15));

    }
}
