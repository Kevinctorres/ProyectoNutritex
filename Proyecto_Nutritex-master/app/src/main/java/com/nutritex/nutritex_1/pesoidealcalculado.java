package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pesoidealcalculado extends AppCompatActivity {

    TextView tvIMC;
    TextView tvSegunIMC;
    TextView tvMinRecomendado;
    TextView tvMaxRecomendado;

    String segunIMC;
    String minRecomendado;
    String maxRecomendado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesoidealcalculado);

        tvIMC=(TextView)findViewById(R.id.tvIMC);
        tvSegunIMC=(TextView)findViewById(R.id.tvSegunIMC);
        tvMinRecomendado=(TextView)findViewById(R.id.tvMinRecomendado);
        tvMaxRecomendado=(TextView)findViewById(R.id.tvMaxRecomendado);
        Bundle bundle=getIntent().getExtras();
        String imc=bundle.getString("imc").toString();
        tvIMC.setText(imc);
        double indice = Double.parseDouble(imc);

         if(indice<=18.5){
             segunIMC="Bajo";
             minRecomendado="18.5";
             maxRecomendado="Alimentese";
         } else if(indice>18.5 && indice<=24.9){
             segunIMC="Normal";
             minRecomendado="18.6";
             maxRecomendado="24.9";
         }else if(indice>24.9 && indice<=26.9){
             segunIMC="Sobrepeso I";
             minRecomendado="25";
             maxRecomendado="26.9";
         }else if(indice>26.9 && indice<=29.9){
             segunIMC="Sobrepeso II";
             minRecomendado="27";
             maxRecomendado="29.9";
         }else if(indice>29.9 && indice<=34.9){
             segunIMC="Obesidad I";
             minRecomendado="30";
             maxRecomendado="34.9";
         }else if(indice>34.9 && indice<=39.9){
             segunIMC="Obesidad II";
             minRecomendado="35";
             maxRecomendado="39.9";
         }else if(indice>39.9 && indice<=49.9){
             segunIMC="Mórbida";
             minRecomendado="40";
             maxRecomendado="49.9";
         }else if(indice>=50){
             segunIMC="Extrema";
             minRecomendado="50";
             maxRecomendado="Peligro";
         }
         tvSegunIMC.setText(segunIMC);
         tvMinRecomendado.setText(minRecomendado);
         tvMaxRecomendado.setText(maxRecomendado);


    }

    public void Onclick(View view){

        Intent intent=new Intent(pesoidealcalculado.this, inicio.class);
        startActivity(intent);
    }


}
