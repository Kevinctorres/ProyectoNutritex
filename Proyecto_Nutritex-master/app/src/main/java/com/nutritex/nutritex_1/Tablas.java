package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tablas extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivTabla;
    int[]tablaId={
            R.drawable.tablamujeres,
            R.drawable.tablahombres,
            };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablas);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivTabla=(ImageView)(findViewById(R.id.ivTabla));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=tablaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Tablas.this,inicio.class);
        startActivity(miIntent);
    }

    @Override
    public void onClick(View view) {

        int id=view.getId();
        if(id==R.id.btSiguiente){
            i++;
            if (i==total) i=0;

        }
        if(id==R.id.btAnterior){
            i--;
            if (i==-1)i=total-1;

        }
        ivTabla.setImageResource(tablaId[i]);

    }
}
