package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view){
        String usuario = ((EditText)findViewById(R.id.etRegistro)).getText().toString();
        String password = ((EditText)findViewById(R.id.etContraseña)).getText().toString();
        if (usuario.equals("eider")&& password.equals("kevin")){
            Intent intent=new Intent(Login.this, inicio.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
        }

    }
    public void registro(View view){
        startActivity(new Intent(Login.this, Registro.class));
    }

}
