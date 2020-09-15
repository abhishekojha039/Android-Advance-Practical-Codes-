package com.example.lpu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;

import java.util.Random;

public class my_custom_view extends View {
    Paint paint;
    Path path;
    float left,top,right,bottom;
    public my_custom_view(Context context) {
        super(context);
        init();
    }

    public my_custom_view(Context context,  AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void init()
    {
        paint=new Paint();
        path=new Path();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0F);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(50,50,500,500,paint);
        paint.setColor(Color.GREEN);
       /* canvas.drawColor(Color.YELLOW);
        Random random=new Random();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.rgb(random.nextInt()))*/
       canvas.drawCircle(270,270,100,paint);
       canvas.drawRect(205,205,330,330,paint);
       canvas.drawRect(left,top,right,bottom,paint);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                left=event.getX(0);
                top=event.getY(0);
                break;
            case MotionEvent.ACTION_MOVE:
                bottom=event.getY(0);
                right=event.getX(0);
                break;
        }
        invalidate();
        return true;

    }
}
