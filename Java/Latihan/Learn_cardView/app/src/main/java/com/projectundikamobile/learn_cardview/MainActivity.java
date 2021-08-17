package com.projectundikamobile.learn_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected CardView cv_first, cv_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();
        setOnClick();

    }

    public void initial() {

        cv_first = (CardView) findViewById(R.id.cv_first);
        cv_second = (CardView) findViewById(R.id.cv_second);

    }

    public void setOnClick () {

        cv_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), cardView.class);
                startActivity(intent);

            }
        });

        cv_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}