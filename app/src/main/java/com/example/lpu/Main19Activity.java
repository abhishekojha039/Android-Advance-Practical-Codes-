package com.example.lpu;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main19Activity extends AppCompatActivity {
        ConstraintLayout hello;

        int sum=0;
        ListView lstvw;
        ArrayAdapter adapter;

    String []nm={"MainActivity","Main2Activity","Main3Activity","Main4Activity","Main5Activity","Main6Activity","Main7Activity","Main8Activity","Main9Activity","Main10Activity","Main11Activity","Main12Activity","Main13Activity","Main14Activity","Main15Activity","Main16Activity","Main17Activity","Main18Activity","Main19Activity","MapsActivity"};
    List <String> list=new ArrayList<String>(Arrays.asList(nm));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main19);
        lstvw=findViewById(R.id.lstvw);
        hello=findViewById(R.id.hello);

        registerForContextMenu(lstvw);
        adapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,list);
        lstvw.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        lstvw.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(Main19Activity.this, "haappp"+position, Toast.LENGTH_SHORT).show();
                sum=position;
                return false;
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("MyContextMenu");
        menu.add(0,v.getId(),0,"delete");



    }

   @Override
    public boolean onContextItemSelected(MenuItem item) {

       if (item.getTitle().equals("delete"))
        {
            list.remove(sum);
            adapter.notifyDataSetChanged();
   }
        return super.onContextItemSelected(item);
    }

}
