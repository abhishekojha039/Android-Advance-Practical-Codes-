package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class interface_fragments1 extends AppCompatActivity implements  fragment3.C{
    public void putValues(String s)
    {
        fragment4 frag=(fragment4) getSupportFragmentManager().findFragmentById(R.id.fra2);
        frag.updateValues(s);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_interface_fragments1);
    }
}
