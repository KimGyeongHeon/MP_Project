package com.example.mp_project;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

// Database Table
public final class DatabaseCafe99{
    public static final class CreateDB implements BaseColumns{
        public static final String NAME= "name";
        public static final String CONTACT = "contact";
        public static final String ID= "id";
        public static final String _TABLENAME = "cafe99";
        public static final String _CREATE =
                "create table " + _TABLENAME+"("+_ID+"integer primary key autoincrement, "
                        +NAME+" text not null, "+CONTACT+" text not null ,"+ID+"text not null);";
    }
}


