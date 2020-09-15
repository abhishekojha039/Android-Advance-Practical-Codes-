package com.example.lpu;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Fragment_Layouts extends AppCompatActivity {
    Button btn,btn1,btn3;
    FrameLayout frame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__layouts);
        frame=findViewById(R.id.frame);
        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        btn3=findViewById(R.id.btn3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.frame,new fragment1("1 st layout"),"first");
                ft.commit();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.frame,new fragment1("2nd layout"),"first");
                ft.commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 frag=new fragment2();
                Bundle bundle=new Bundle();
                bundle.putString("msg","hello from main Activity");
                frag.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().add(R.id.frame,frag).commit();
            }
        });
    }



    public static  class ExampleFragment extends Fragment{
        View v;
        ImageView imgfg;
        @Override
        public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

            v= inflater.inflate(R.layout.fragment_layout, container, false);
            imgfg=v.findViewById(R.id.imgvw);
            return v;
        }
    }
}
