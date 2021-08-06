package com.projectundikamobile.latihan;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class tampil_list extends ArrayAdapter<String> {

    private Activity context;
    private  String[] nama_menu;
    private Integer[] icon;

    public tampil_list(@NonNull Activity context, String[] nama_menu, Integer[] icon) {
        super(context, R.layout.list, nama_menu);

        this.context = context;
        this.icon = icon;
        this.nama_menu = nama_menu;

    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list, null, true);
        TextView txt_namaMenu = rowView.findViewById(R.id.txt_menu);
        ImageView gambar = rowView.findViewById(R.id.icon);

        txt_namaMenu.setText(nama_menu[position]);
        gambar.setImageResource(icon[position]);

        return  rowView;
    }
}
