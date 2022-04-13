package com.example.android.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DescriptionEra extends AppCompatActivity {

    private ImageButton btnBackActivityEra, btnBackMenu4;

    private TextView tvNameDescripEra,tvTextEra0,tvTextEra1,tvTextEra2,tvTextEra3,tvTextEra4,tvTextEra5,tvTextEra6;
    private ImageView imDescripEra;
    private ImageView imageEra1,imageEra2,imageEra3,imageEra4,imageEra5, imageEra6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_era);

        btnBackActivityEra = findViewById(R.id.btnBackActivityEra);
        btnBackMenu4 = findViewById(R.id.btnBackMenu4);

        btnBackActivityEra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity_Era.class);
                startActivity(intent);
                Animatoo.animateFade(DescriptionEra.this);
                finish();
            }
        });

        btnBackMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                Animatoo.animateFade(DescriptionEra.this);
                finish();
            }
        });





        ListElementEra elementEra = (ListElementEra) getIntent().getSerializableExtra("ListElementEra");

        tvNameDescripEra = findViewById(R.id.tvNameDescripEra);
        imDescripEra = findViewById(R.id.imDescripEra);

        imageEra1 = findViewById(R.id.imageEra1);
        imageEra2 = findViewById(R.id.imageEra2);
        imageEra3 = findViewById(R.id.imageEra3);
        imageEra4 = findViewById(R.id.imageEra4);
        imageEra5 = findViewById(R.id.imageEra5);
        imageEra6 = findViewById(R.id.imageEra6);

        tvTextEra0 =findViewById(R.id.tvTextEra0);
        tvTextEra1 =findViewById(R.id.tvTextEra1);
        tvTextEra2 =findViewById(R.id.tvTextEra2);
        tvTextEra3 =findViewById(R.id.tvTextEra3);
        tvTextEra4 =findViewById(R.id.tvTextEra4);
        tvTextEra5 =findViewById(R.id.tvTextEra5);
        tvTextEra6 =findViewById(R.id.tvTextEra6);


        tvTextEra0.setText(elementEra.getTextEra0());
        tvTextEra1.setText(elementEra.getTextEra1());
        tvTextEra2.setText(elementEra.getTextEra2());
        tvTextEra3.setText(elementEra.getTextEra3());
        tvTextEra4.setText(elementEra.getTextEra4());
        tvTextEra5.setText(elementEra.getTextEra5());
        tvTextEra6.setText(elementEra.getTextEra6());



        tvNameDescripEra.setText(elementEra.getNameEra());
        imDescripEra.setImageResource(elementEra.getImageEra());
        imageEra1.setImageResource(elementEra.getImageEra1());
        imageEra2.setImageResource(elementEra.getImageEra2());
        imageEra3.setImageResource(elementEra.getImageEra3());
        imageEra4.setImageResource(elementEra.getImageEra4());
        imageEra5.setImageResource(elementEra.getImageEra5());
        imageEra6.setImageResource(elementEra.getImageEra6());


        PhotoViewAttacher pAttacher0;
        pAttacher0 = new PhotoViewAttacher(imDescripEra);
        pAttacher0.update();
        PhotoViewAttacher pAttacher1;
        pAttacher1 = new PhotoViewAttacher(imageEra1);
        pAttacher1.update();
        PhotoViewAttacher pAttacher2;
        pAttacher2 = new PhotoViewAttacher(imageEra2);
        pAttacher2.update();
        PhotoViewAttacher pAttacher3;
        pAttacher3 = new PhotoViewAttacher(imageEra3);
        pAttacher3.update();
        PhotoViewAttacher pAttacher4;
        pAttacher4 = new PhotoViewAttacher(imageEra4);
        pAttacher4.update();
        PhotoViewAttacher pAttacher5;
        pAttacher5 = new PhotoViewAttacher(imageEra5);
        pAttacher5.update();
        PhotoViewAttacher pAttacher6;
        pAttacher6 = new PhotoViewAttacher(imageEra6);
        pAttacher6.update();



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


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),Activity_Era.class);
        startActivity(intent);
        Animatoo.animateFade(DescriptionEra.this);
        finish();
    }
}