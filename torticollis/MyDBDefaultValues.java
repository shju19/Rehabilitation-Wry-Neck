package com.presslab.torticollis;

import android.content.Context;

/**
 * Created by Sangho on 7/4/2016.
 */
public class MyDBDefaultValues {

    MyDB mydb;

    public MyDBDefaultValues(Context context){      // why do I have to write the word "context". what's the mean of "context"?

        mydb = new MyDB(context);
        insertDefaultValues();      // insert default values if there is no data.
    }

    public void insertDefaultValues() {
        try {
            if(mydb.cursor().getCount() == 0) {
                mydb.insert("06-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("06-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("07-31", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("08-31", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("09-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("10-31", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("11-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-01", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-02", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-03", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-04", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-05", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-06", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-07", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-08", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-09", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-10", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-11", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-12", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-13", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-14", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-15", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-16", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-17", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-18", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-19", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-20", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-21", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-22", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-23", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-24", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-25", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-26", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-27", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-28", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-29", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-30", 0,0,0,0,0,0,0,0,0,0,0,0,0);
                mydb.insert("12-31", 0,0,0,0,0,0,0,0,0,0,0,0,0);
            }
        } finally {
        }
    }
}