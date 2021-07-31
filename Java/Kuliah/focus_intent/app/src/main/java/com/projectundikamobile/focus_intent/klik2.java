package com.projectundikamobile.focus_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class klik2 extends AppCompatActivity {

    private TextView a2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klik2);

        click();
    }


    public void click(){

        a2 = findViewById(R.id.a2);

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(klik2.this, klik3.class);
                startActivity(intent);
            }
        });

    }

}