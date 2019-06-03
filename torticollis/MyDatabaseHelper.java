package com.presslab.torticollis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Torticollis";

    private static final int DATABASE_VERSION = 7;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table Torticollis_Management(" +
            "_id integer primary key autoincrement, " +
            "date text not null, " +           // store date to text type and convert between formats using the built-in date and time functions
            "stretching1 integer, " +
            "stretching2 integer, " +
            "stretching3 integer, " +
            "stretching4 integer, " +
            "stretching5 integer, " +
            "stretching6 integer, " +
            "stretching7 integer, " +
            "stretching8 integer, " +
            "stretching9 integer, " +
            "stretching10 integer, " +
            "stretching11 integer, " +
            "stretching12 integer, " +
            "today_pain integer);";

    public MyDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    // Method is called during an upgrade of the database,
    @Override
    public void onUpgrade(SQLiteDatabase database,int oldVersion,int newVersion){
        Log.w(MyDatabaseHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS Torticollis_Management");
        onCreate(database);
    }
}