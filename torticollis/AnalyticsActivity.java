package com.presslab.torticollis;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Sangho on 7/6/2016.
 *
 * it's not related with google analytic
 */
public class AnalyticsActivity extends AppCompatActivity {

    // use google analytics
    Tracker mTracker;

    Toolbar toolbar;

    MyDB mydb;
    Cursor cursor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        mTracker.setScreenName("Analytics Activity");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // Enable Display Features. enable google analytics's population statistics
        mTracker.enableAdvertisingIdCollection(true);

        // set toolbar
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something you want
                onBackPressed();
            }
        });

        mydb = new MyDB(this);
        cursor = mydb.cursor();

        // set cursor in today's location
        setCursorRow();

        // make a variables
        String[] date = new String[30];
        int[][] stretching = new int[12][30];            // 5 columns, 30 rows
        int[] pain = new int[30];


        // make variables connect with cursor's values.
        for (int i = 29; i >= 0; i--) {
            date[i] = cursor.getString(1);
            for (int j = 0; j < 12; j++) {
                stretching[j][i] = cursor.getInt(j + 2);
            }
            pain[i] = cursor.getInt(14);
            cursor.moveToPrevious();
        }

        /* Every individual value of the raw data should be represented as an Entry.
        * An ArrayList of such Entry objects is used to create a DataSet.
        * Let's create a few BarEntry objects and add them to an ArrayList: */
        // stretching graph1
        ArrayList<BarEntry> stretching_entries1 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            // sit_stretching DataSet
            stretching_entries1.add(new BarEntry(new float[]{stretching[0][i], stretching[1][i], stretching[2][i],
                    stretching[3][i], stretching[4][i]}, i));
        }

        BarDataSet stretching_dataset1 = new BarDataSet(stretching_entries1, "");
        stretching_dataset1.setColors(getColors5());
        stretching_dataset1.setStackLabels(new String[]{"목 뒷부분", "목 앞부분", "목 옆부분", "목 회전1", "목 회전2"});
        stretching_dataset1.setDrawValues(false);  // hide values above the line.

        // Defining the X-Axis Labels
        ArrayList<String> labels = new ArrayList<String>();
        for (int i = 0; i < 30; i++) { labels.add(date[i]); }

        // Creating a BarChart
        BarChart stretching_chart1 = (BarChart) findViewById(R.id.stretching_graph1);
        stretching_chart1.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);  // let X Axis located in bottom
        stretching_chart1.getAxisRight().setDrawLabels(false);     // hide Right Axis Labels
        stretching_chart1.getAxisRight().setDrawAxisLine(false);   // hide Right Axis line
        stretching_chart1.getXAxis().setDrawGridLines(false);      // hide XAxis grid line
        stretching_chart1.getAxisRight().setDrawGridLines(false);  // hide YAxis grid line
        stretching_chart1.setScaleYEnabled(false);                 // disabled pinch to Y line.
        stretching_chart1.getAxisLeft().setAxisMaxValue(5);       // make max value to 10
        stretching_chart1.setDescription("");                      // hide description under-right in chart
        // set date into chart
        BarData stretching_data1 = new BarData(labels, stretching_dataset1);
        stretching_chart1.setData(stretching_data1);

        // stretching graph2
        ArrayList<BarEntry> stretching_entries2 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            // sit_stretching DataSet
            stretching_entries2.add(new BarEntry(new float[]{stretching[5][i], stretching[6][i], stretching[7][i],
                    stretching[8][i], stretching[9][i], stretching[10][i]}, i));
        }

        BarDataSet stretching_dataset2 = new BarDataSet(stretching_entries2, "");
        stretching_dataset2.setColors(getColors6());
        stretching_dataset2.setStackLabels(new String[]{"목 회전1", "목  옆부분1", "목 회전2", "목 옆부분2", "어깨, 몸", "허리"});
        stretching_dataset2.setDrawValues(false);  // hide values above the line.

        // Creating a BarChart
        BarChart stretching_chart2 = (BarChart) findViewById(R.id.stretching_graph2);
        stretching_chart2.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);  // let X Axis located in bottom
        stretching_chart2.getAxisRight().setDrawLabels(false);     // hide Right Axis Labels
        stretching_chart2.getAxisRight().setDrawAxisLine(false);   // hide Right Axis line
        stretching_chart2.getXAxis().setDrawGridLines(false);      // hide XAxis grid line
        stretching_chart2.getAxisRight().setDrawGridLines(false);  // hide YAxis grid line
        stretching_chart2.setScaleYEnabled(false);                 // disabled pinch to Y line.
        stretching_chart2.getAxisLeft().setAxisMaxValue(6);       // make max value to 10
        stretching_chart2.setDescription("");                      // hide description under-right in chart
        // set date into chart
        BarData stretching_data2 = new BarData(labels, stretching_dataset2);
        stretching_chart2.setData(stretching_data2);

        // stretching graph3
        ArrayList<BarEntry> stretching_entries3 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            // sit_stretching DataSet
            stretching_entries3.add(new BarEntry(stretching[11][i], i));
        }

        BarDataSet stretching_dataset3 = new BarDataSet(stretching_entries3, "옆으로 누워 목 들기");
        stretching_dataset3.setColors(getColors1());
        stretching_dataset3.setDrawValues(false);  // hide values above the line.

        // Creating a BarChart
        BarChart stretching_chart3 = (BarChart) findViewById(R.id.stretching_graph3);
        stretching_chart3.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);  // let X Axis located in bottom
        stretching_chart3.getAxisRight().setDrawLabels(false);     // hide Right Axis Labels
        stretching_chart3.getAxisRight().setDrawAxisLine(false);   // hide Right Axis line
        stretching_chart3.getXAxis().setDrawGridLines(false);      // hide XAxis grid line
        stretching_chart3.getAxisRight().setDrawGridLines(false);  // hide YAxis grid line
        stretching_chart3.setScaleYEnabled(false);                 // disabled pinch to Y line.
        stretching_chart3.getAxisLeft().setAxisMaxValue(1);       // make max value to 10
        stretching_chart3.setDescription("");                      // hide description under-right in chart
        // set date into chart
        BarData stretching_data3 = new BarData(labels, stretching_dataset3);
        stretching_chart3.setData(stretching_data3);

        // pain graph
        ArrayList<Entry> pain_entries = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            pain_entries.add(new Entry(pain[i], i));
        }

        LineDataSet pain_dataset = new LineDataSet(pain_entries, "불편한 정도");
        pain_dataset.setColor(Color.parseColor("#004C99"));
        pain_dataset.setCircleColor(Color.parseColor("#004C99"));
        pain_dataset.setDrawValues(false);  // hide values above the line.

        // Creating a LineChart
        LineChart pain_chart = (LineChart) findViewById(R.id.pain_graph);
        pain_chart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);  // let X Axis located in bottom
        pain_chart.getAxisRight().setDrawLabels(false);     // hide Right Axis Labels
        pain_chart.getAxisRight().setDrawAxisLine(false);   // hide Right Axis line
        pain_chart.getXAxis().setDrawGridLines(false);      // hide XAxis grid line
        pain_chart.getAxisRight().setDrawGridLines(false);  // hide YAxis grid line
        pain_chart.setScaleYEnabled(false);                 // disabled pinch to Y line.
        pain_chart.getAxisLeft().setAxisMaxValue(10);       // make max value to 10
        pain_chart.setDescription("");                      // hide description under-right in chart
        // set date into chart
        LineData pain_data = new LineData(labels, pain_dataset);
        pain_chart.setData(pain_data);
    }

    // requery to database and make cursor today's row.
    public void setCursorRow() {

        String date = new SimpleDateFormat("MM-dd").format(new Date());
        // requery with cursor. because database is updated. if not, cursor query only old value of database.
        cursor = mydb.cursor();
        // as I requery the cursor, the cursor's row initialize to fist row.
        // let cursor located in today's row in database.
        Log.d("confirm", "" + cursor.getCount());
        for (int i = 0; i < cursor.getCount(); i++) {
            Log.d("confirm", "" + cursor.getString(1));
            if (date.equals(cursor.getString(1))) {
                break;
            }// what's deference between equals and '=='?
            cursor.moveToNext();     // if there is not matching, move to next date(row)
        }
    }


    private int[] getColors5() {

        int stacksize = 5;

        // have as many colors as stack-values per entry
        int[] colors = new int[stacksize];

        // follow the website "http://cloford.com/resources/colours/500col.htm"
        colors[0] = Color.parseColor("#CCE5FF");
        colors[1] = Color.parseColor("#66B2FF");
        colors[2] = Color.parseColor("#0080FF");
        colors[3] = Color.parseColor("#004C99");
        colors[4] = Color.parseColor("#003366");

        return colors;

    }

    private int[] getColors6() {

        int stacksize = 6;

        // have as many colors as stack-values per entry
        int[] colors = new int[stacksize];

        // follow the website "http://cloford.com/resources/colours/500col.htm"
        colors[0] = Color.parseColor("#CCE5FF");
        colors[1] = Color.parseColor("#66B2FF");
        colors[2] = Color.parseColor("#0080FF");
        colors[3] = Color.parseColor("#004C99");
        colors[4] = Color.parseColor("#003366");
        colors[5] = Color.parseColor("#000066");

        return colors;

    }

    private int[] getColors1() {

        int stacksize = 1;

        // have as many colors as stack-values per entry
        int[] colors = new int[stacksize];

        // follow the website "http://cloford.com/resources/colours/500col.htm"
        colors[0] = Color.parseColor("#004C99");
        // colors[1] = Color.parseColor("#6E7B8B");
        // colors[2] = Color.parseColor("#4876FF");
        // colors[3] = Color.parseColor("#27408B");
        // colors[4] = Color.parseColor("#36648B");
        // colors[5] = Color.parseColor("#366666");

        return colors;

    }
}