package com.example.lpu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class Main6Activity extends AppCompatActivity {
  Button btn1;
  LinearLayout ln;
  RadioButton rd1,rd2,rd3,rd4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        rd3=findViewById(R.id.rd3);
        rd4=findViewById(R.id.rd4);
        btn1=findViewById(R.id.btn1);
        ln=findViewById(R.id.ln);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd1.isChecked())
                {
                    ln.setBackgroundColor(Color.RED);
                    rd1.setBackgroundColor(Color.BLUE);
                    rd2.setBackgroundColor(Color.TRANSPARENT);
                    rd3.setBackgroundColor(Color.TRANSPARENT);
                    rd4.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(rd2.isChecked())
                {
                    ln.setBackgroundColor(Color.BLUE);
                    rd1.setBackgroundColor(Color.TRANSPARENT);
                    rd2.setBackgroundColor(Color.RED);
                    rd3.setBackgroundColor(Color.TRANSPARENT);
                    rd4.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(rd3.isChecked())
                {
                    ln.setBackgroundColor(Color.GREEN);
                    rd1.setBackgroundColor(Color.TRANSPARENT);
                    rd2.setBackgroundColor(Color.TRANSPARENT);
                    rd3.setBackgroundColor(Color.BLUE);
                    rd4.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(rd4.isChecked())
                {
                    ln.setBackgroundColor(Color.DKGRAY);
                    rd1.setBackgroundColor(Color.TRANSPARENT);
                    rd2.setBackgroundColor(Color.TRANSPARENT);
                    rd3.setBackgroundColor(Color.TRANSPARENT);
                    rd4.setBackgroundColor(Color.BLUE);
                }

            }
        });

    }
}
