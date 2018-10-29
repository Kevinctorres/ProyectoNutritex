package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nutritex.nutritex_1.R;

public class inicio extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

    }
    public void iniciar(View view){
        startActivity(new Intent(inicio.this, calculadora.class));
    }

    public void actualizar(View view){
        startActivity(new Intent(inicio.this, calculadora.class));
    }

    public void tablaPeso(View view){
        startActivity(new Intent(inicio.this, Tablas.class));
    }
    public void nutricion(View view){
        //startActivity(new Intent(inicio.this, Tablas.class));
    }
    public void ejercicio(View view){
        startActivity(new Intent(inicio.this, PlanesEjercicios.class));
    }
    public void salir(View view){
        startActivity(new Intent(inicio.this, Login.class));
    }
}
