package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void Onclick2(View view){

        Intent intent=new Intent(inicio.this, calculadora.class);
        startActivity(intent);
    }

    public void Onclick3(View view){

        Intent intent=new Intent(inicio.this, Tablas.class);
        startActivity(intent);
    }
}
