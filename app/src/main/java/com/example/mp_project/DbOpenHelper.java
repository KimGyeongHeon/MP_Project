package com.example.mp_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbOpenHelper{

    private static final String DATABASE_NAME = "cafe99.db";
    private static final int DATABASE_VERSION = 1;
    public static SQLiteDatabase mDB;
    private DatabaseHelper mDBHelper;
    private Context mCtx;

    public class DatabaseHelper extends SQLiteOpenHelper {

        //생성자
        public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
        //최초 DB를 만들때 한번만 onCreate메소드가 호출된다.
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DatabaseCafe99.CreateDB._CREATE);
        }
        //버젼이 업데이트 되었을 경우 DB를 다시 만들어 준다 -> 업데이트
        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS " +DatabaseCafe99.CreateDB._TABLENAME);
            onCreate(db);
        }

    }
    //selectcolumn
    public Cursor selectColumns(){

        return mDB.query(DatabaseCafe99.CreateDB._TABLENAME,null,null,null,null,null,null);
    }

    public long insertColumn(String name, String contact, String id){
        ContentValues values = new ContentValues();
        values.put(DatabaseCafe99.CreateDB.NAME, name);
        values.put(DatabaseCafe99.CreateDB.CONTACT, contact);
        values.put(DatabaseCafe99.CreateDB.ID, id);
        return mDB.insert(DatabaseCafe99.CreateDB._TABLENAME, null,values);

    }

    public DbOpenHelper(Context context){
        this.mCtx = context;
    }

    public DbOpenHelper open() throws SQLException {
        mDBHelper = new DatabaseHelper(mCtx, DATABASE_NAME, null, DATABASE_VERSION);
        mDB = mDBHelper.getWritableDatabase();
        return this;
    }

    public void create(){
        mDBHelper.onCreate(mDB);
    }
    public void close(){
        mDB.close();
    }
}
