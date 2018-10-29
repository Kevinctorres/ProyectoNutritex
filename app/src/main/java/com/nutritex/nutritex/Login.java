package com.nutritex.nutritex;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.nutritex.nutritex_1.R;

public class Login extends AppCompatActivity {

    EditText et1,et2;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1= (EditText) findViewById(R.id.etRegistro);
        et2= (EditText) findViewById(R.id.etContraseña);
    }

    public void login(View view){
        DBHelper admin=new DBHelper(this,"nutritex",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String email=et1.getText().toString();
        String contrasena=et2.getText().toString();
        fila=db.rawQuery("select email,contrasena from usuarios where email='"+email+"' and contrasena='"+contrasena+"'",null);

        if (fila.moveToFirst()){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
            if (email.equals(usua)&&contrasena.equals(pass)){
                startActivity(new Intent(this,inicio.class));
                et1.setText("");
                et2.setText("");
            }
        }
        db.close();
    }
    public void registro(View view){
        startActivity(new Intent(Login.this, Registro.class));
    }
    public void salir(View v){
        finish();
        //System.exit(0);
    }

}
