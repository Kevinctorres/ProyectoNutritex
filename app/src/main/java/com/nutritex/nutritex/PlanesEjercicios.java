package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nutritex.nutritex_1.R;

public class PlanesEjercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes_ejercicios);
    }

    public void PlanesEjercicio_inicio(View view){

        Intent intent=new Intent(PlanesEjercicios.this, inicio.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosFlaco(View view){

        Intent intent=new Intent(PlanesEjercicios.this, musculosFlaco.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosN(View view){

        Intent intent=new Intent(PlanesEjercicios.this, MusculosNormal.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosS1(View view){

        Intent intent=new Intent(PlanesEjercicios.this, MusculoS1.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosS2(View view){

        Intent intent=new Intent(PlanesEjercicios.this, MusculoS2.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosO1(View view){

        Intent intent=new Intent(PlanesEjercicios.this, MusculosO.class);
        startActivity(intent);
    }

    public void PlanesEjercicios_musculosEM(View view){

        Intent intent=new Intent(PlanesEjercicios.this, MusculoEM.class);
        startActivity(intent);
    }






}
