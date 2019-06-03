package com.presslab.torticollis;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class MyDB{

    private MyDatabaseHelper dbHelper;
    protected SQLiteDatabase database;

    public final static String Tor_TABLE = "Torticollis_Management"; // name of table
    public final static String Tor_ID = "_id"; // id value for Torticollis
    public final static String Tor_DATE = "date";  // date of Torticollis
    public final static String Tor_STRETCHING1 = "stretching1"; // stretching1 of Torticollis
    public final static String Tor_STRETCHING2 = "stretching2"; // stretching2 of Torticollis
    public final static String Tor_STRETCHING3 = "stretching3"; // stretching3 of Torticollis
    public final static String Tor_STRETCHING4 = "stretching4"; // stretching4 of Torticollis
    public final static String Tor_STRETCHING5 = "stretching5"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING6 = "stretching6"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING7 = "stretching7"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING8 = "stretching8"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING9 = "stretching9"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING10 = "stretching10"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING11 = "stretching11"; // stretching5 of Torticollis
    public final static String Tor_STRETCHING12 = "stretching12"; // stretching5 of Torticollis
    public final static String Tor_TODAY_PAIN = "today_pain"; // today_pain of Torticollis
                                                              // today_pain value's type is "String" but it's real type is "int"

    /**
     *
     * @param context
     */
    public MyDB(Context context){                   // why do I add this 'context'??
        dbHelper = new MyDatabaseHelper(context);
    }

    public long insert(String date, int stretching1, int stretching2, int stretching3, int stretching4, int stretching5, int stretching6,
                       int stretching7, int stretching8, int stretching9, int stretching10, int stretching11, int stretching12, int today_pain){
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        // values.put(Tor_ID, id); // "id" don't need to insert because that's made "autoincrement".
        values.put(Tor_DATE, date);
        values.put(Tor_STRETCHING1, stretching1);
        values.put(Tor_STRETCHING2, stretching2);
        values.put(Tor_STRETCHING3, stretching3);
        values.put(Tor_STRETCHING4, stretching4);
        values.put(Tor_STRETCHING5, stretching5);
        values.put(Tor_STRETCHING6, stretching6);
        values.put(Tor_STRETCHING7, stretching7);
        values.put(Tor_STRETCHING8, stretching8);
        values.put(Tor_STRETCHING9, stretching9);
        values.put(Tor_STRETCHING10, stretching10);
        values.put(Tor_STRETCHING11, stretching11);
        values.put(Tor_STRETCHING12, stretching12);
        values.put(Tor_TODAY_PAIN, today_pain);         // why do I have to inert "integer"'s today_pain value into "String"'s Tor_TODAY_PAIN?
        return database.insert(Tor_TABLE, null, values);
    }

    public Cursor cursor() {
        database = dbHelper.getReadableDatabase();
        String[] cols = new String[] {Tor_ID, Tor_DATE, Tor_STRETCHING1, Tor_STRETCHING2, Tor_STRETCHING3, Tor_STRETCHING4, Tor_STRETCHING5,
                Tor_STRETCHING6, Tor_STRETCHING7, Tor_STRETCHING8, Tor_STRETCHING9, Tor_STRETCHING10, Tor_STRETCHING11, Tor_STRETCHING12,
                Tor_TODAY_PAIN};
        Cursor mCursor = database.query(true, Tor_TABLE, cols, null, null, null, null, null, null);
        if (mCursor != null) {mCursor.moveToFirst();}
        return mCursor; // iterate to get each value.
    }

    public boolean update_stretching1(String date, int stretching1) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching1", stretching1);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching2(String date, int stretching2) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching2", stretching2);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching3(String date, int stretching3) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching3", stretching3);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching4(String date, int stretching4) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching4", stretching4);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching5(String date, int stretching5) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching5", stretching5);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching6(String date, int stretching6) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching6", stretching6);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching7(String date, int stretching7) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching7", stretching7);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching8(String date, int stretching8) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching8", stretching8);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching9(String date, int stretching9) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching9", stretching9);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching10(String date, int stretching10) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching10", stretching10);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching11(String date, int stretching11) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching11", stretching11);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_stretching12(String date, int stretching12) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("stretching12", stretching12);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    public boolean update_today_pain(String date, int today_pain) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("today_pain", today_pain);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});
        return true;
    }

    /*
    public boolean update(String date, String stretching1, String stretching2, String stretching3,
                       String stretching4, String stretching5, int today_pain) {
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        // values.put(Tor_ID, id); // "id" don't need to insert because that exist only for counting
        values.put("date", date);
        values.put("stretching1", stretching1);
        values.put("stretching2", stretching2);
        values.put("stretching3", stretching3);
        values.put("stretching4", stretching4);
        values.put("stretching5", stretching5);
        values.put("today_pain", today_pain);
        database.update("Torticollis_Management", values, "date = ?", new String[]{date});      // need to know this coding
        return true;
    }
    */

    public Integer delete(String date) {
        database = dbHelper.getWritableDatabase();
        return database.delete("Torticollis_Management", "id = ?", new String[]{date});         // need to know this coding
    }
}