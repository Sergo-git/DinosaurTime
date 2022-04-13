package com.example.android.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DescriptionActivity extends AppCompatActivity {


    private ImageButton btnBackForListElement,btnBackMenu1;



    ImageView imageViewDino, imageViewDino1,imageViewDino2,imageViewDino3,imageViewDino4,imageViewDino5,imageViewDino6,imageViewDino7,imageViewDino11, imageViewAggresIndex;
    TextView textViewName,textViewDescript,lifeTime,length,height, weight, aggresionINDEX, length0,smLength,smHeight,kgWeight;

    TextView tvWeight, tvHeight;

     HorizontalScrollView scrollView1;
             ScrollView generalScrollview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description5);

        //getSupportActionBar().hide();

        scrollView1 = findViewById(R.id.scrollView1);
        generalScrollview = findViewById(R.id.generalScrollview);
        generalScrollview.setFillViewport(true);

        tvWeight = findViewById(R.id.tvWeight);
        tvHeight = findViewById(R.id.tvHeight);




        btnBackForListElement = findViewById(R.id.btnBackForListElement);
        btnBackForListElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animatoo.animateFade(DescriptionActivity.this);
                finish();
            }
        });

        btnBackMenu1 = findViewById(R.id.btnBackMenu1);
        btnBackMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                Animatoo.animateFade(DescriptionActivity.this);
                finish();
            }
        });







        ListElement element = (ListElement) getIntent().getSerializableExtra("ListElement");
        imageViewDino = findViewById(R.id.imageViewDino);
        imageViewDino1 = findViewById(R.id.imageViewDino1);
        imageViewDino2 = findViewById(R.id.imageViewDino2);
        imageViewDino3 = findViewById(R.id.imageViewDino3);
        imageViewDino4 = findViewById(R.id.imageViewDino4);
        imageViewDino5 = findViewById(R.id.imageViewDino5);
        imageViewDino6 = findViewById(R.id.imageViewDino6);
        imageViewDino7 = findViewById(R.id.imageViewDino7);
        imageViewAggresIndex =findViewById(R.id.imageViewAggresIndex);


        textViewName = findViewById(R.id.textViewName);
        textViewDescript = findViewById(R.id.textViewDescript);
        lifeTime = findViewById(R.id.lifeTime);
        length = findViewById(R.id.length);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        aggresionINDEX = findViewById(R.id.aggresionINDEX);
        length0 = findViewById(R.id.length0);
        smLength = findViewById(R.id.smLength);
        smHeight= findViewById(R.id.smHeight);
        kgWeight=findViewById(R.id.kgWeight);



        imageViewDino.setImageResource(element.getImage());
        imageViewDino1.setImageResource(element.getImage2());
        imageViewDino2.setImageResource(element.getImage3());
        imageViewDino3.setImageResource(element.getImage4());
        imageViewDino4.setImageResource(element.getImage5());
        imageViewDino5.setImageResource(element.getImage6());
        imageViewDino6.setImageResource(element.getImage7());
        imageViewDino7.setImageResource(element.getImage8());

        imageViewAggresIndex.setImageResource(element.getImageAggressionIndex());


        textViewName.setText(element.getName());
        textViewDescript.setText(element.getDescription());

        lifeTime.setText(element.getLifetime());
        length.setText(element.getLength());
        height.setText(element.getHeight());
        weight.setText(element.getWeight());
        aggresionINDEX.setText(element.getAgression());
        length0.setText(element.getLength0());
        smLength.setText(element.getSmlenght());
        smHeight.setText(element.getSmheight());
        kgWeight.setText(element.getKgweight());




        PhotoViewAttacher pAttacher;
        pAttacher = new PhotoViewAttacher(imageViewDino);
        pAttacher.update();

        PhotoViewAttacher pAttacher1;
        pAttacher1 = new PhotoViewAttacher(imageViewDino1);
        pAttacher1.update();
        PhotoViewAttacher pAttacher2;
        pAttacher2 = new PhotoViewAttacher(imageViewDino2);
        pAttacher2.update();
        PhotoViewAttacher pAttacher3;
        pAttacher3 = new PhotoViewAttacher(imageViewDino3);
        pAttacher3.update();
        PhotoViewAttacher pAttacher4;
        pAttacher4 = new PhotoViewAttacher(imageViewDino4);
        pAttacher4.update();
        PhotoViewAttacher pAttacher5;
        pAttacher5 = new PhotoViewAttacher(imageViewDino5);
        pAttacher5.update();
        PhotoViewAttacher pAttacher6;
        pAttacher6 = new PhotoViewAttacher(imageViewDino6);
        pAttacher6.update();
        PhotoViewAttacher pAttacher7;
        pAttacher7 = new PhotoViewAttacher(imageViewDino7);
        pAttacher7.update();

        PhotoViewAttacher pAttacher8;
        pAttacher8 = new PhotoViewAttacher(imageViewAggresIndex);
        pAttacher8.update();




        invisibleWeight();
        invisibleHeight();






    }

    public void invisibleWeight (){
        if(weight.getText().toString().equals("-")){
            tvWeight.setVisibility(View.GONE);
            weight.setVisibility(View.GONE);
            kgWeight.setVisibility(View.GONE);
        }


    }

    public void invisibleHeight(){
               if(height.getText().toString().equals("-")){
                tvHeight.setVisibility(View.GONE);
                height.setVisibility(View.GONE);
                smHeight.setVisibility(View.GONE);
            }

    }






    @Override
    public void onBackPressed() {
        Animatoo.animateFade(DescriptionActivity.this);
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