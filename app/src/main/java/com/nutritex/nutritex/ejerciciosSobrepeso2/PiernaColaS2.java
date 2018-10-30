package com.nutritex.nutritex.ejerciciosSobrepeso2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.nutritex.nutritex_1.R;

import com.nutritex.nutritex.MusculoS2;

public class PiernaColaS2 extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivPiernaColas2;
    int[]piernacolaId={
            R.drawable.sentadilla,
            R.drawable.pesomuerto,
            R.drawable.zancadas,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piernacolaf);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivPiernaColas2=(ImageView)(findViewById(R.id.ivPiernaColaF));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=piernacolaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(PiernaColaS2.this, MusculoS2.class);
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
        ivPiernaColas2.setImageResource(piernacolaId[i]);

    }
}
