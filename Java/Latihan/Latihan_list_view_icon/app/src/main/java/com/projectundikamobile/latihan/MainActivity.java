package com.projectundikamobile.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

//    //Data-Data yang Akan dimasukan Pada ListView
//    private String[] mahasiswa = {"About me","Game"};
//
//    //ArrayList digunakan Untuk menampung Data mahasiswa
//    private ArrayList<String> data;
//
////    deklarasi
//    private Button btn;

    ListView list;
    String[] nama_menu = {"My Profile", "My Web", "My Project"};
    Integer[] icon = {R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampil_list adapter = new tampil_list(MainActivity.this, nama_menu, icon);
        list = findViewById(R.id.list);

        list.setAdapter(adapter);

//
//        ListView listView = findViewById(R.id.list);
//        data = new ArrayList<>();
//        getData();
//        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
//        listView.setAdapter(adapter);
    }

//    private void getData(){
//        //Memasukan Semua Data mahasiswa kedalam ArrayList
//        Collections.addAll(data, mahasiswa);
//    }
}