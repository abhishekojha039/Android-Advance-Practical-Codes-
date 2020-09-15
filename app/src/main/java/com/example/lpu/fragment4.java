package com.example.lpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment4 extends Fragment {
      TextView txtvw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.frag_inter2, container, false);
       txtvw=v.findViewById(R.id.interTxtvw2);
       return v;
    }
    public void updateValues(String s){
        txtvw.setText(s);
    }
}
