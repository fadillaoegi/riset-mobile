package com.projectundikamobile.a19410100076_m_fadil_muhtarom_laoegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nama, nim,matkul, uts, uas, tugas;
    private Button hitung;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama    = findViewById(R.id.nama);
        nim     = findViewById(R.id.nim);
        matkul  = findViewById(R.id.matkul);
        uts     = findViewById(R.id.uts);
        uas     = findViewById(R.id.uas);
        tugas   = findViewById(R.id.tugas);


        hitung  = findViewById(R.id.hitung);
        hitung.setOnClickListener(this);

        hasil   = findViewById(R.id.hasil);

    }

    @Override
    public void onClick(View v) {

        if ( v == hitung ) {

            Mahasiswa m = new Mahasiswa();

            m.setNama(nama.getText().toString());
            m.setNim(nim.getText().toString());
            m.setUts( Double.parseDouble(uts.getText().toString()));
            m.setUas(Double.parseDouble(uas.getText().toString()));
            m.setTugas(Double.parseDouble(tugas.getText().toString()));

//            Ketika hasil di klik

            double hasil1 = m.getNilaiAkhir();

            hasil.setText("NIlai Anda : " + hasil1);
            Toast.makeText(MainActivity.this,"Hasil nilai : "+String.valueOf(hasil1), Toast.LENGTH_SHORT).show();

        }

    }
}