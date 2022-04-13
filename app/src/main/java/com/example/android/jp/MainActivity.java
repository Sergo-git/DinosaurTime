package com.example.android.jp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnTheropods,btnMarine,btnPterosaurs,btnSauropods;
           private ImageButton btnBackMenu2,btnInfo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btnTheropods = findViewById(R.id.btnTheropods);
        btnMarine = findViewById(R.id.btnMarine);
        btnPterosaurs = findViewById(R.id.btnPterosaurs);
        btnSauropods = findViewById(R.id.btnSauropods);
        btnBackMenu2 = findViewById(R.id.btnBackMenu2);
        btnInfo = findViewById(R.id.btnInfo);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup viewGroup =findViewById(android.R.id.content);


                TextView tvDescription1,tvDescription2,tvDescription3,tvDescription4;

                ImageButton btnCloseInfo;

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog,viewGroup,false);
                builder.setCancelable(false);
                builder.setView(view1);

                btnCloseInfo=view1.findViewById(R.id.btnCloseInfo);
                tvDescription1=view1.findViewById(R.id.tvDescription1);
                tvDescription2=view1.findViewById(R.id.tvDescription2);
                tvDescription3=view1.findViewById(R.id.tvDescription3);
                tvDescription4=view1.findViewById(R.id.tvDescription4);

                tvDescription1.setText("• Теропо́ды, или хищные динозавры (лат. Theropoda, от др.-греч. θήρ — зверь и πούς — нога, буквально: звероногие) — клада ящеротазовых динозавров, традиционно рассматриваемая в ранге подотряда. Все тероподы перемещались на двух ногах, большинство — хищники, реже всеядные или растительноядные (теризинозавры, орнитомимиды).");
                tvDescription2.setText("• Завропо́ды (лат. Sauropoda, буквально: ящероногие динозавры), — большая группа четвероногих растительноядных динозавров из отряда ящеротазовых, обитавших с конца триасового по меловой периоды (около 210—66 миллионов лет назад) на всех материках, включая Антарктиду.");
                tvDescription3.setText("• Птероза́вры, или летающие ящеры (лат. Pterosauria, от др.-греч. πτερόν «крыло» и σαῦρος «ящер») — отряд вымерших летающих архозавров. Птерозавры — самые ранние позвоночные, которые приобрели эволюционную способность к машущему полёту.");
                tvDescription4.setText("• Водоплавающие рептилии — динозавры, экологически связанные с водоёмами.");

               final AlertDialog alertDialog =builder.create();

               alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                btnCloseInfo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        Animatoo.animateFade(MainActivity.this);
                        finish();
                    }
                });

                alertDialog.show();

            }

        });




        btnBackMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                Animatoo.animateFade(MainActivity.this);
                finish();
            }
        });


        btnTheropods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityPredator.class);
                startActivity(intent);

                Animatoo.animateFade(MainActivity.this);
            }
        });

        btnSauropods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityHerbivorous.class);
                startActivity(intent);

                Animatoo.animateFade(MainActivity.this);
            }
        });

        btnMarine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityMarine.class);
                startActivity(intent);
                Animatoo.animateFade(MainActivity.this);
                finish();
            }
        });

        btnPterosaurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityFlying.class);
                startActivity(intent);
                Animatoo.animateFade(MainActivity.this);
                finish();
            }
        });




    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
        startActivity(intent);
        Animatoo.animateFade(MainActivity.this);
        finish();
    }




    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();

        }
    }

    private void hideSystemUI() {

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
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