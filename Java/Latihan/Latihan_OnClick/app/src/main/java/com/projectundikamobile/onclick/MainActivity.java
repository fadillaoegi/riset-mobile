package com.projectundikamobile.onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inisialisasi();
        Onclick();


    }

    public void inisialisasi(){

        b = findViewById(R.id.button);

    }

    public void Onclick(){

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Masuk_klik.class);

                startActivity(intent);

            }
        });

    }

}