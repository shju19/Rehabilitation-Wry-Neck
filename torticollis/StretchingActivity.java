package com.presslab.torticollis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Sangho on 7/12/2016.
 */
public class StretchingActivity extends AppCompatActivity implements YouTubePlayer.OnInitializedListener {

    // use google analytics
    Tracker mTracker;

    Toolbar toolbar;

    public static final String API_KEY = "AIzaSyDOL5DzckCbP83420bhdcuUT3MJeZO2AO8";

    //http://youtu.be/<VIDEO_ID>
    public static String VIDEO_ID = "_Nz-mUGxXiI";

    public static final String VIDEO_STRETCHING1 = "ZRW--eS7M-o";
    public static final String VIDEO_STRETCHING2 = "wZcN9PR5_gE";
    public static final String VIDEO_STRETCHING3 = "4yaEb8S_Axs";
    public static final String VIDEO_STRETCHING4 = "hoJ3kFSwQdU";
    public static final String VIDEO_STRETCHING5 = "ZQngOjKHHz4";
    public static final String VIDEO_STRETCHING6 = "a4qsdAR28MY";
    public static final String VIDEO_STRETCHING7 = "ufqDRTpuugc";
    public static final String VIDEO_STRETCHING8 = "upH8xQXelK8";
    public static final String VIDEO_STRETCHING9 = "hZf2APWzNO0";
    public static final String VIDEO_STRETCHING10 = "kqCgtBXLJIQ";
    public static final String VIDEO_STRETCHING11 = "t7FWnQ_P_qg";
    public static final String VIDEO_STRETCHING12 = "OoqcKdw9Qt0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);

        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
        mTracker.setScreenName("Stretching Activity");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
        // Enable Display Features. enable google analytics's population statistics
        mTracker.enableAdvertisingIdCollection(true);

        // set toolbar
        toolbar = (Toolbar)findViewById(R.id.toolbar_stretching);
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

        // get the stretchingNumber from MainActivity that was selected by people.
        Intent intent = getIntent();
        int stretchingNumber = intent.getIntExtra("stretchingNumber", 0);

        // connect with xml
        final TextView stretchingName = (TextView) findViewById(R.id.stretchingName);
        final TextView stretchingSeries = (TextView) findViewById(R.id.stretchingSeries);
        final TextView howToStretching = (TextView) findViewById(R.id.howToStretching);
        final TextView stretchingInformation1 = (TextView) findViewById(R.id.stretchingInformation1);
        final TextView stretchingInformation2 = (TextView) findViewById(R.id.stretchingInformation2);
        final TextView stretchingInformation3 = (TextView) findViewById(R.id.stretchingInformation3);
        final TextView stretchingInformation4 = (TextView) findViewById(R.id.stretchingInformation4);
        final TextView stretchingInformation5 = (TextView) findViewById(R.id.stretchingInformation5);
        final TextView stretchingInformation6 = (TextView) findViewById(R.id.stretchingInformation6);
        final TextView stretchingInformation7 = (TextView) findViewById(R.id.stretchingInformation7);
        final TextView stretchingInformation8 = (TextView) findViewById(R.id.stretchingInformation8);
        final TextView stretchingInformation9 = (TextView) findViewById(R.id.stretchingInformation9);
        final TextView stretchingInformation10 = (TextView) findViewById(R.id.stretchingInformation10);

        /** Initializing YouTube player view **/
        YouTubePlayerSupportFragment frag = (YouTubePlayerSupportFragment) getSupportFragmentManager().findFragmentById(R.id.stretchingVideo);
        frag.initialize(API_KEY, this);


