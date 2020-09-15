package com.example.lpu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    EditText edt;
    Button btn;
    LinearLayout  ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      ln=findViewById(R.id.ln);
        edt =findViewById(R.id.edt);
        btn=findViewById(R.id.btn);

    }
    public void show(View view)
    {
        double temp =Double.parseDouble(edt.getText().toString());
        edt.setText(""+temp);
        if(temp>101 || temp<97)
        {
            edt.setBackgroundColor(Color.RED);
            ln.setBackgroundColor(Color.YELLOW);

        }
      else  if(temp>=97 && temp<=97)
        {
            edt.setBackgroundColor(Color.GREEN);
            ln.setBackgroundColor(Color.RED);
        }
        else  if(temp>99 && temp<=101)
        {
            edt.setBackgroundColor(Color.YELLOW);
            ln.setBackgroundColor(Color.GREEN);
        }


    }
}
