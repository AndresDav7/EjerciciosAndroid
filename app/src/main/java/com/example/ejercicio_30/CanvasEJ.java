package com.example.ejercicio_30;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Paint;


public class CanvasEJ extends View {
    public CanvasEJ(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 0, 0, 0);
        canvas.drawPoint(ancho / 2, alto / 2, pincel1);
    }

}

