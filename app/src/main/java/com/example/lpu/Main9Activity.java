package com.example.lpu;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(getString(R.string.app_name),"on Pause");
        Toast.makeText(this, ""+"on Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Log.i(getString(R.string.app_name),"on Create");
        Toast.makeText(this, ""+"on Create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(getString(R.string.app_name),"on Resume");
        Toast.makeText(this, ""+"on Resume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(getString(R.string.app_name),"on Start");
        Toast.makeText(this, ""+"on Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(getString(R.string.app_name),"on Stop");
        Toast.makeText(this, ""+"on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(getString(R.string.app_name),"on Destroy");
        Toast.makeText(this, ""+"on Destroy", Toast.LENGTH_SHORT).show();
    }
}
