package com.example.lpu;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.KeyEventDispatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class job_Scheduler extends AppCompatActivity {
  Button btn1,btn2;
  JobScheduler jobinfo;
  JobScheduler jobScheduler;
  @RequiresApi (api= Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job__scheduler);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   jobScheduler =(JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
              //  ComponentName componentName=new ComponentName(this,My);
              //  JobInfo.Builder builder=new JobInfo.Builder(123,componentName);
                builder.setMinimumLatency(1*1000);
                builder.setOverrideDeadline(3*1000);
                builder.setPersisted(true);
                builder.setRequiredNetworkType(jobinfo.N);
                jobScheduler.schedule(builder.build());*/


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jobScheduler!=null)
                {
                    jobScheduler.cancel(123);
                    jobScheduler=null;
                    Toast.makeText(job_Scheduler.this, "Job Cancelled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
