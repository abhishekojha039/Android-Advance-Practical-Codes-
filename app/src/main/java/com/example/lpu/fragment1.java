package com.example.lpu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment1 extends Fragment {
  TextView txtvw;
  String msg;

  public  fragment1()
  {
      this("Default");
  }

  @SuppressLint("ValidFragment")
  public fragment1(String msg)
  {
      this.msg=msg;
  }
  View v;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

            v= inflater.inflate(R.layout.fragment_layout, container, false);
            txtvw=v.findViewById(R.id.txtvw);
            txtvw.setText("");
            txtvw.setText(msg);
            return v;
    }
}

