package com.example.admin.sinhvien;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String DATABASE_NAME="demo.sqlite";
    SQLiteDatabase sqLiteDatabase;
    ListView listView;
    ArrayList<SV> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();

        readData();
        Adapter adapter = new Adapter(MainActivity.this, R.layout.layout_item, arrayList);
        listView.setAdapter(adapter);

    }

    private void readData() {
        sqLiteDatabase = DB.initDatabase(this, DATABASE_NAME);
        arrayList.clear();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM SINHVIEN", null);
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            Integer ma = cursor.getInt(0);
            String ten = cursor.getString(1);
            SV sv = new SV(ma, ten);
            arrayList.add(sv);
        }
    }
}

