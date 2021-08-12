package com.projectundikamobile.dinamic_color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected ImageView latar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latar = (ImageView) findViewById(R.id.latar);

        latar.setBackgroundColor(Color.parseColor("#e6c365"));

    }
}