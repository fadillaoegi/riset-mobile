package com.projectundikamobile.learn_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected CardView cv_first, cv_second;

    public void initial() {

        cv_first = (CardView) findViewById(R.id.cv_first);
        cv_second = (CardView) findViewById(R.id.cv_second);

        cv_first.setOnClickListener(this);
        cv_second.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();

    }


    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()) {

            case R.id.cv_first:

                intent = new Intent(this, tes.class);
                startActivity(intent);
                break;

            case R.id.cv_second:

                intent = new Intent(this, cobak.class);
                startActivity(intent);
                break;

        }

    }
}