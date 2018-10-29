 package com.nutritex.nutritex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nutritex.nutritex_1.R;

public class plan_alimenticio extends AppCompatActivity {

    TextView tvDesayuno1,tvDesayuno2,tvDesayuno3,tvDesayuno4,tvDesayuno5,tvDesayuno6;
    TextView tvMediaMañana1,tvMediaMañana2,tvMediaMañana3;
    TextView tvAlmuerzo1,tvAlmuerzo2,tvAlmuerzo3,tvAlmuerzo4,tvAlmuerzo5,tvAlmuerzo6,tvAlmuerzo7;
    TextView tvMediaTarde1,tvMediaTarde2;
    TextView tvCena1,tvCena2,tvCena3,tvCena4,tvCena5,tvCena6,tvCena7,tvCena8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_alimenticio);
        //////////////////////////////////////////////////
        tvDesayuno1=(TextView)findViewById(R.id.txDesayuno);
        tvDesayuno2=(TextView)findViewById(R.id.txDesayuno2);
        tvDesayuno3=(TextView)findViewById(R.id.txDesayuno3);
        tvDesayuno4=(TextView)findViewById(R.id.txDesayuno4);
        tvDesayuno5=(TextView)findViewById(R.id.txDesayuno5);
        tvDesayuno6=(TextView)findViewById(R.id.txDesayuno6);
        ////////////////////////////////////////////////////
        tvMediaMañana1=(TextView)findViewById(R.id.txMediaMañana);
        tvMediaMañana2=(TextView)findViewById(R.id.txMediaMañana2);
        tvMediaMañana3=(TextView)findViewById(R.id.txMediaMañana3);
        ////////////////////////////////////////////////////////
        tvAlmuerzo1=(TextView)findViewById(R.id.txAlmuerzo);
        tvAlmuerzo2=(TextView)findViewById(R.id.txAlmuerzo2);
        tvAlmuerzo3=(TextView)findViewById(R.id.txAlmuerzo3);
        tvAlmuerzo4=(TextView)findViewById(R.id.txAlmuerzo4);
        tvAlmuerzo5=(TextView)findViewById(R.id.txAlmuerzo5);
        tvAlmuerzo6=(TextView)findViewById(R.id.txAlmuerzo6);
        tvAlmuerzo7=(TextView)findViewById(R.id.txAlmuerzo7);
        ///////////////////////////////////////////////////////
        tvMediaTarde1=(TextView)findViewById(R.id.txMediaTarde);
        tvMediaTarde2=(TextView)findViewById(R.id.txMediaTarde2);
        //////////////////////////////////////////////////////////
        tvCena1=(TextView)findViewById(R.id.txCena);
        tvCena2=(TextView)findViewById(R.id.txCena2);
        tvCena3=(TextView)findViewById(R.id.txCena3);
        tvCena4=(TextView)findViewById(R.id.txCena4);
        tvCena5=(TextView)findViewById(R.id.txCena5);
        tvCena6=(TextView)findViewById(R.id.txCena6);
        tvCena7=(TextView)findViewById(R.id.txCena7);
        tvCena8=(TextView)findViewById(R.id.txCena8);



        Bundle bundle=getIntent().getExtras();
        String desayuno=bundle.getString("desayuno").toString();
        String desayuno2=bundle.getString("desayuno2").toString();
        String desayuno3=bundle.getString("desayuno3").toString();
        String desayuno4=bundle.getString("desayuno4").toString();
        String desayuno5=bundle.getString("desayuno5").toString();
        String desayuno6=bundle.getString("desayuno6").toString();
        //////////////////////////////////////////////////////////////
        String mediaMañana=bundle.getString("mediaMañana").toString();
        String mediaMañana2=bundle.getString("mediaMañana2").toString();
        String mediaMañana3=bundle.getString("mediaMañana3").toString();
        ////////////////////////////////////////////////////////////////////
        String almuerzo=bundle.getString("almuerzo").toString();
        String almuerzo2=bundle.getString("almuerzo2").toString();
        String almuerzo3=bundle.getString("almuerzo3").toString();
        String almuerzo4=bundle.getString("almuerzo4").toString();
        String almuerzo5=bundle.getString("almuerzo5").toString();
        String almuerzo6=bundle.getString("almuerzo6").toString();
        String almuerzo7=bundle.getString("almuerzo7").toString();
        /////////////////////////////////////////////////////////////////////
        String mediaTarde=bundle.getString("mediaTarde").toString();
        String mediaTarde2=bundle.getString("mediaTarde2").toString();
        /////////////////////////////////////////////////////////////////////
        String cena=bundle.getString("cena").toString();
        String cena2=bundle.getString("cena2").toString();
        String cena3=bundle.getString("cena3").toString();
        String cena4=bundle.getString("cena4").toString();
        String cena5=bundle.getString("cena5").toString();
        String cena6=bundle.getString("cena6").toString();
        String cena7=bundle.getString("cena7").toString();
        String cena8=bundle.getString("cena8").toString();

        tvDesayuno1.setText(desayuno);
        tvDesayuno2.setText(desayuno2);
        tvDesayuno3.setText(desayuno3);
        tvDesayuno4.setText(desayuno4);
        tvDesayuno5.setText(desayuno5);
        tvDesayuno6.setText(desayuno6);
        //////////////////////////////
        tvMediaMañana1.setText(mediaMañana);
        tvMediaMañana2.setText(mediaMañana2);
        tvMediaMañana3.setText(mediaMañana3);
        /////////////////////////////////////
        tvAlmuerzo1.setText(almuerzo);
        tvAlmuerzo2.setText(almuerzo2);
        tvAlmuerzo3.setText(almuerzo3);
        tvAlmuerzo4.setText(almuerzo4);
        tvAlmuerzo5.setText(almuerzo5);
        tvAlmuerzo6.setText(almuerzo6);
        tvAlmuerzo7.setText(almuerzo7);
        ///////////////////////////////////////
        tvMediaTarde1.setText(mediaTarde);
        tvMediaTarde2.setText(mediaTarde2);
        //////////////////////////////////////
        tvCena1.setText(cena);
        tvCena2.setText(cena2);
        tvCena3.setText(cena3);
        tvCena4.setText(cena4);
        tvCena5.setText(cena5);
        tvCena6.setText(cena6);
        tvCena7.setText(cena7);
        tvCena8.setText(cena8);
    }
}
