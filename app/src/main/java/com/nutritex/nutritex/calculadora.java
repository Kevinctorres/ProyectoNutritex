package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.nutritex.nutritex_1.R;

public class calculadora extends AppCompatActivity {

    EditText etPeso, etAltura;
    Button  btCalcular;
    TextView tvIMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        etPeso=(EditText) findViewById(R.id.etPeso);
        etAltura=(EditText) findViewById(R.id.etAltura);
        btCalcular=(Button) findViewById(R.id.btCalcular);
        tvIMC=(TextView) findViewById(R.id.tvIMC);
        Spinner spsex= (Spinner) findViewById(R.id.spSex);
        Spinner spComplexion= (Spinner) findViewById(R.id.spCompl);

        String[] sexo = new String[] {"Hombre", "Mujer"};
        String[] complexion = new String[] {"Pequeña", "Mediana","Grande"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sexo);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, complexion);
        spsex.setAdapter(adapter);
        spComplexion.setAdapter(adapter2);

    }
    public void calculadoraIMc(View view){
        Intent intent= new Intent(calculadora.this, pesoidealcalculado.class);
        double peso, altura, IMC;
        peso=Double.parseDouble(etPeso.getText().toString());
        altura=Double.parseDouble(etAltura.getText().toString());
        IMC=peso/Math.pow(altura,2);
        String imc2 = String.valueOf(IMC);
        intent.putExtra("imc",imc2); //obtener el resultado
        startActivity(intent);
    }
    public void volver(View view){
        startActivity(new Intent(this,inicio.class));

    }


}
