package com.example.belajar_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Edo_DBHelper extends SQLiteOpenHelper {

    //deklarasi variabel
    //dalam membuat database, buat variabel nama dan versi database
    private static String nama_database = "akademik.db";
    private static int versi_database = 1;
    private static String sql; //variabel sql untuk query
    private static SQLiteDatabase db; //variabel dari SQLiteDatabase

    //utk Select
    private static Cursor cursor;

    //ini utk DML, buat instance of class dari ContentValues
    private ContentValues contentValues = new ContentValues(); //utk memasukan atribut/nilai dari sebuah tabel


    //Constructor
    public Edo_DBHelper(Context context) {
        super(context, nama_database, null, versi_database);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //selalu awali dengan try...catch
        try
        {
            //query utk create table
            sql = "CREATE TABLE mahasiswa" +
                    "(nim TEXT primary key, " +
                    "nama TEXT)";
            //eksekusi query
            db.execSQL(sql);
        }
        catch (SQLiteException e)
        {
            //apabila create table gagal, maka akan dilempar ke bagian "Catch", lihat di bagian "Terminal" (tampilan terminal mirip dengan CMD)
            System.out.print ("Tabel gagal di create" + e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //selalu awali dengan try...catch
        try
        {
            //query utk cek table. JIka ada yg berbeda, drop table
            sql = "DROP TABLE IF EXISTS mahasiswa";
            //eksekusi query
            db.execSQL(sql);
        }
        catch (SQLiteException e)
        {
            //apabila create table gagal, maka akan dilempar ke bagian "Catch", lihat di bagian "Terminal" (tampilan terminal mirip dengan CMD)
            System.out.print ("Tabel gagal di diupgrade" + e);
        }
    }

    //select data, gunakan kelas Cursor
    public Cursor tampildata()
    {
        //selalu awali dengan try...catch
        try {
            //memberikan grant/akses untuk baca
            db = this.getWritableDatabase();
            //query utk select data
            sql = "SELECT * FROM mahasiswa";
            cursor = db.rawQuery(sql, null); //karena tidak ada argument/parameter, maka diisi null
            return cursor;
        }
        catch (SQLiteException e)
        {
            //apabila create table gagal, maka akan dilempar ke bagian "Catch", lihat di bagian "Terminal" (tampilan terminal mirip dengan CMD)
            return null;
        }
    }

    //insert data, return menggunakan boolean (true=data tersimpan, false=data belum masuk/data gagal tersimpan)
    public boolean simpanData (String nim, String nama)
    {
        //memberikan grant/akses untuk nulis
        db = this.getWritableDatabase();
        //format: contentValues.put(nama_kolom, isi_kolom);
        contentValues.put("nim", nim);
        contentValues.put("nama", nama);
        //periksa jika insert berhasil, nilai = 1
        //tips: gunakan tipe data long. Anda juga bisa menggunakan tipe data int, tapi harus di casting
        long hasil = db.insert("mahasiswa", null, contentValues);
        //periksa jika hasil = -1 (datanya sudah pernah dimasukan)
        if (hasil == -1)
            return false;
        else
            return true;
    }

    //update data, return menggunakan boolean (true=data terupdate, false=data tidak terupdate)
    public boolean ubahData (String nim, String nama)
    {
        //memberikan grant/akses untuk nulis
        db = this.getWritableDatabase();
        //format: contentValues.put(nama_kolom, isi_kolom);
        contentValues.put("nama", nama); //cukup kolom nama saja yang diupdate. Utk primary key (nim) tidak perlu

        //sebelum update, cek datanya ada atau tidak, gunakan SELECT
        sql = "SELECT * " +
            "FROM mahasiswa " +
            "WHERE nim = ?";

        //tampilkan data apakah datanya ada atau tidak, berdasarkan nim. Anda bisa gunakan cursor
        cursor = db.rawQuery(sql, new String [] {nim});

        //jika datanya ada, pasti nilainya > 0
        if (cursor.getCount() > 0)
        {
            //periksa jika update berhasil, nilai = 1
            //tips: gunakan tipe data long. Anda juga bisa menggunakan tipe data int, tapi harus di casting
            long hasil = db.update("mahasiswa", contentValues, "nim=?", new String [] {nim});

            //periksa jika hasil = -1 (datanya tidak ada yang diupdate)
            if (hasil == -1)
                return false;
            else
                return true;
        }
        else //jika tidak ada datanya ketika di SELECT, beri return "false"
        {
            return false;
        }
    }

    //delete data, return menggunakan boolean (true=data terhapus, false=data tidak terhapus)
    public boolean hapusData (String nim)
    {
        //memberikan grant/akses untuk nulis
        db = this.getWritableDatabase();

        //sebelum delete, cek datanya ada atau tidak, gunakan SELECT
        sql = "SELECT * " +
                "FROM mahasiswa " +
                "WHERE nim = ?";

        //tampilkan data apakah datanya ada atau tidak, berdasarkan nim. Anda bisa gunakan cursor
        cursor = db.rawQuery(sql, new String [] {nim});

        //jika datanya ada, pasti nilainya > 0
        if (cursor.getCount() > 0)
        {
            //periksa jika delete berhasil, nilai = 1
            //tips: gunakan tipe data long. Anda juga bisa menggunakan tipe data int, tapi harus di casting
            long hasil = db.delete("mahasiswa", "nim=?", new String [] {nim});

            //periksa jika hasil = -1 (datanya tidak ada yang dihapus)
            if (hasil == -1)
                return false;
            else
                return true;
        }
        else //jika tidak ada datanya ketika di SELECT, beri return "false"
        {
            return false;
        }
    }

}
