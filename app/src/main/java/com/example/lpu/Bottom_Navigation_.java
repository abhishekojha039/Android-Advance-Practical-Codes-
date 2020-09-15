package com.example.lpu;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class Bottom_Navigation_ extends AppCompatActivity {
    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);

                    ft.replace(R.id.frame,new fragment1("1 st layout"),"first");
                   ft.commit();
                    return true;
                case R.id.navigation_dashboard:

                    ft.replace(R.id.frame,new fragment22("2nd  layout"),"first");
                    ft.commit();
                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_notifications);
                    ft.replace(R.id.frame,new fragment1("3rd layout"),"first");
                    ft.commit();


                    return true;
                case R.id.email:
                    ft.replace(R.id.frame,new fragment22("4th layout"),"first");
                    ft.commit();
                    return true;

            }
           // ft.commit();

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom__navigation_);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
