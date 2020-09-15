package com.example.lpu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Main15Activity extends AppCompatActivity {
   TextView hello;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        btn=findViewById(R.id.btn);
        hello=findViewById(R.id.hello);
                hello.setText(getResources().getString(R.string.app_name));
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PopupMenu popupMenu = new PopupMenu(Main15Activity.this, btn);
                        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                        popupMenu.show();
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                Toast.makeText(Main15Activity.this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
                                return true;
                            }
                        });
                    }
                });
    }
}
