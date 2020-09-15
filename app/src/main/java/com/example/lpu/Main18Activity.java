package com.example.lpu;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Main18Activity extends AppCompatActivity {
  ConstraintLayout cons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        cons=findViewById(R.id.parent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Toast.makeText(this,""+item.getItemId()+"  "+item.getTitle(),Toast.LENGTH_LONG).show();
        if(R.id.item1==item.getItemId())
        {
            Intent intent =new Intent(Main18Activity.this,MainActivity.class);
            intent.putExtra("user","heyyyy");
            //cons.setBackgroundColor(Color.BLUE);
            startActivity(intent);

        }
       else if(R.id.item2==item.getItemId())
        {
            Intent intent =new Intent(Main18Activity.this,Main17Activity.class);
          //  cons.setBackgroundColor(Color.RED);
            intent.putExtra("user","heyyyy");
            startActivity(intent);
        }
       else   if(R.id.item3==item.getItemId())
        {
            Intent intent =new Intent(Main18Activity.this,Main3Activity.class);
            cons.setBackgroundColor(Color.YELLOW);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }
}
