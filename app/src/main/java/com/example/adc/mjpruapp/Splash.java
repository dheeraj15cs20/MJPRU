package com.example.adc.mjpruapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private  static int SPLASH_TIME_OUT= 3000;
    ImageView iv1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv1=(ImageView)findViewById(R.id.iv1);
        tv1=(TextView)findViewById(R.id.tv1);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iv1.startAnimation(myanim);
        Animation myanim1 = AnimationUtils.loadAnimation(this, R.anim.mytransition1);
        myanim1.reset();
        tv1.clearAnimation();
        tv1.startAnimation(myanim1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent I= new Intent(Splash.this,MainActivity.class);
                startActivity(I);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
