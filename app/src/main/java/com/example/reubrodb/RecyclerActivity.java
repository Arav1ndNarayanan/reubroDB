package com.example.reubrodb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[];
    SQLiteDatabase db;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        db = openOrCreateDatabase("Test", Context.MODE_PRIVATE, null);
        s1=new String[10000];


        Cursor c = db.rawQuery("SELECT * FROM test", null);

        StringBuffer buffer = new StringBuffer();
        while (c.moveToNext()) {
            s1[i]=c.getString(1);
            i++;
        }



        recyclerView=findViewById(R.id.recycler);




        MyAdapter myAdapter =new MyAdapter(this,s1,i);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}