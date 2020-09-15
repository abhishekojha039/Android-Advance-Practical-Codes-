package com.example.lpu;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main8Activity extends AppCompatActivity {
    ArrayAdapter apt;
    ArrayAdapter apt1;
    ListView lstvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        getSupportActionBar().hide();
        lstvw=findViewById(R.id.lstvw);
        apt=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.alphabet));
        apt1=ArrayAdapter.createFromResource(this,R.array.alphabet,android.R.layout.simple_expandable_list_item_1);
        lstvw.setAdapter(apt);
        
    }
}
