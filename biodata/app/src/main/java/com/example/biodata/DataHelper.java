package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="biodatadiri.db";
    //untuk mendefinisikan versi database
    private static final int DATABASE_VERSION = 1;
    //untuk memberikan context pada class data helper
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    //untuk membuat data fungsi onCreate yang berguna dalam pembuatan tabel serta pemasukan data ke dalam database
    public void onCreate(SQLiteDatabase db) {
        //untuk membuat tabel database
        String sql = "Create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        //untuk melihat log
        Log.d("Data", "onCreate: " + sql);
        //untuk menyimpan dan menggunakan database
        db.execSQL(sql);
        //untuk memasukkan data kedalam database
        sql = "INSERT INTO biodata(no, nama, tgl, jk, alamat) VALUES ('1', 'Darsiwan', '1996-07-12', 'Laki-Laki', 'Indramayu');";
        //untuk menyimpan dan menggunakan database
        db.execSQL(sql);
    }

    @Override
    //untuk membuat fungsi onUpgrade
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}