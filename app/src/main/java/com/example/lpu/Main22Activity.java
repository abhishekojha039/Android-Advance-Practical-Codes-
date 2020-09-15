package com.example.lpu;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.Permission;

public class Main22Activity extends AppCompatActivity {
   Button btn;
   boolean permissionGranted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( ContextCompat.checkSelfPermission(getApplicationContext(),android.Manifest.permission.WRITE_EXTERNAL_STORAGE)== PermissionChecker.PERMISSION_GRANTED) {
                   permissionGranted = true;
               }
               else
               {
                   ActivityCompat.requestPermissions(Main22Activity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION},1);
               }


            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]==PermissionChecker.PERMISSION_GRANTED)
        {
            permissionGranted=true;
            Toast.makeText(this, "External Granted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "External Not Granted", Toast.LENGTH_SHORT).show();
            permissionGranted=false;
        }
        if(grantResults[1]==PermissionChecker.PERMISSION_GRANTED)
        {
            Toast.makeText(this, "Location granted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "NO location Access", Toast.LENGTH_SHORT).show();
        }
    }
}
