package com.example.lpu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
   ListView lstvw;
   ArrayAdapter apt;
    String [] name={"Calculator Design","color change","Check box and radio button","Spinner , List and Auto Complete Text View","MainClass Activity","Radio Button change","Bottom Navigation , Option Menu and Context Menu","String.xml","Activity Life Cycle","Relative layout","sup              ","Grid Layout","Table layout","Grid   View","Translation","Intent And Splash Screen","Camera and View","Menu    ","Context Menu    ","Google maps          ","Action Mode       ","Alert Dialog","Permissions   ","Etp   Practice","Progress Bar","Scroll  View","Rating Bar","Custom tool  Bar    ","Alarm Mnager    ","Fragment Layouts","interface_fragment","Bottom_Navigation_","Canvas"};
    String []nm={"MainActivity","Main2Activity","Main3Activity","Main4Activity","Main5Activity","Main6Activity","Main7Activity","Main8Activity","Main9Activity","Main10Activity","Main11Activity","Main12Activity","Main13Activity","Main14Activity","Main15Activity","Main16Activity","Main17Activity","Main18Activity","Main19Activity","MapsActivity","Main20Activity","Main21Activity","Main22Activity","Main23Activity","Main24Activity","Main25Activity","Main26Activity","custom_tool_bar","AlarmMgr","Fragment_Layouts","interface_fragments1","Bottom_Navigation_","Canvas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        lstvw=findViewById(R.id.lstvw);
        apt =new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,name);
        lstvw.setAdapter(apt);
        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String d=nm[position];
                try
                {
                    Class cls=Class.forName("com.example.lpu."+d);
                    Intent i=new Intent(Main5Activity.this,cls);
                    startActivity(i);
                }
                catch (ClassNotFoundException e)
                {
                    Toast.makeText(Main5Activity.this, ""+"Class Not Found", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
