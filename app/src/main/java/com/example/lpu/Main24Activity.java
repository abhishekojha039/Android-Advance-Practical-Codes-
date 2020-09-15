package com.example.lpu;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Main24Activity extends AppCompatActivity {
  ProgressBar pb;
  int progressValue=0;
  TextView txtvw;
  Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        pb=findViewById(R.id.pb);
        txtvw=findViewById(R.id.txtvw);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressValue<100)
                {
                    progressValue=progressValue+1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(progressValue);
                            txtvw.setText(progressValue+ "/"+pb.getMax());

                        }
                    });

                    try{
                        Thread.sleep(50);
                    }
                    catch(InterruptedException e)
                    {

                    }


                }
                pb.setVisibility(View.INVISIBLE);
            }

        }).start();


    }
}
