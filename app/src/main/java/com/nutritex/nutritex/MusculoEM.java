package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nutritex.nutritex_1.R;

import com.nutritex.nutritex.ejercicioExtremoMorbido.*;

public class MusculoEM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculo_em);
    }

    public void MusculoEM_Brazo(View view){

        Intent intent=new Intent(MusculoEM.this, BrazoEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Pierna(View view){

        Intent intent=new Intent(MusculoEM.this, PiernaEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Cardio(View view){

        Intent intent=new Intent(MusculoEM.this, CardioEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Planes(View view){

        Intent intent=new Intent(MusculoEM.this, PlanesEjercicios.class);
        startActivity(intent);
    }
}