        // show stretching video following the stretching number
        // setting stretching name and information each other.
        switch(stretchingNumber) {
            case 1:
                stretchingName.setText("목 뒷부분");
                stretchingSeries.setText("앉아서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING1;
                stretchingInformation1.setText("양손을 깍지 끼고 손을 머리 뒤로 가져가기");
                stretchingInformation2.setText("숨을 들이마시면서 머리를 최대한 숙이기");
                stretchingInformation3.setText("호흡을 멈춘 상태에서 좀 더 숙이기");
                stretchingInformation4.setText("5초간 유지하기");
                stretchingInformation5.setText("숨을 내쉬면서 제자리로 돌아오기");
                stretchingInformation6.setText("2-3회 반복");
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 2:
                stretchingName.setText("목 앞부분");
                stretchingSeries.setText("앉아서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING2;
                stretchingInformation1.setText("양손을 깍지 끼고 엄지를 모아 손을 턱 아래로 가져가기");
                stretchingInformation2.setText("고개를 최대한 뒤로 젖히기");
                stretchingInformation3.setText("호흡을 멈춘 상태에서 고개를 좀 더 밀기");
                stretchingInformation4.setText("5초간 유지하기");
                stretchingInformation5.setText("숨을 내쉬면서 제자리로 돌아오기");
                stretchingInformation6.setText("2-3회 반복");
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 3:
                stretchingName.setText("목 옆부분");
                stretchingSeries.setText("앉아서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING3;
                stretchingInformation1.setText("오른손으로 의자 옆 부분 잡기");
                stretchingInformation2.setText("고개를 반대쪽으로 숙이면서 반대 손으로 머리의 옆 부분을 잡음");
                stretchingInformation3.setText("숨을 멈추고 좀 더 숙이기");
                stretchingInformation4.setText("5초간 유지하기");
                stretchingInformation5.setText("숨을 내쉬면서 제자리로 돌아오기");
                stretchingInformation6.setText("손을 천천히 내리기");
                stretchingInformation7.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 4:
                stretchingName.setText("목 회전1");
                stretchingSeries.setText("앉아서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING4;
                stretchingInformation1.setText("오른손으로 의자 옆 부분 잡기");
                stretchingInformation2.setText("고개를 반대쪽으로 돌리면서 앞으로 숙이고 반대 손으로 머리의 뒷부분을 잡음");
                stretchingInformation3.setText("고개를 최대한 대각선 방향으로 당기기");
                stretchingInformation4.setText("호흡을 멈춘 후 좀 더 당기기");
                stretchingInformation5.setText("5초간 유지하기");
                stretchingInformation6.setText("숨을 내쉬면서 제자리로 돌아오기");
                stretchingInformation7.setText("손을 천천히 내리기");
                stretchingInformation8.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 5:
                stretchingName.setText("목 회전2");
                stretchingSeries.setText("앉아서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING5;
                stretchingInformation1.setText("오른손으로 의자 옆 부분 잡기");
                stretchingInformation2.setText("반대 손으로 머리 옆부분을 잡고 대각선 방향으로 당기기");
                stretchingInformation3.setText("호흡을 멈추고 좀 더 당기기");
                stretchingInformation4.setText("5초간 유지하기");
                stretchingInformation5.setText("숨을 내쉬면서 제자리로 돌아오기");
                stretchingInformation6.setText("손을 천천히 내리기");
                stretchingInformation7.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 6:
                stretchingName.setText("목 회전1");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING6;
                stretchingInformation1.setText("머리를 침대 밖으로 두기");
                stretchingInformation2.setText("머리를 사경 쪽으로 돌려주기");
                stretchingInformation3.setText("5-10초간 유지하기");
                stretchingInformation4.setText("어깨가 따라오지 않도록 고정하기");
                stretchingInformation5.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 7:
                stretchingName.setText("목 옆부분1");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING7;
                stretchingInformation1.setText("머리를 침대 밖으로 두기");
                stretchingInformation2.setText("머리를 사경 반대쪽으로 기울이기");
                stretchingInformation3.setText("5-10초간 유지하기");
                stretchingInformation4.setText("어깨가 따라오지 않도록 고정하기");
                stretchingInformation5.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 8:
                stretchingName.setText("목 회전2");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING8;
                stretchingInformation1.setText("단단한 바닥에 눕기");
                stretchingInformation2.setText("머리를 사경 쪽으로 돌려주기");
                stretchingInformation3.setText("5-10초간 유지하기");
                stretchingInformation4.setText("반대편 어깨가 들리지 않도록 고정하기");
                stretchingInformation5.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 9:
                stretchingName.setText("목 옆부분2");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING9;
                stretchingInformation1.setText("단단한 바닥에 눕기");
                stretchingInformation2.setText("머리를 사경 반대쪽으로 기울이기");
                stretchingInformation3.setText("5-10초간 유지하기");
                stretchingInformation4.setText("어깨가 따라오지 않도록 고정하기");
                stretchingInformation5.setText("좌우 반복을 1회로 2-3회 반복");
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 10:
                stretchingName.setText("어깨, 몸");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING10;
                stretchingInformation1.setText("팔을 천천히 원을 그리면서 돌리기. 5-10회 반복");
                stretchingInformation2.setText("양팔을 펴서 만세 동작을 취하기");
                stretchingInformation3.setText("앞뒤 및 좌우 반복");
                stretchingInformation4.setVisibility(View.GONE);
                stretchingInformation5.setVisibility(View.GONE);
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            case 11:
                stretchingName.setText("허리");
                stretchingSeries.setText("누워서 하는 신장운동");
                VIDEO_ID = VIDEO_STRETCHING11;
                stretchingInformation1.setText("팔과 몸통을 반대 방향으로 돌려주기");
                stretchingInformation2.setText("5-10초간 유지하기");
                stretchingInformation3.setText("좌우 반복");
                stretchingInformation4.setText("");
                stretchingInformation5.setText("");
                stretchingInformation6.setText("");
                stretchingInformation7.setText("");
                stretchingInformation8.setText("");
                stretchingInformation9.setText("");
                stretchingInformation10.setText("");
                break;
            case 12:
                stretchingName.setText("옆으로 누워 목 들기");
                stretchingSeries.setText("누워서 하는 강화운동");
                VIDEO_ID = VIDEO_STRETCHING12;
                stretchingInformation1.setText("사경 쪽이 아래로 가도록 옆으로 눕기");
                stretchingInformation2.setText("머리를 들고 유지하기");
                stretchingInformation3.setText("1회 3분 유지 / 10회 반복");
                stretchingInformation4.setVisibility(View.GONE);
                stretchingInformation5.setVisibility(View.GONE);
                stretchingInformation6.setVisibility(View.GONE);
                stretchingInformation7.setVisibility(View.GONE);
                stretchingInformation8.setVisibility(View.GONE);
                stretchingInformation9.setVisibility(View.GONE);
                stretchingInformation10.setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "동영상을 불러오지 못했습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        /** Start buffering **/
        if (!wasRestored) {
            // player.cueVideo(VIDEO_ID);       // set video. but there is no auto start.
            player.loadVideo(VIDEO_ID);         // set video. and make auto start.
        }
    }

    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {

        @Override
        public void onBuffering(boolean arg0) {
        }

        @Override
        public void onPaused() {
        }

        @Override
        public void onPlaying() {
        }

        @Override
        public void onSeekTo(int arg0) {
        }

        @Override
        public void onStopped() {
        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {

        @Override
        public void onAdStarted() {
        }

        @Override
        public void onError(YouTubePlayer.ErrorReason arg0) {
        }

        @Override
        public void onLoaded(String arg0) {
        }

        @Override
        public void onLoading() {
        }

        @Override
        public void onVideoEnded() {
        }

        @Override
        public void onVideoStarted() {
        }
    };
}