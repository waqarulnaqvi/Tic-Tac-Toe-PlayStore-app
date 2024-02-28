package com.syedwaqarul.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

//import com.google.android.gms.ads.MobileAds;
//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

public class StartGame extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

//    String run;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        getWindow().setStatusBarColor(ContextCompat.getColor(StartGame.this, R.color.blue));//Change the status bar color
//        MobileAds.initialize(this);

//        AdView mAdView1 = findViewById(R.id.adView1);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView1.loadAd(adRequest);
//
//        AdView  mAdView2 = findViewById(R.id.adView2);
//        AdRequest adRequest1 = new AdRequest.Builder().build();
//        mAdView2.loadAd(adRequest1);
//        run=getIntent().getStringExtra("Run");

//        if(run!=null) {
            bgplay();
//        }
        findViewById(R.id.player_vs_computer_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                            Intent intent =new Intent(StartGame.this,MainActivity.class);
                intent.putExtra("Name", "computer");
                            startActivity(intent);
                            stop(v);

            }
        });

        findViewById(R.id.player_vs_player_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                            Intent intent =new Intent(StartGame.this,MainActivity.class);

//                            intent.putExtra("mediaPlayerkey", (CharSequence) mediaPlayer);
                            startActivity(intent);
                            stop(v);

            }
        });
    }

public void bgplay()
{
    if(mediaPlayer==null) {
        mediaPlayer = MediaPlayer.create(this, R.raw.bgmusic);
        mediaPlayer.setLooping(true);
    }
    mediaPlayer.start();
//        mediaPlayer.stop();
}

    private void stopPlayer()
    {
        if(mediaPlayer!=null)
        {
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
    public void stop(View v)
    {
        stopPlayer();
    }

    @Override
    public void onBackPressed() {
//        finishAffinity();
        stopPlayer();
        super.onBackPressed();
    }
}
