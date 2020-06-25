package com.example.ejercicio_39;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;


public class CanvasEJ extends View implements View.OnTouchListener {

    private int corx, cory;

    public CanvasEJ(Context context){
        super(context);
        corx = 100;
        cory = 100;
        setOnTouchListener(this);
    }

    public boolean onTouch(View v, MotionEvent event) {
        corx = (int) event.getX();
        cory = (int) event.getY();
        v.invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        canvas.drawRGB(255, 255, 255);
        canvas.drawRGB(255, 255, 0);
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 255, 0, 0);
        pincel1.setStrokeWidth(4);
        pincel1.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(corx, cory, 20, pincel1);
    }
}
