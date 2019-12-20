package com.app.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Sec_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_act);
    }

        public void Incidencia2(View v)
    {
        Toast toast2 = Toast.makeText((getApplicationContext()),"Incidencia provocada 2", Toast.LENGTH_SHORT);
        toast2.setGravity(Gravity.CENTER,0,0);
    }

    public void Incidencia1(View v)
    {
        Toast toast1 = Toast.makeText((getApplicationContext()),"Incidencia provocada", Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0,0);
    }
}
