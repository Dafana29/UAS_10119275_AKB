package com.example.uas_akb_10119275_dafannafikri;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Dafana Fikri 10119275 IF7

public class CatatanActivity extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper dbHelper;
    TextView txtIsi, txtJudul, txtId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan);

        dbHelper = new DataHelper(this);
        txtJudul = findViewById(R.id.tvJudul);
        txtIsi = findViewById(R.id.tvIsi);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM t_catatan WHERE judul = '" +
                getIntent().getStringExtra("judul") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            txtJudul.setText(cursor.getString(1).toString());
            txtIsi.setText(cursor.getString(2).toString());
        };
    }
}