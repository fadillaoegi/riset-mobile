package com.projectundikamobile.latihan_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        String[] array_for_list = new String[] {"My Profile", "My Website", "My Application"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, array_for_list);

        list.setAdapter(adapter);

//        Jika pakai OnClick

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if (position == 0) {

                        Intent intent = new Intent(list.getContext(), MainActivity.class);
                        startActivity(intent);

                    } else  if (position == 1) {

                        Intent intent = new Intent(list.getContext(), MainActivity.class);
                        startActivity(intent);

                    } else  if (position == 2) {

                        Intent intent = new Intent(list.getContext(), MainActivity.class);
                        startActivity(intent);

                    }
            }


        });
    }
}