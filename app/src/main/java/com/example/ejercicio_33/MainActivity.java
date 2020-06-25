package com.example.ejercicio_33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    CanvasEJ miCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miCanvas = new CanvasEJ(this);
        setContentView(miCanvas);
    }

}