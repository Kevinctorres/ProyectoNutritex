package com.nutritex.nutritex;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.nutritex.nutritex_1.R;

public class Registro extends AppCompatActivity {

      EditText et2,et3,et4;
      private Cursor fila;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        et2= (EditText) findViewById(R.id.etUsuario);
        et3= (EditText) findViewById(R.id.etPassword);
        et4= (EditText) findViewById(R.id.etNombre);

    }
    public void registrar(View view){

        DBHelper admin=new DBHelper(this,"nutritex",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String email=et2.getText().toString();
        String contrasena=et3.getText().toString();
        String nombre=et4.getText().toString();

        ContentValues values=new ContentValues();
        values.put("email",email);
        values.put("contrasena",contrasena);
        values.put("nombre",nombre);

        db.insert("usuarios",null,values);


        startActivity(new Intent(this,Login.class));

        //fila=db.rawQuery("select * from usuarios where email='"+email+"' and contrasena='"+contrasena+"'",null);

       // Toast.makeText(this, fila.getString(0), Toast.LENGTH_SHORT).show();
        db.close();
    }

    public void volver(View view){
        startActivity(new Intent(this,Login.class));

    }



}
