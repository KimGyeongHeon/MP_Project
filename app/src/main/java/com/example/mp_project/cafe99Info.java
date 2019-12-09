package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;

import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class cafe99Info extends AppCompatActivity {
    //private DbOpenHelper mDbOpenHelper;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe99_info);
        TextView T1=(TextView)findViewById(R.id.title);
        ImageView I1=(ImageView)findViewById(R.id.inside_map) ;
        Intent intent=getIntent();
        String get_name=intent.getStringExtra("name");
        String snippet=intent.getStringExtra("snippet");

        String[] cafe={ "언어교육원99","생활과학대학99","3학생회관99","1학생회관99, 영탑","2학생회관99","상록회관 와야","도서관99","기숙사 와야"};
        String[] cafeInfo={ "언어교육원 1층에 있다","생활과학대학 식당 안에 있다","3학생회관 1층 테이크 아웃만 가능하다","99는 1층에 있고 야외 테라스에 있다, 영탑은 2층에 있다","2학생회관99","상록회관 와야","도서관99","기숙사 와야"};


        //String[] cafeImage={"언교원99","생과대99","삼학99","일학99","이학99","상록 와야","도서관99","기숙사 와야"};
            for(int i=0;i<cafe.length;i++)
            {
                if(snippet.toString().equals(cafe[i]))
                {
                    T1.setText(snippet+"   "+get_name);
                    //I1.setImageResource(Integer.parseInt(cafeImage[i].toString()));
                }
                else
                    continue;

            }
        }

}
