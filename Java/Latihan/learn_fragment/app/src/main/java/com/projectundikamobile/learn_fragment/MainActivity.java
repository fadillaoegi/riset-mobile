package com.projectundikamobile.learn_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected Button btn1, btn2;
    protected FragmentManager fm;
    protected FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();
        click();

    }

    public void initial() {

        //initial Button
        btn1 = (Button) findViewById(R.id.btnFirst);
        btn2 = (Button) findViewById(R.id.btnSecond);

        //initial fragmen pakai " add() " --> Digunakan untuk saat Tampil pertama
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.container, new firstFragment());
        ft.commit();

    }

    public void click() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initial fragmen pakai " add() " --> Digunakan untuk saat Tampil pertama

//                fm = getSupportFragmentManager();
//                fm.beginTransaction()
//                        .add(R.id.container, new firstFragment())
//                        .commit();

                //initial fragmen pakai " Replace() " --> Digunakan untuk Tampilan kedua dan seterus nya

                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new firstFragment());
                ft.commit();


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initial fragmen pakai " add() " --> Digunakan untuk saat Tampil pertama

//                fm = getSupportFragmentManager();
//                fm.beginTransaction()
//                        .add(R.id.container, new secondFragment())
//                        .commit();

                //initial fragmen pakai " Replace() " --> Digunakan untuk Tampilan kedua dan seterus nya
                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new secondFragment());
                ft.commit();

            }
        });

    }

}