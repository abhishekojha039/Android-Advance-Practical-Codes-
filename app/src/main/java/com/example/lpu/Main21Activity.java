package com.example.lpu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Main21Activity extends AppCompatActivity {
      AlertDialog alertDialog;
      String str;
      String sss;
      String fin;
      String call;
      String ss="  Really   ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
       final AlertDialog.Builder dd=new AlertDialog.Builder(this);
       dd.setMessage("You Really wan't to exit");

        //dd.setCancelable(false);
        dd.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 showAlertDialog();




            }
        });
        dd.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alertDialog.cancel();
            }
        });
        dd.setTitle("Dialog Box");
        alertDialog=dd.create();

    }
    public void showDialog(View v)
    {
        if(alertDialog!=null)
        {
            alertDialog.show();
        }
    }
    int selectedindex=-1;
    public void showAlertDialog() {
        final    String nm[]={"name","place","animal","thing"};
        final AlertDialog.Builder builder = new AlertDialog.Builder(Main21Activity.this);
        builder.setTitle("Dialog box");
        builder.setTitle("you"+ ss+"wan't to exit");
        ss+=ss;
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
                // call function show alert dialog again
                showAlertDialog();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main21Activity.this, ""+call, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setSingleChoiceItems(nm,-1,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              //  Toast.makeText(Main21Activity.this, ""+nm[which], Toast.LENGTH_SHORT).show();
                selectedindex=which;
                call=nm[which];

            }
        });
        final AlertDialog alert = builder.create();
        alert.show();
    }
    public void showcheckedList(View view)
    {
        final ArrayList<String> selectedItems=new ArrayList<>();
     final    String nm[]={"name","place","animal","thing"};

        final AlertDialog.Builder builder = new AlertDialog.Builder(Main21Activity.this);
        builder.setTitle("Multiple selected Dialog");
        builder.setMultiChoiceItems(nm, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked)
                {
                    selectedItems.add(nm[which]);
                }
                else
                {
                    selectedItems.remove(nm[which]);
                }

            }
        });
        builder.setPositiveButton("submit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main21Activity.this, ""+selectedItems.toString(), Toast.LENGTH_SHORT).show();

            }
        });
        builder.show();
    }
}
