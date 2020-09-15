package com.example.lpu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment22 extends Fragment {
    TextView txtvw;
    String msg;

    public  fragment22()
    {
        this("Default");
    }

    @SuppressLint("ValidFragment")
    public fragment22(String msg)
    {
        this.msg=msg;
    }
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_layout2, container, false);
        txtvw=v.findViewById(R.id.txtvw);
        txtvw.setText("");
        txtvw.setText(msg);
        return v;
    }

}
