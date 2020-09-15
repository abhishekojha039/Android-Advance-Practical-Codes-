package com.example.lpu;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main23Activity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    Boolean permissionGranted;
    String nm[]={"Atar","Tatar","Sarvatra","Here","there","Everywhere"};
    List<String> list=new ArrayList<String>(Arrays.asList(nm));

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(grantResults[0]==PermissionChecker.PERMISSION_GRANTED) {
            permissionGranted=true;
            Toast.makeText(this, ""+"Permission granted", Toast.LENGTH_SHORT).show();
        }
        if(grantResults[1]==PermissionChecker.PERMISSION_GRANTED)
        {
            permissionGranted=true;
            Toast.makeText(this, ""+"Permission granted for location", Toast.LENGTH_SHORT).show();
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        registerForContextMenu(btn2);
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)== PermissionChecker.PERMISSION_GRANTED)
                {
                    permissionGranted=true;
                }
                else
                {
                    ActivityCompat.requestPermissions(Main23Activity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION},1);
                }
            }
        });




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu=new PopupMenu(getApplicationContext(),btn1);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getTitle().equals("setting")) {

                            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + "9340282831"));
                            startActivity(intent);
                        }
                        else if(item.getTitle().equals("check"))
                        {
                            Intent intent=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+"9340282831"));
                            startActivity(intent);
                        }
                        else
                        {
                            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.nda.nic.in/"));
                            startActivity(intent);
                        }

                        return false;
                    }
                });
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar= (Snackbar) Snackbar.make(v,"hey everyone",Snackbar.LENGTH_LONG);
                snackbar.show();
                snackbar.setAction("yes", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final AlertDialog.Builder builder=new AlertDialog.Builder(Main23Activity.this);
                        builder.setTitle("ETP Viva");
                        builder.setPositiveButton("Call Multiple Times ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                showDialog();
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                              dialog.cancel();
                            }
                        });
                        AlertDialog alertDialog=builder.create();
                        alertDialog.show();
                    }
                });
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, ""+item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
    public  void showDialog()
    {
        final AlertDialog.Builder builder=new AlertDialog.Builder(Main23Activity.this);
        builder.setTitle("Repeated dialog box");
        builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

                showDialog( );
            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setMultiChoiceItems(nm, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                Toast.makeText(Main23Activity.this, ""+nm[which], Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
