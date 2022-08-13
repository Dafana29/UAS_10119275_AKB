package com.example.uas_akb_10119275_dafannafikri;
// Dafana Fikri 10119275 IF7
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "db_catatan.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table t_catatan (id integer primary key autoincrement, judul text, isi text)";
        Log.d("Data", "onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}

