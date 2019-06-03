package com.presslab.torticollis;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // use google analytics
    Tracker mTracker;

    MyDBDefaultValues myDBDefaultValues;        // start MyDBDefaultValues to confirm if default values are add or not.
    MyDB mydb;
    Cursor cursor;

    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        mTracker.setScreenName("Main Activity");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // Enable Display Features. enable google analytics's population statistics
        mTracker.enableAdvertisingIdCollection(true);

        // make default values. this values occur only once when it created.
        myDBDefaultValues = new MyDBDefaultValues(this);

        // need to confirm this code's meaning
        mydb = new MyDB(this);
        cursor = mydb.cursor();

        // connect with active_main.xml's values
        CheckBox checkStretching1 = (CheckBox) findViewById(R.id.checkStretching1);
        CheckBox checkStretching2 = (CheckBox) findViewById(R.id.checkStretching2);
        CheckBox checkStretching3 = (CheckBox) findViewById(R.id.checkStretching3);
        CheckBox checkStretching4 = (CheckBox) findViewById(R.id.checkStretching4);
        CheckBox checkStretching5 = (CheckBox) findViewById(R.id.checkStretching5);
        CheckBox checkStretching6 = (CheckBox) findViewById(R.id.checkStretching6);
        CheckBox checkStretching7 = (CheckBox) findViewById(R.id.checkStretching7);
        CheckBox checkStretching8 = (CheckBox) findViewById(R.id.checkStretching8);
        CheckBox checkStretching9 = (CheckBox) findViewById(R.id.checkStretching9);
        CheckBox checkStretching10 = (CheckBox) findViewById(R.id.checkStretching10);
        CheckBox checkStretching11 = (CheckBox) findViewById(R.id.checkStretching11);
        CheckBox checkStretching12 = (CheckBox) findViewById(R.id.checkStretching12);
        ImageButton explain_stretching1 = (ImageButton) findViewById(R.id.explain_stretching1);
        ImageButton explain_stretching2 = (ImageButton) findViewById(R.id.explain_stretching2);
        ImageButton explain_stretching3 = (ImageButton) findViewById(R.id.explain_stretching3);
        ImageButton explain_stretching4 = (ImageButton) findViewById(R.id.explain_stretching4);
        ImageButton explain_stretching5 = (ImageButton) findViewById(R.id.explain_stretching5);
        ImageButton explain_stretching6 = (ImageButton) findViewById(R.id.explain_stretching6);
        ImageButton explain_stretching7 = (ImageButton) findViewById(R.id.explain_stretching7);
        ImageButton explain_stretching8 = (ImageButton) findViewById(R.id.explain_stretching8);
        ImageButton explain_stretching9 = (ImageButton) findViewById(R.id.explain_stretching9);
        ImageButton explain_stretching10 = (ImageButton) findViewById(R.id.explain_stretching10);
        ImageButton explain_stretching11 = (ImageButton) findViewById(R.id.explain_stretching11);
        ImageButton explain_stretching12 = (ImageButton) findViewById(R.id.explain_stretching12);
        SeekBar painSetting = (SeekBar) findViewById(R.id.painSetting);
        final TextView painGrade = (TextView) findViewById(R.id.painGrade);         // write the "final" using painGrade in seekBar
        TextView explainPain = (TextView) findViewById(R.id.explainPain);
        Button analytics = (Button) findViewById(R.id.analytics);

        // let cursor located in today's row in database.
        date = new SimpleDateFormat("MM-dd").format(new Date());
        for(int i=0;i<cursor.getCount();i++) {
            if(date.equals(cursor.getString(1))) { break; }// what's deference between equals and '=='?
            cursor.moveToNext();     // if there is not matching, move to next date(row)
        }

        // initialize stretching checkbox and pain box's values. if each value is "O" then check the box.
        // 'unchecked' is default. there is no need to 'unchecked' code.
        // one more thing. if today finished, the checkbox values are initialized to the false and today_pain value to zero.
        if(cursor.getInt(2) == 1) { checkStretching1.setChecked(true); }
        if(cursor.getInt(3) == 1) { checkStretching2.setChecked(true); }
        if(cursor.getInt(4) == 1) { checkStretching3.setChecked(true); }
        if(cursor.getInt(5) == 1) { checkStretching4.setChecked(true); }
        if(cursor.getInt(6) == 1) { checkStretching5.setChecked(true); }
        if(cursor.getInt(7) == 1) { checkStretching6.setChecked(true); }
        if(cursor.getInt(8) == 1) { checkStretching7.setChecked(true); }
        if(cursor.getInt(9) == 1) { checkStretching8.setChecked(true); }
        if(cursor.getInt(10) == 1) { checkStretching9.setChecked(true); }
        if(cursor.getInt(11) == 1) { checkStretching10.setChecked(true); }
        if(cursor.getInt(12) == 1) { checkStretching11.setChecked(true); }
        if(cursor.getInt(13) == 1) { checkStretching12.setChecked(true); }
        painSetting.setProgress(cursor.getInt(14));    // initialize the today's pain setting
        painGrade.setText("" + cursor.getInt(14) + " 등급");     // initialize showing value of today's pain

        // click function that occur when people click the checkbox.
        checkStretching1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching1").build());

                // change database's value when I check the box.
                // the xml box don't need add code to change the box. because it's checkbox xml.
                // both database and xml box's values are changed to "O" or "X" at the same time.
                // because I initialize the xml's box.
                // if I didn't initialize, sometimes it occurs that database's value is "O" but xml's box is "X".

                switch(cursor.getInt(2)) {
                    case 1: mydb.update_stretching1(date, 0); break;
                    case 0: mydb.update_stretching1(date, 1); break;
                    default: break;
                }

                // requery with cursor. because database is updated. if not, cursor query only old value of database.
                // for example, the first value of stretching value 1 is "X" and I check the stretching 1 box.
                // then the xml box show "O",but tue cursor's stretching value 1 show "X". because cursor query only old value.
                // if I requery cursor, the cursor's stretching value 1  show "O".
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching2").build());

                switch(cursor.getInt(3)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching2(date, 0); break;
                    case 0: mydb.update_stretching2(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching3").build());

                switch(cursor.getInt(4)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching3(date, 0); break;
                    case 0: mydb.update_stretching3(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching4").build());

                switch(cursor.getInt(5)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching4(date, 0); break;
                    case 0: mydb.update_stretching4(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching5").build());

                switch(cursor.getInt(6)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching5(date, 0); break;
                    case 0: mydb.update_stretching5(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching6").build());

                switch(cursor.getInt(7)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching6(date, 0); break;
                    case 0: mydb.update_stretching6(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching7").build());

                switch(cursor.getInt(8)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching7(date, 0); break;
                    case 0: mydb.update_stretching7(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching8.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching8").build());

                switch(cursor.getInt(9)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching8(date, 0); break;
                    case 0: mydb.update_stretching8(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching9.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching9").build());

                switch(cursor.getInt(10)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching9(date, 0); break;
                    case 0: mydb.update_stretching9(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching10.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching10").build());

                switch(cursor.getInt(11)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching10(date, 0); break;
                    case 0: mydb.update_stretching10(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching11.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching11").build());

                switch(cursor.getInt(12)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching11(date, 0); break;
                    case 0: mydb.update_stretching11(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click function that occur when people click the checkbox. details are informed upper "checkStretching1"
        checkStretching12.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the stretching button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Check Stretching").setAction("stretching12").build());

                switch(cursor.getInt(13)) {   // change database's value. the xml value is changed by checkbox in xml.
                    case 1: mydb.update_stretching12(date, 0); break;
                    case 0: mydb.update_stretching12(date, 1); break;
                    default: break;
                }

                // requery to database and make cursor today's row.
                setCursorRow();
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video1").build());
                // start the stretching activity
                selectStretching(1);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video2").build());
                // start the stretching activity
                selectStretching(2);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video3").build());
                // start the stretching activity
                selectStretching(3);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video4").build());
                // start the stretching activity
                selectStretching(4);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching5.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video5").build());
                // start the stretching activity
                selectStretching(5);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching6.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video6").build());
                // start the stretching activity
                selectStretching(6);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching7.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video7").build());
                // start the stretching activity
                selectStretching(7);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching8.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video8").build());
                // start the stretching activity
                selectStretching(8);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching9.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video9").build());
                // start the stretching activity
                selectStretching(9);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching10.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video10").build());
                // start the stretching activity
                selectStretching(10);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching11.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video11").build());
                // start the stretching activity
                selectStretching(11);
            }
        });

        // click the imageButton. that open the StretchingActivity.
        explain_stretching12.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // check it when people touch the showing video button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Show Video").setAction("video12").build());
                // start the stretching activity
                selectStretching(12);
            }
        });

        // Ex :
        // If you want values from 3 to 5 with a step of 0.1 (3, 3.1, 3.2, ..., 5)
        // this means that you have 21 possible values in the seekBar.
        // So the range of the seek bar will be [0 ; (5-3)/0.1 = 20].
        final int min = 0, max = 10, step = 1;
        painSetting.setMax( (max - min) / step );
        painSetting.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // check it when people touch the seekBar
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Action").setAction("set pain grade").build());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                // Ex :
                // And finally when you want to retrieve the value in the range you
                // wanted in the first place -> [3-5]
                //
                // if progress = 13 -> value = 3 + (13 * 0.1) = 4.3
                int value = min + (progress * step);

                // set today's pain value
                setTodayPainValue(value);
                painGrade.setText("" + cursor.getInt(14) + " 등급");

                // check it when people touch the seekBar
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Pain Grade").setAction("grade" + value).build());
            }
        });

        // alert dialog when people click the button
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        explainPain.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the analytics button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Action").setAction("explain Pain").build());

                dlgAlert.setMessage("사경으로 인한 목의 불편한 정도를 말합니다.\n\n\n" +
                        "0: 불편함 없음. 목에 힘을 주지 않아도 돌아가지 않음\n\n" +
                        "5: 약간 불편함. 목에 약간 힘을 주면 목이 제대로 펴짐\n\n" +
                        "10: 매우 불편함. 목에 힘을 쌔게 줘야 목이 제대로 펴짐\n\n");
                dlgAlert.setTitle("불편한 정도");
                dlgAlert.setPositiveButton("확인", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
            }
        });

        // click the analytics button.
        analytics.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                // check it when people touch the analytics button
                mTracker.send(new HitBuilders.EventBuilder().setCategory("Action").setAction("show analytics").build());

                // start the analytics activity
                Intent intent = new Intent(MainActivity.this, AnalyticsActivity.class);
                startActivity(intent);
            }
        });
    }


    // requery to database and make cursor today's row.
    public void setCursorRow() {

        // requery with cursor. because database is updated. if not, cursor query only old value of database.
        cursor = mydb.cursor();
        // as I requery the cursor, the cursor's row initialize to fist row.
        // let cursor located in today's row in database.
        for(int i=0;i<cursor.getCount();i++) {
            if(date.equals(cursor.getString(1))) { break; }// what's deference between equals and '=='?
            cursor.moveToNext();     // if there is not matching, move to next date(row)
        }
    }

    public void setTodayPainValue(int value) {
        //update today_pain to 'value'
        mydb.update_today_pain(date, value);

        // requery to database and make cursor today's row.
        setCursorRow();
    }

    public void selectStretching(int number) {
        // start the stretching activity
        Intent intent = new Intent(MainActivity.this, StretchingActivity.class);
        intent.putExtra("stretchingNumber", number);
        startActivity(intent);
    }
}
