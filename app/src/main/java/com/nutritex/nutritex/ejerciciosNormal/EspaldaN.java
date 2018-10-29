package com.nutritex.nutritex.ejerciciosNormal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.R;
import com.nutritex.nutritex.*;

public class EspaldaN extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivEspaldaN;
    int[]espaldaId={
            R.drawable.remohorizontal,
            R.drawable.remomancuerna,
            R.drawable.remopolea,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espaldaf);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivEspaldaN=(ImageView)(findViewById(R.id.ivEspaldaF));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=espaldaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(EspaldaN.this,MusculosNormal.class);
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
        ivEspaldaN.setImageResource(espaldaId[i]);

    }
}
