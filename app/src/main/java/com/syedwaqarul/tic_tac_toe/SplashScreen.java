package com.syedwaqarul.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashScreen.this, R.color.blue));//Change the status bar color
        LottieAnimationView lottieAnimationView = findViewById(R.id.tic_tac_toe_animation);
        lottieAnimationView.setSpeed(5.5f); // Adjust the speed value as needed

//        Thread thread=new Thread(){
//            public void run()
//            {
//                try {
////                    To give delay in finally
//                    sleep(2500);//2 second
//                }
//                catch (Exception e)
//                {
//                    e.printStackTrace();//Mother of all the exceptions
//                }
//                finally {
//                    Intent intent =new Intent(SplashScreen.this,StartGame.class);
//                    startActivity(intent);
//                }
//            }
//
//        };thread.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finishAffinity();
                Intent intent =new Intent(SplashScreen.this,StartGame.class);
                startActivity(intent);
            }
        }, 800); // 3000 milliseconds (3 seconds)
    }

}