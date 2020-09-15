package com.example.lpu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
   RadioButton check1,check2,check3;
   CheckBox chk1,chk2,chk3;
   LinearLayout ln;
   ImageView IMG;
   String S="";
   TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        check1=findViewById(R.id.rdb1);
        check2=findViewById(R.id.rdb2);
        check3=findViewById(R.id.rdb3);
        ln=findViewById(R.id.ln);
        IMG=findViewById(R.id.IMG);
        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(check1.isChecked())
                {
                    S="Engineering minor  ";
                 //   txt.setText(""+S);
                    Toast.makeText(Main3Activity.this, ""+S, Toast.LENGTH_SHORT).show();
                    IMG.setBackgroundResource(android.R.drawable.arrow_down_float);
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                    chk3.setChecked(false);
                    ln.setBackgroundColor(Color.GRAY);
                }


            }
        });
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check2.isChecked())
                {
                    S="Open minor  ";
                 //   txt.setText(""+S);
                    Toast.makeText(Main3Activity.this, ""+S, Toast.LENGTH_SHORT).show();
                    IMG.setBackgroundResource(R.drawable.ic_launcher_background);
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                    chk3.setChecked(false);
                    ln.setBackgroundColor(Color.BLACK);
                }

            }
        });
        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check3.isChecked())
                {
                    S="Pathway  ";
                 //   txt.setText(""+S);
                    Toast.makeText(Main3Activity.this, ""+S, Toast.LENGTH_SHORT).show();
                    IMG.setBackgroundResource(R.drawable.ic_launcher_foreground);
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                    chk3.setChecked(false);
                    ln.setBackgroundColor(Color.DKGRAY);
                }

            }
        });

    chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(chk1.isChecked())
            {
                chk2.setChecked(false);
                chk3.setChecked(false);
                IMG.setBackgroundResource(android.R.drawable.btn_minus);
                check1.setChecked(false);
                check2.setChecked(false);
                check3.setChecked(false);
                ln.setBackgroundColor(Color.MAGENTA);
            }
        }
    });
        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk2.isChecked())
                {
                    chk1.setChecked(false);
                    chk3.setChecked(false);
                    IMG.setBackgroundResource(android.R.drawable.btn_star);
                    check1.setChecked(false);
                    check2.setChecked(false);
                    check3.setChecked(false);
                    ln.setBackgroundColor(Color.BLUE);
                }
            }
        });
        chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk3.isChecked())
                {
                    chk1.setChecked(false);
                    chk2.setChecked(false);
                    IMG.setBackgroundResource(android.R.drawable.ic_delete);
                    check1.setChecked(false);
                    check2.setChecked(false);
                    check3.setChecked(false);
                    ln.setBackgroundColor(Color.CYAN);
                }
            }
        });

    }

}
