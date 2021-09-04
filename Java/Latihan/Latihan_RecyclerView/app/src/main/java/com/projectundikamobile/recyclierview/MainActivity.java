package com.projectundikamobile.recyclierview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements adapter.AdapterListenesr {

    protected adapter adapter;
    protected RecyclerView rv;
    protected ArrayList<getSet> aLDev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
        initial();


    }

    public void initial (){

        rv = (RecyclerView) findViewById(R.id.rv);
        adapter = new adapter(aLDev);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);

    }

    public void getData(){

        aLDev = new ArrayList<>();
        aLDev.add(new getSet("Fadil", "C++", "Game Developer"));
        aLDev.add(new getSet("Muhtarom", "Java", "Mobile Developer"));
        aLDev.add(new getSet("Laoegi", "PHP", "Web Developer"));
        aLDev.add(new getSet("Anisa", "Phyton", "Data Analis"));
        aLDev.add(new getSet("Ulfa", "Java Script", "Back-End Developer"));
        aLDev.add(new getSet("Oki", "Ruby", "Front-end Developer"));
        aLDev.add(new getSet("faris", "swift", "iOS Developer"));
        aLDev.add(new getSet("Luxman", "Figma", "Disigner"));

    }



}