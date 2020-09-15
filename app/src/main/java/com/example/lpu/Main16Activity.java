package com.example.lpu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main16Activity extends AppCompatActivity implements  Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
     /*   new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Main16Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },2000);*/
   new Handler().postDelayed(this,2000);

    }
    public void run()
    {
        Intent i=new Intent(Main16Activity.this,MainActivity.class);
        startActivity(i);
        finish();

    }

}
