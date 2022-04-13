package com.example.android.jp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import static java.net.Proxy.Type.HTTP;

public class AboutApp extends AppCompatActivity {

   private TextView tvEmail,tvVersionApp;
   private ImageButton btnBackMenu7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);




        //getSupportActionBar().hide();

        tvEmail= findViewById(R.id.tvEmail);
        tvVersionApp= findViewById(R.id.tvVersionApp);
        btnBackMenu7 = findViewById(R.id.btnBackMenu7);
        tvEmail.setPaintFlags(tvEmail.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);










        tvVersionApp.setText("Версия 1.0");
        tvEmail.setText("usp_07@mail.ru");

        btnBackMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
                startActivity(intent);
                finish();
                Animatoo.animateFade(AboutApp.this);
            }
        });








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




    public void clickTextView(View view) {

        Intent emailSelectorIntent = new Intent(Intent.ACTION_SENDTO);
        emailSelectorIntent.setData(Uri.parse("mailto:"));

        final Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"usp_07@mail.ru"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Время динозавров");
        emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        emailIntent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        emailIntent.setSelector( emailSelectorIntent );



        if( emailIntent.resolveActivity(getPackageManager()) != null )
            startActivity(emailIntent);
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
        Intent intent = new Intent(getApplicationContext(),StartStartActivity.class);
        startActivity(intent);
        finish();
        Animatoo.animateFade(AboutApp.this);
    }


}