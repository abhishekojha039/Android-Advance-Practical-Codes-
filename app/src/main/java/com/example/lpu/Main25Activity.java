package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main25Activity extends AppCompatActivity {
    ScrollView scrvw;
    TextView txtvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        txtvw=findViewById(R.id.txtvw);
        scrvw=findViewById(R.id.scrvw);

    }
}
