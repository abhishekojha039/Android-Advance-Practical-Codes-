package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
String [] aa={"aaaa","bbbb","cccc","dddd","eeee","ffff","gggg","hhhh","iiii","jjjj","kkkk","llll","mmmm","nnnn","oooo","pppp","qqqq","rrrr","ssss","tttt","uuuu","vvvv","wwww","xxxx","yyyy","zzzz"};
ArrayAdapter apt,apt1;
Spinner sp;
AutoCompleteTextView as;
ListView lstvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        sp=findViewById(R.id.spinner);
        lstvw=findViewById(R.id.lstvw);
        apt=new ArrayAdapter(Main4Activity.this,android.R.layout.simple_expandable_list_item_1,aa);

        sp.setAdapter(apt);
        lstvw.setAdapter(apt);
        as=findViewById(R.id.as);
        as.setAdapter(apt);
        as.setThreshold(1);
        as.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                as.showDropDown();
                return false;
            }
        });

        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                     String str=""+aa[position];
                Toast.makeText(Main4Activity.this, ""+str, Toast.LENGTH_SHORT).show();
            }
        });
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str=""+aa[position];
                Toast.makeText(Main4Activity.this, ""+str, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
