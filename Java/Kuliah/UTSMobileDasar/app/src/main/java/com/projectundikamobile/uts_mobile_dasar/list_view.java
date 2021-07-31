package com.projectundikamobile.uts_mobile_dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_view extends AppCompatActivity {

    ListView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        view = findViewById(R.id.list_item);

        String [] judul_menu = new String[] {

                "About me", "Game"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, judul_menu);

        view.setAdapter(adapter);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent i = new Intent (view.getContext(), About_me.class);
                    startActivity(i);

                } else if (position == 1) {

                    Intent i = new Intent (view.getContext(), MainGame.class);
                    startActivity(i);

                }
            }
        });
    }
}