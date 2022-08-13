package com.example.uas_akb_10119275_dafannafikri;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
// Dafana Fikri 10119275 IF7
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override            public void run() {
                startActivity(new Intent(getApplicationContext(),
                        com.example.uas_akb_10119275_dafannafikri.MainActivity.class));
                finish();
            }
        }, 2000L);
    }
}