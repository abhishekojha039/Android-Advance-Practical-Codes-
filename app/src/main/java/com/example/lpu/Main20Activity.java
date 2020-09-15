package com.example.lpu;

import android.nfc.Tag;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main20Activity extends AppCompatActivity {
    ConstraintLayout hello;

    int sum=0;
    ListView lstvw;
    ArrayAdapter adapter;
    private static final String TAG = "Main20Activity";
    String str="";

    String []nm={"MainActivity","Main2Activity","Main3Activity","Main4Activity","Main5Activity","Main6Activity","Main7Activity","Main8Activity","Main9Activity","Main10Activity","Main11Activity","Main12Activity","Main13Activity","Main14Activity","Main15Activity","Main16Activity","Main17Activity","Main18Activity","Main19Activity","MapsActivity"};
    List<String> list=new ArrayList<String>(Arrays.asList(nm));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        hello=findViewById(R.id.hello);
        lstvw=findViewById(R.id.lstvw);
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,list);
        lstvw.setAdapter(adapter);
        lstvw.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  Toast.makeText(Main20Activity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });
       lstvw.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
           @Override
           public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
               mode.setTitle("Selected :"+lstvw.getCheckedItemCount());
           }

           @Override
           public boolean onCreateActionMode(ActionMode mode, Menu menu) {
               mode.getMenuInflater().inflate(R.menu.option_menu,menu);
               return true;
           }

           @Override
           public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
               return false;
           }

           @Override
           public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
             //  mode.invalidate();
                if(R.id.m1==item.getItemId())
                {
                    String selectedValues = "";
                    SparseBooleanArray checkedList = lstvw.getCheckedItemPositions();
                    for(int i=0;i<checkedList.size();i++) {
                        if(checkedList.valueAt(checkedList.keyAt(i))) {
                            selectedValues += (lstvw.getItemAtPosition(checkedList.keyAt(i)) + "\n");
                            Log.i(TAG, "  " + selectedValues);
                            list.remove(checkedList.keyAt(i));
                            adapter.notifyDataSetChanged();
                        }
                    }

                            mode.finish();
                }
               return true;
           }

           @Override
           public void onDestroyActionMode(ActionMode mode) {

           }
       });

    }
}
