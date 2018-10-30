package com.nutritex.nutritex;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.nutritex.nutritex_1.R;

import com.nutritex.nutritex.ENTITIES.DBHelper;

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
        if (et1.getText().toString().trim().equalsIgnoreCase(""))
            et1.setError("Ingrese un email valido");
            //Toast.makeText(getApplicationContext(), "Campos obligatorios email", Toast.LENGTH_SHORT).show();
        if (et2.getText().toString().trim().equalsIgnoreCase(""))
            et2.setError("Ingrese una contraseña correcta");
            //Toast.makeText(getApplicationContext(), "Campos obligatorios contraseña", Toast.LENGTH_SHORT).show();
        if (fila.moveToFirst()){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
            if (email.equals(usua)&&contrasena.equals(pass)){
                Toast toast1 = Toast.makeText(getApplicationContext(), "Inicio de sesion", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER, 0, 0);
                toast1.show();
                startActivity(new Intent(this,inicio.class));
                et1.setText("");
                et2.setText("");
            }
            else {
                Toast.makeText(getApplicationContext(), "Email o contraseña invalidos", Toast.LENGTH_SHORT).show();
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
