package com.example.lpu;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Main11Activity extends AppCompatActivity {
ListView lstvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        lstvw=findViewById(R.id.lstvw);
    }
public void Snack(View v)
{
    Snackbar sn  = Snackbar.make(v,"hello",Snackbar.LENGTH_LONG);
    sn.show();
}



}

