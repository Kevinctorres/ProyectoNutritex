package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.nutritex.nutritex_1.R;

public class pesoidealcalculado extends AppCompatActivity {

    TextView tvIMC, tvSegunIMC, tvMinRecomendado,tvMaxRecomendado;
    String segunIMC, minRecomendado, maxRecomendado;


    String desayuno,desayuno2,desayuno3,desayuno4,desayuno5,desayuno6;
    String mediaMañana,mediaMañana2,mediaMañana3;
    String almuerzo,almuerzo2,almuerzo3,almuerzo4,almuerzo5,almuerzo6,almuerzo7;
    String mediaTarde,mediaTarde2;
    String cena,cena2,cena3,cena4,cena5,cena6,cena7,cena8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesoidealcalculado);

        tvIMC=(TextView)findViewById(R.id.tvIMC);
        tvSegunIMC=(TextView)findViewById(R.id.tvSegunIMC);
        tvMinRecomendado=(TextView)findViewById(R.id.tvMinRecomendado);
        tvMaxRecomendado=(TextView)findViewById(R.id.tvMaxRecomendado);
        ///////////////////////////////////////////////////////////////

        Bundle bundle=getIntent().getExtras();
        String imc=bundle.getString("imc").toString();
        tvIMC.setText(imc);
        double indice = Double.parseDouble(imc);

         if(indice<=18.5){
             segunIMC="Bajo";
             minRecomendado="18.5";
             maxRecomendado="18.5";
             desayuno="Huevo";
             desayuno2="Pan";
             desayuno3="Queso";
             desayuno4="Banano";
             desayuno5="Cafe";
             desayuno6="";
             //////////////////
             mediaMañana="  ";
             mediaMañana2="Manzana";
             mediaMañana3="Mani";
             ////////////////////
             almuerzo="Pollo";
             almuerzo2="Arroz";
             almuerzo3="Pasta";
             almuerzo4="Papa";
             almuerzo5="Carne";
             almuerzo6="Legumbres";
             almuerzo7="Verduras";
             /////////////////////
             mediaTarde="Frutas";
             mediaTarde2="";
             ///////////////////////
             cena="Calentado";
             cena2="Pan";
             cena3="Huevo";
             cena4="Pechuga";
             cena5="Carne";
             cena6="Arroz";
             cena7="Pasta";
             cena8="Verduras";
         } else if(indice>18.5 && indice<=24.9){
             segunIMC="Normal";
             minRecomendado="18.6";
             maxRecomendado="24.9";
             desayuno="Huevo";
             desayuno2="Pan";
             desayuno3="Queso";
             desayuno4="Manzana";
             desayuno5="Papaya";
             desayuno6="Cafe";
             //////////////////
             mediaMañana="Banano";
             mediaMañana2="Manzana";
             mediaMañana3="";
             ////////////////////
             almuerzo="Pollo";
             almuerzo2="Arroz";
             almuerzo3="Pasta";
             almuerzo4="Carne";
             almuerzo5="Legumbres";
             almuerzo6="Verduras";
             almuerzo7="Platano";
             /////////////////////
             mediaTarde="Frutas";
             mediaTarde2="";
             ///////////////////////
             cena="Galletas";
             cena2="Huevo";
             cena3="Verduras";
             cena4="Arepa";
             cena5="Queso";
             cena6="Jugos naturales";
             cena7="";
             cena8="";
         }else if(indice>24.9 && indice<=26.9){
             segunIMC="Sobrepeso I";
             minRecomendado="25";
             maxRecomendado="26.9";
             desayuno="Huevo";
             desayuno2="Galleta";
             desayuno3="Cafe";
             desayuno4="Agua";
             desayuno5="Tostado";
             desayuno6="Banano";
             //////////////////
             mediaMañana="Manzana verde";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Pollo";
             almuerzo2="Arroz";
             almuerzo3="Pasta";
             almuerzo4="Carne";
             almuerzo5="Legumbres";
             almuerzo6="Verduras";
             almuerzo7="";
             /////////////////////
             mediaTarde="Frutas";
             mediaTarde2="Agua";
             ///////////////////////
             cena="Huevo";
             cena2="Verduras";
             cena3="Tostado";
             cena4="Cafe";
             cena5="Galletas";
             cena6="Fruta";
             cena7="";
             cena8="";
         }else if(indice>26.9 && indice<=29.9){
             segunIMC="Sobrepeso II";
             minRecomendado="27";
             maxRecomendado="29.9";
             desayuno="Huevo";
             desayuno2="Galleta";
             desayuno3="Cafe";
             desayuno4="Agua";
             desayuno5="Tostado";
             desayuno6="Banano";
             //////////////////
             mediaMañana="Batido verde";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Pollo";
             almuerzo2="Arroz";
             almuerzo3="Pasta";
             almuerzo4="Carne";
             almuerzo5="Legumbres";
             almuerzo6="Verduras";
             almuerzo7="Pescado";
             /////////////////////
             mediaTarde="Frutas";
             mediaTarde2="Agua";
             ///////////////////////
             cena="Huevo";
             cena2="Verduras";
             cena3="Tostado";
             cena4="Cafe";
             cena5="Galletas";
             cena6="Fruta";
             cena7="";
             cena8="";
         }else if(indice>29.9 && indice<=34.9){
             segunIMC="Obesidad I";
             minRecomendado="30";
             maxRecomendado="34.9";
             desayuno="Huevo";
             desayuno2="Jugo de frutas";
             desayuno3="Tostado";
             desayuno4="Cafe";
             desayuno5="Galleta";
             desayuno6="Cereal";
             //////////////////
             mediaMañana="Batido verde";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Arroz";
             almuerzo2="Legumbres";
             almuerzo3="Verduras";
             almuerzo4="Pescado";
             almuerzo5="Ensaladas (verdura)";
             almuerzo6="";
             almuerzo7="";
             /////////////////////
             mediaTarde="Agua";
             mediaTarde2="";
             ///////////////////////
             cena="Tostado";
             cena2="Fruta";
             cena3="Verduras";
             cena4="";
             cena5="";
             cena6="";
             cena7="";
             cena8="";
         }else if(indice>34.9 && indice<=39.9){
             segunIMC="Obesidad II";
             minRecomendado="35";
             maxRecomendado="39.9";
             desayuno="Huevo";
             desayuno2="Jugo de frutas";
             desayuno3="Tostado";
             desayuno4="Cafe";
             desayuno5="Galleta";
             desayuno6="Cereal";
             //////////////////
             mediaMañana="Batido verde";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Arroz";
             almuerzo2="Legumbres";
             almuerzo3="Verduras";
             almuerzo4="Pescado";
             almuerzo5="Ensaladas (verdura)";
             almuerzo6="";
             almuerzo7="";
             /////////////////////
             mediaTarde="Agua";
             mediaTarde2="";
             ///////////////////////
             cena="Tostado";
             cena2="Fruta";
             cena3="Verduras";
             cena4="";
             cena5="";
             cena6="";
             cena7="";
             cena8="";
         }else if(indice>39.9 && indice<=49.9){
             segunIMC="Mórbida";
             minRecomendado="40";
             maxRecomendado="49.9";
             desayuno="Fruta";
             desayuno2="Huevo";
             desayuno3="Verduras";
             desayuno4="";
             desayuno5="";
             desayuno6="";
             //////////////////
             mediaMañana="Agua natural";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Pescado";
             almuerzo2="Verduras";
             almuerzo3="Arroz";
             almuerzo4="";
             almuerzo5="";
             almuerzo6="";
             almuerzo7="";
             /////////////////////
             mediaTarde="Agua";
             mediaTarde2="";
             ///////////////////////
             cena="Tostado";
             cena2="Verduras";
             cena3="Fruta";
             cena4="";
             cena5="";
             cena6="";
             cena7="";
             cena8="";
         }else if(indice>=50){
             segunIMC="Extrema";
             minRecomendado="50";
             maxRecomendado="Peligro";
             desayuno="Fruta";
             desayuno2="Huevo";
             desayuno3="Verduras";
             desayuno4="";
             desayuno5="";
             desayuno6="";
             //////////////////
             mediaMañana="Agua natural";
             mediaMañana2="";
             mediaMañana3="";
             ////////////////////
             almuerzo="Pescado";
             almuerzo2="Verduras";
             almuerzo3="Arroz";
             almuerzo4="";
             almuerzo5="";
             almuerzo6="";
             almuerzo7="";
             /////////////////////
             mediaTarde="Agua";
             mediaTarde2="";
             ///////////////////////
             cena="Tostado";
             cena2="Verduras";
             cena3="Frutas";
             cena4="";
             cena5="";
             cena6="";
             cena7="";
             cena8="";
         }
         tvSegunIMC.setText(segunIMC);
         tvMinRecomendado.setText(minRecomendado);
         tvMaxRecomendado.setText(maxRecomendado);
         ////////////////////////////////////////


    }


    public void volver(View view){
        startActivity(new Intent(this,inicio.class));

    }
    public void planEjercicio(View view){
        //startActivity(new Intent(this,plan_alimenticio.class));
    }
    public void planAlimenticio(View view){
        Intent intent= new Intent(pesoidealcalculado.this, plan_alimenticio.class);
        intent.putExtra("desayuno",desayuno);
        intent.putExtra("desayuno2",desayuno2);
        intent.putExtra("desayuno3",desayuno3);
        intent.putExtra("desayuno4",desayuno4);
        intent.putExtra("desayuno5",desayuno5);
        intent.putExtra("desayuno6",desayuno6);
        ////////////////////////////////////////////
        intent.putExtra("mediaMañana",mediaMañana);
        intent.putExtra("mediaMañana2",mediaMañana2);
        intent.putExtra("mediaMañana3",mediaMañana3);
        ////////////////////////////////////////////////////
        intent.putExtra("almuerzo",almuerzo);
        intent.putExtra("almuerzo2",almuerzo2);
        intent.putExtra("almuerzo3",almuerzo3);
        intent.putExtra("almuerzo4",almuerzo4);
        intent.putExtra("almuerzo5",almuerzo5);
        intent.putExtra("almuerzo6",almuerzo6);
        intent.putExtra("almuerzo7",almuerzo7);
        /////////////////////////////////////////////
        intent.putExtra("mediaTarde",mediaTarde);
        intent.putExtra("mediaTarde2",mediaTarde2);
        //////////////////////////////////////////////////
        intent.putExtra("cena",cena);
        intent.putExtra("cena2",cena2);
        intent.putExtra("cena3",cena3);
        intent.putExtra("cena4",cena4);
        intent.putExtra("cena5",cena5);
        intent.putExtra("cena6",cena6);
        intent.putExtra("cena7",cena7);
        intent.putExtra("cena8",cena8);
        startActivity(intent);
    }


}
