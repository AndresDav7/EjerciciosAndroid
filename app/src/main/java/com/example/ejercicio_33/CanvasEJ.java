package com.example.ejercicio_33;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


public class CanvasEJ extends View {
    public CanvasEJ(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        canvas.drawRGB(255, 255, 255);
        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 255, 0, 0);
        pincel1.setStyle(Paint.Style.STROKE);
        for (int f = 0; f < 10; f++) {
            canvas.drawCircle(ancho / 2, alto / 2, f * 15, pincel1);
        }
    }

}

/*
class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(255, 255, 255);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 255, 0, 0);
            pincel1.setStyle(Paint.Style.STROKE);
            for (int f = 0; f < 10; f++) {
                canvas.drawCircle(ancho / 2, alto / 2, f * 15, pincel1);
            }
        }
    }

 */

