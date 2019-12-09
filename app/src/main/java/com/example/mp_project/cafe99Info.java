package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;

import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.TextView;

public class cafe99Info extends AppCompatActivity {
    //private DbOpenHelper mDbOpenHelper;
    private Cursor mCursor;
    String result;

    myDBHelper myHelper;
    SQLiteDatabase sqlDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe99_info);
        TextView T1=(TextView)findViewById(R.id.title);

        Intent intent=getIntent();
        String get_name=intent.getStringExtra("name");
        String snippet=intent.getStringExtra("snippet");

        sqlDB=myHelper.getReadableDatabase();
        Cursor cursor;
        cursor=sqlDB.rawQuery("select * from cafe99",null);
        myHelper = new myDBHelper(this);

        while(cursor.moveToNext()){
            if(cursor.getString(0).equals(get_name))
                T1.setText(cursor.getString(0));
        }




    }
    /*
        mDbOpenHelper = new DbOpenHelper(this);
        mDbOpenHelper.open();
        mDbOpenHelper.create();
        mDbOpenHelper.insertColumn("도서관","N1 CAFE 99","도서관 99");
        mDbOpenHelper.insertColumn("상록회관","N7 CAFE 99","상록회관 99");
    */

    /*
        Cursor iCursor = mDbOpenHelper.selectColumns();
        while(iCursor.moveToNext()){
            String name = iCursor.getString(iCursor.getColumnIndex("name"));
            String contact = iCursor.getString(iCursor.getColumnIndex("contact"));
            String id = iCursor.getString(iCursor.getColumnIndex("id"));

            if(get_name== name){
                result = name+","+contact+","+id;
                break;
            }*/


public class myDBHelper extends SQLiteOpenHelper {
    public myDBHelper(Context context) {
        super(context, "cafe99", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE  cafe99 ( name varchar(20),location varchar(30),photo varchar(50));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS cafe99");
        onCreate(db);
    }
}


}
