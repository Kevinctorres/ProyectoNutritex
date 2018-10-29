package com.nutritex.nutritex.ejerciciosFlacos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.R;
import com.nutritex.nutritex.musculosFlaco;

public class BicepsF extends AppCompatActivity implements View.OnClickListener{


    Button btSiguiente, btAnterior;
    ImageView ivBiceps;
    int[]bicepId={
            R.drawable.curlbicep,
            R.drawable.martillo,
            R.drawable.concentrado,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicepsf);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivBiceps=(ImageView)(findViewById(R.id.ivBiceps));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=bicepId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(BicepsF.this,musculosFlaco.class);
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
        ivBiceps.setImageResource(bicepId[i]);

    }
}
