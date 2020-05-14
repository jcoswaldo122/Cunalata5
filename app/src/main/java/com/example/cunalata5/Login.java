package com.example.cunalata5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usuario, password;
    TextView mensaje;
    Button ingresar;
    String usuari1= "Oswaldo-estudiante";
    String password1= "est.uisrael.2019";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.etUserName);
        password = findViewById(R.id.etPassword);
        mensaje = findViewById(R.id.tvMensaje);
    }
    public void Ingresar (View i){
        String usu = usuario.getText().toString();
        String pass = password.getText().toString();
        if (usu.equals(usuari1)&&pass.equals(password1)){
             Intent intentEnvio= new Intent(Login.this, MainActivity.class);
            intentEnvio.putExtra("datoEnviado", usuario.getText().toString());
            startActivity(intentEnvio);
            Toast.makeText(getApplicationContext(), "Bienbenido Uisrael", Toast.LENGTH_LONG).show();

        }else {
            mensaje.setText("Usuario o Contrasña Incorrcta");
        }

    }
}
