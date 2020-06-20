package com.example.ejercicio_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.editTextTextPassword);

    }

    public void Validar(View view){
        String pass = etn.getText().toString();

        if (pass.length() == 0){
            Toast.makeText(this, "Por Favor ingrese contraseña", Toast.LENGTH_LONG).show();
        }else{
            if (pass.trim().equalsIgnoreCase("clave1234")){
                Intent i= new Intent(this, AcercaDe.class);
                startActivity(i);
            }else {
                Toast.makeText(this, "Contraseña Incorrecta", Toast.LENGTH_LONG).show();
            }
        }
    }

/*  Este codigo solo seria necesario si utilizabamos Action Bar Activity
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

 */

    public void acercade(View view){
        Intent i= new Intent(this, AcercaDe.class);
        startActivity(i);
    }

}