package com.example.android.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Paleontology extends AppCompatActivity {

    private TextView tvNamePaleontology,tvPaleontology0,tvPaleontology1,tvPaleontology2,tvPaleontology3,tvPaleontology40,
            tvPaleontology4,tvPaleontology5,tvPaleontology6,tvPaleontology7,tvPaleontology8,tvPaleontology9,
            tvPaleontology10,tvPaleontology11,tvPaleontology12,tvPaleontology13,tvPaleontology14,tvPaleontology15,tvPaleontology16,
            tvPaleontology41,tvPaleontology33,tvPaleontology334,tvPaleontology444,tvPaleontology555;



    private ImageView imViewPaleontology1,imViewPaleontology2,imViewPaleontology3,imViewPaleontology4,imViewPaleontology5,imViewPaleontology6
            ,imViewPaleontology7,imViewPaleontology8;

    private ImageButton btnBack5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paleontology);

        btnBack5 = findViewById(R.id.btnBack5);




        tvNamePaleontology = findViewById(R.id.tvNamePaleontology);
        tvPaleontology0 = findViewById(R.id.tvPaleontology0);
        tvPaleontology1 = findViewById(R.id.tvPaleontology1);
        tvPaleontology2 = findViewById(R.id.tvPaleontology2);
        tvPaleontology3 = findViewById(R.id.tvPaleontology3);
        tvPaleontology33 = findViewById(R.id.tvPaleontology33);
        tvPaleontology334 = findViewById(R.id.tvPaleontology334);
        tvPaleontology40 = findViewById(R.id.tvPaleontology40);
        tvPaleontology41 = findViewById(R.id.tvPaleontology41);
        tvPaleontology4 = findViewById(R.id.tvPaleontology4);
        tvPaleontology444 =findViewById(R.id.tvPaleontology444);
        tvPaleontology555 =findViewById(R.id.tvPaleontology555);
        tvPaleontology5 = findViewById(R.id.tvPaleontology5);
        tvPaleontology6 = findViewById(R.id.tvPaleontology6);
        tvPaleontology7 = findViewById(R.id.tvPaleontology7);
        tvPaleontology8 = findViewById(R.id.tvPaleontology8);
        tvPaleontology9 = findViewById(R.id.tvPaleontology9);
        tvPaleontology10 = findViewById(R.id.tvPaleontology10);
        tvPaleontology11 = findViewById(R.id.tvPaleontology11);
        tvPaleontology12 = findViewById(R.id.tvPaleontology12);
        tvPaleontology13 = findViewById(R.id.tvPaleontology13);
        tvPaleontology14 = findViewById(R.id.tvPaleontology14);
        tvPaleontology15 = findViewById(R.id.tvPaleontology15);
        tvPaleontology16 = findViewById(R.id.tvPaleontology16);



        imViewPaleontology1 = findViewById(R.id.imViewPaleontology1);
        imViewPaleontology2 = findViewById(R.id.imViewPaleontology2);
        imViewPaleontology3 = findViewById(R.id.imViewPaleontology3);
        imViewPaleontology4 = findViewById(R.id.imViewPaleontology4);
        imViewPaleontology5 = findViewById(R.id.imViewPaleontology5);
        imViewPaleontology6 = findViewById(R.id.imViewPaleontology6);

        PhotoViewAttacher pAttacher1;
        pAttacher1 = new PhotoViewAttacher(imViewPaleontology1);
        pAttacher1.update();
        PhotoViewAttacher pAttacher2;
        pAttacher2 = new PhotoViewAttacher(imViewPaleontology2);
        pAttacher2.update();
        PhotoViewAttacher pAttacher3;
        pAttacher3 = new PhotoViewAttacher(imViewPaleontology3);
        pAttacher3.update();
        PhotoViewAttacher pAttacher4;
        pAttacher4 = new PhotoViewAttacher(imViewPaleontology4);
        pAttacher4.update();
        PhotoViewAttacher pAttacher5;
        pAttacher5 = new PhotoViewAttacher(imViewPaleontology5);
        pAttacher5.update();
        PhotoViewAttacher pAttacher6;
        pAttacher6 = new PhotoViewAttacher(imViewPaleontology6);
        pAttacher6.update();







        tvNamePaleontology.setText(R.string.textNamePaleontology1);
        tvPaleontology0.setText(R.string.textPaleontology0);
        tvPaleontology1.setText(R.string.textPaleontology1);
        tvPaleontology2.setText(R.string.textAboutImage1);
        tvPaleontology3.setText(R.string.textPaleontology3);
        tvPaleontology40.setText(R.string.textPaleontology40);
        tvPaleontology41.setText(R.string.textPaleontology41);
        tvPaleontology4.setText(R.string.textPaleontology4);
        tvPaleontology33.setText(R.string.textPaleontology33);
        tvPaleontology334.setText(R.string.textPaleontology34);
        tvPaleontology444.setText(R.string.textPaleontology444);
        tvPaleontology555.setText(R.string.textPaleontology555);
        tvPaleontology5.setText(R.string.textPaleontology5);
        tvPaleontology6.setText(R.string.textPaleontology6);
        tvPaleontology7.setText(R.string.textPaleontology7);
        tvPaleontology8.setText(R.string.textPaleontology8);
        tvPaleontology9.setText(R.string.textPaleontology9);
        tvPaleontology10.setText(R.string.textPaleontology10);
        tvPaleontology11.setText(R.string.textPaleontology11);
        tvPaleontology12.setText(R.string.textPaleontology12);
        tvPaleontology13.setText(R.string.textPaleontology13);
        tvPaleontology14.setText(R.string.textPaleontology14);
        tvPaleontology15.setText(R.string.textPaleontology15);
        tvPaleontology16.setText(R.string.textPaleontology16);



        imViewPaleontology1.setImageResource(R.drawable.paleontologyimage1);



        btnBack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                Animatoo.animateFade(Paleontology.this);
                finish();
            }
        });

    }

    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
        startActivity(intent);
        Animatoo.animateFade(Paleontology.this);
        finish();
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

    // Отключение кнопки Назад

/*    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/
}