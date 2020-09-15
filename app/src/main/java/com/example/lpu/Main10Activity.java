package com.example.lpu;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public  void  Snack(View v)
    {
        Snackbar snackbar=Snackbar.make(v,"Snack bar",Snackbar.LENGTH_LONG);
        snackbar.setAction("yes", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar sn1=Snackbar.make(v,"go go",Snackbar.LENGTH_LONG);
                sn1.show();
            }
        });

     snackbar.show();
    }
}
