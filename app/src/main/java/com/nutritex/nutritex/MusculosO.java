package com.nutritex.nutritex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nutritex.nutritex_1.R;
import com.nutritex.nutritex.ejercicioObesidad1y2.*;


public class MusculosO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculos_o);
    }

    public void Musculos_AbdomenO(View view){

        Intent intent=new Intent(MusculosO.this, AbdomenO.class);
        startActivity(intent);
    }

    public void Musculos_CardioO(View view){

        Intent intent=new Intent(MusculosO.this, CardioO.class);
        startActivity(intent);
    }

    public void Musculos_Cardio2O(View view){

        Intent intent=new Intent(MusculosO.this, Cardio2O.class);
        startActivity(intent);
    }
}
