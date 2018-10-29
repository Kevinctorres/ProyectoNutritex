package com.nutritex.nutritex.ejercicioObesidad1y2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.R;
import com.nutritex.nutritex.*;

public class Cardio2O extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivCardio2O;
    int[]cardioId={
            R.drawable.trotar,
            R.drawable.nadar,


    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio2s1);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivCardio2O=(ImageView)(findViewById(R.id.ivCardio2s1));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=cardioId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Cardio2O.this,MusculosO.class);
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
        ivCardio2O.setImageResource(cardioId[i]);

    }
}
