package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.database.Cursor;

import android.os.Bundle;
import android.widget.TextView;

public class cafe99Info extends AppCompatActivity {
    private DbOpenHelper mDbOpenHelper;
    private Cursor mCursor;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe99_info);


        mDbOpenHelper = new DbOpenHelper(this);
        mDbOpenHelper.open();
        mDbOpenHelper.create();
        mDbOpenHelper.insertColumn("도서관","N1 CAFE 99","도서관 99");
        mDbOpenHelper.insertColumn("상록회관","N7 CAFE 99","상록회관 99");

        Intent intent=getIntent();

        String get_name=intent.getStringExtra("name");
        String snippet=intent.getStringExtra("snippet");

        Cursor iCursor = mDbOpenHelper.selectColumns();
        while(iCursor.moveToNext()){
            String name = iCursor.getString(iCursor.getColumnIndex("name"));
            String contact = iCursor.getString(iCursor.getColumnIndex("contact"));
            String id = iCursor.getString(iCursor.getColumnIndex("id"));

            if(get_name== name){
                result = name+","+contact+","+id;
                break;
            }
        }
        TextView T1=(TextView)findViewById(R.id.title);
        T1.setText(result);




    }
}
