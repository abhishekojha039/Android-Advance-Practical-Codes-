package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Main14Activity extends AppCompatActivity {
    String [] name={"Calculator Design","color change","Check box and radio button","Spinner , List and Auto Complete Text View","MainClass Activity","Radio Button change","Bottom Navigation , Option Menu and Context Menu","String.xml","Activity Life Cycle","Relative layout","sup              ","Grid Layout","Table layout","Grid   View","Calculator Design","color change","Check box and radio button","Spinner , List and Auto Complete Text View","MainClass Activity","Radio Button change","Bottom Navigation , Option Menu and Context Menu","String.xml","Activity Life Cycle","Relative layout","sup              ","Grid Layout","Table layout","Grid   View"};
    ArrayAdapter apt;
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        grid=findViewById(R.id.grid);
        apt=new ArrayAdapter(this,R.layout.mylayout,name);
        grid.setAdapter(apt);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main14Activity.this, "hello"+name[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
