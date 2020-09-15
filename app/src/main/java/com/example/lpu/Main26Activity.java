package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Main26Activity extends AppCompatActivity {
  RatingBar rb1,rb2,rb3;
    String nm,nm1,nm2;
  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        btn=findViewById(R.id.btn1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main26Activity.this, ""+rb1.getRating()+"/"+rb1.getNumStars(), Toast.LENGTH_SHORT).show();
                Toast.makeText(Main26Activity.this, ""+rb2.getRating()+"/"+rb2.getNumStars(), Toast.LENGTH_SHORT).show();
                Toast.makeText(Main26Activity.this, ""+rb3.getRating()+"/"+rb3.getNumStars(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
