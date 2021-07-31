package com.projectundikamobile.focus_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class klik extends AppCompatActivity {

    private TextView a1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klik);

        a1 = (TextView) findViewById(R.id.a1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                click();

            }
        });

    }

    protected void click(){

        Intent intent = new Intent(this, klik2.class);
        startActivity(intent);

    }

}