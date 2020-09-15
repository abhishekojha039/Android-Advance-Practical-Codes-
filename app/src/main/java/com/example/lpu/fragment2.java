package com.example.lpu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment2 extends Fragment {
  TextView txt1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_layout2, container, false);
        txt1=v.findViewById(R.id.txtvw);
        txt1.setText("");
      txt1.setText(getArguments().getString("msg"));
        return  v;
    }
}
