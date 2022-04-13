package com.example.android.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class StartStartActivity extends AppCompatActivity {

    private  ImageButton btnStartDinosaurus, btnStartEra, btnStartAboutApp,btnStartPaleontology,btnStartNews, btnExit;



    private Animation animationButton1, animationButton2;

    ProgressDialog progressDialog;

    TextView tvTEXTTEXTView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start3);




        //getSupportActionBar().hide();

        btnStartDinosaurus = findViewById(R.id.btnStartDinosaurus);
        btnStartEra = findViewById(R.id.btnStartEra);
        btnStartPaleontology =findViewById(R.id.btnStartPaleontology);
        btnStartNews=findViewById(R.id.btnStartNews);
        btnStartAboutApp = findViewById(R.id.btnStartAboutApp);
        btnExit= findViewById(R.id.btnExit);


        animationButton1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_button);
        animationButton2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation_button1);







        btnStartDinosaurus.setOnClickListener(view->{
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            Animatoo.animateFade(StartStartActivity.this);
        });





        btnStartAboutApp.setOnClickListener(view->{
            Intent intent = new Intent(getApplicationContext(),AboutApp.class);
            startActivity(intent);
            Animatoo.animateFade(StartStartActivity.this);
        });



        btnStartEra.setOnClickListener(view->{
            Intent intent = new Intent (getApplicationContext(), Activity_Era.class);
            startActivity(intent);
            Animatoo.animateFade(StartStartActivity.this);
        });


        btnStartPaleontology.setOnClickListener(view->{
            Intent intent = new Intent(getApplicationContext(),Paleontology.class);
            startActivity(intent);
            Animatoo.animateFade(StartStartActivity.this);
        });



        btnStartNews.setOnClickListener(view->{
            Intent intent = new Intent (getApplicationContext(),PaleontologyNews.class);
            startActivity(intent);
            Animatoo.animateFade(StartStartActivity.this);
        });

        btnExit.setOnClickListener(view->{
            onBackPressed();
        });




    }


    public void onBackPressed() {
        //  super.onBackPressed();
        moveTaskToBack(true);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    public void hideSystemUI() {

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }






}