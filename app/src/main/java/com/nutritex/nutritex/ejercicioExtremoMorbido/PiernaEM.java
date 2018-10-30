package com.nutritex.nutritex.ejercicioExtremoMorbido;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.R;

import com.nutritex.nutritex.MusculoEM;

public class PiernaEM extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivPiernaEM;
    int[]piernaId={
            R.drawable.elevarpierna,
            R.drawable.elevarpierna2,


    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piernaem);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivPiernaEM=(ImageView)(findViewById(R.id.ivPiernaEM));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=piernaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(PiernaEM.this, MusculoEM.class);
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
        ivPiernaEM.setImageResource(piernaId[i]);

    }
}
