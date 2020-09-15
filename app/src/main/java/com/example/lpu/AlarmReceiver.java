package com.example.lpu;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=new MediaPlayer();
        Toast.makeText(context, ""+" Very Alarming", Toast.LENGTH_SHORT).show();
        mp= MediaPlayer.create(context,R.raw.galat_bat);
        mp.start();
    }
}
