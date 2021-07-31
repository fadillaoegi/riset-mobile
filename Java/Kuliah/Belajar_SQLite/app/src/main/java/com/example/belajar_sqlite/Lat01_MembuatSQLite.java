package com.example.belajar_sqlite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lat01_MembuatSQLite extends AppCompatActivity {

    //deklarasi variabel untuk ke database
    private Edo_DBHelper db;
    private Cursor cursor;
    private StringBuffer buffer; //StringBuffer utk baca data, digunakan utk SElECT

    //deklarasi variabel komponen
    private Button btnTampil_code;
    private Button btnSimpan_code;
    private Button btnUbah_code;
    private Button btnHapus_code;
    private EditText txtNIM_code;
    private EditText txtNama_code;

    //deklarasi variabel tambahan (variabel lokal)
    private String nim, nama;
    private boolean cek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat01_membuat_sqlite);

        //create database dengan cara instance of class
        db = new Edo_DBHelper(getApplicationContext()); //anda bisa juga menggantinya dengan "this"

        //konfigurasi
        btnTampil_code = (Button)findViewById(R.id.btnTampil);
        btnSimpan_code = (Button)findViewById(R.id.btnSimpan);
        btnUbah_code = (Button)findViewById(R.id.btnUbah);
        btnHapus_code = (Button)findViewById(R.id.btnHapus);
        txtNIM_code = (EditText) findViewById(R.id.txtNIM);
        txtNama_code = (EditText) findViewById(R.id.txtNama);

        //script apabila btnTampil diklik
        btnTampil_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //selalu awali dengan try...catch
                try {
                    //ambil datanya dan dimasukan ke dalam variabel cursor
                    cursor = db.tampildata();
                    //jika datanya tidak ada, gunakan methid getCount()
                    if (cursor.getCount() == 0)
                    {
                        Toast.makeText(getApplicationContext(), "Datanya tidak ada", Toast.LENGTH_LONG).show();
                        return;
                    }
                    //anda boleh menambahkan script "else" atau tidak, karena di dalam "if", sudah ada "return"

                    //instance of class dari buffer
                    buffer = new StringBuffer();

                    //gunakan StringBUffer untuk membaca datanya (mirip class BufferedReader di Java)
                    while (cursor.moveToNext())
                    {
                        //append hampir mirip seperti System.out.print
                        buffer.append("NIM = " + cursor.getString(0) + "\n"); //kolom 0 berisi nim
                        buffer.append("Nama = " + cursor.getString(1) + "\n\n"); //kolom 0 berisi nim
                    }

                    //Tampilkan di Alertdialog
                    AlertDialog.Builder builder = new AlertDialog.Builder(Lat01_MembuatSQLite.this);
                    builder.setCancelable(true);
                    builder.setTitle("Hasil Inputan");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }
                catch (Exception e)
                {
                    System.out.print(e);
                }
            }
        });

        //script apabila btnSimpan diklik
        btnSimpan_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //selalu awali dengan try...catch
                try {
                    //setiap inputan di dalam EditText, ditampung ke dalam variabel
                    nim = txtNIM_code.getText().toString();
                    nama = txtNama_code.getText().toString();

                    //insert data
                    boolean cek = db.simpanData(nim, nama);

                    //jika true, akan muncul pesan data tersimpan
                    if (cek == true)
                        Toast.makeText(getApplicationContext(), "Data berhasil disimpan", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "Data gagal disimpan", Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    System.out.print(e);
                }
            }
        });

        //script apabila btnUbah diklik
        btnUbah_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //selalu awali dengan try...catch
                try {
                    //setiap inputan di dalam EditText, ditampung ke dalam variabel
                    nim = txtNIM_code.getText().toString();
                    nama = txtNama_code.getText().toString();

                    //update data
                    boolean cek = db.ubahData(nim, nama);

                    //jika true, akan muncul pesan data terupdate
                    if (cek == true)
                        Toast.makeText(getApplicationContext(), "Data berhasil diubah", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "Data gagal diubah", Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    System.out.print(e);
                }
            }
        });

        //script apabila btnHapus diklik
        btnHapus_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //selalu awali dengan try...catch
                try {
                    //setiap inputan di dalam EditText, ditampung ke dalam variabel
                    nim = txtNIM_code.getText().toString();

                    //delete data
                    boolean cek = db.hapusData(nim);

                    //jika true, akan muncul pesan data terhapus
                    if (cek == true)
                        Toast.makeText(getApplicationContext(), "Data berhasil dihapus", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "Data gagal dihapus", Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    System.out.print(e);
                }
            }
        });




    }
}