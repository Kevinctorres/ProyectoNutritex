package com.nutritex.nutritex.ejercicioExtremoMorbido;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.nutritex.nutritex_1.R;
import com.nutritex.nutritex.*;



public class BrazoEM extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivBrazoEM;
    int[]brazoId={
            R.drawable.elevacionbrazos,
            R.drawable.elevacionbrazos2,


    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazoem);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivBrazoEM=(ImageView)(findViewById(R.id.ivBrazoEM));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=brazoId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(BrazoEM.this,MusculoEM.class);
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
        ivBrazoEM.setImageResource(brazoId[i]);

    }
}
