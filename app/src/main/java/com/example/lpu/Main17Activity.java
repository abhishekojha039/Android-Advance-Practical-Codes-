package com.example.lpu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main17Activity extends AppCompatActivity {
  ImageView img;
  Button btn;
    private static  final int CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        Toast.makeText(this, ""+getIntent().getExtras().get("user").toString(), Toast.LENGTH_SHORT).show();
        img=findViewById(R.id.img);
        btn=findViewById(R.id.btn);
        img.setImageResource(android.R.drawable.alert_dark_frame);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CODE)
        {
            if(resultCode==RESULT_OK)
            {
                Bitmap bmp=(Bitmap)data.getExtras().get("data");
                img.setImageBitmap(bmp);
              //String str=MediaStore.Images.Media.insertImage(getContentResolver(),bmp,"image","My image");
                //Uri uri= Uri.parse(str);
            }
        }
      //  super.onActivityResult(requestCode, resultCode, data);
    }
}
