package com.example.lpu;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fragment3 extends Fragment {
    EditText et1;
    Button bt1;

    interface  C{
        void putValues(String s);
    }
    C commChannel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        commChannel=(C)  context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag_inter, container, false);
        et1=v.findViewById(R.id.inter1);
        bt1=v.findViewById(R.id.interBtn1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commChannel.putValues(et1.getText().toString());
            }
        });
        return  v;

    }
}
