package com.nutritex.nutritex.ejerciciosSobrepeso1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.R;

import com.nutritex.nutritex.MusculoS1;

public class BicepsS1 extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivBicepsS1;
    int[]bicepsId={
            R.drawable.concentrado,
            R.drawable.curlbicep,
            R.drawable.martillo,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicepsf);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivBicepsS1=(ImageView)(findViewById(R.id.ivBiceps));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=bicepsId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(BicepsS1.this, MusculoS1.class);
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
        ivBicepsS1.setImageResource(bicepsId[i]);

    }
}
