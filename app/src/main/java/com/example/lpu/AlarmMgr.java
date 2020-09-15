package com.example.lpu;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class AlarmMgr extends AppCompatActivity {
    EditText txtvw,txtvw1;
    MediaPlayer mp;
    Button btn,btn1;
    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_mgr);
        txtvw=findViewById(R.id.txtvw);
        txtvw1=findViewById(R.id.txtvw1);
        mp=new MediaPlayer();
        btn1=findViewById(R.id.btn1);
        btn=findViewById(R.id.btn);
        alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent=new Intent(this,AlarmReceiver.class);
        alarmIntent=PendingIntent.getBroadcast(this,0,intent,0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar=Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int hour=Integer.parseInt(txtvw.getText().toString());
                int minute=Integer.parseInt(txtvw1.getText().toString());
                calendar.set(Calendar.HOUR_OF_DAY,hour);
                calendar.set(Calendar.MINUTE,minute);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),1000,alarmIntent);
                Toast.makeText(AlarmMgr.this, "Alarm set for"+calendar.getTime(), Toast.LENGTH_SHORT).show();

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alarmManager!=null)
                {
                    alarmManager.cancel(alarmIntent);
                    mp.stop();
                    Toast.makeText(AlarmMgr.this, "Alarm Stopped", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
