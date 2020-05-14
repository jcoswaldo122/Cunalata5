package com.example.cunalata5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbSi1, rbSi2, rbSi3, rbNo1, rbNo2, rbNo3;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    Button enviar;
    TextView tvDato;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDato = findViewById(R.id.tvDato);
        rbNo1 = findViewById(R.id.rbNo1);
        rbNo2 = findViewById(R.id.rbNo2);
        rbNo3 = findViewById(R.id.rbNo3);
        rbSi1 = findViewById(R.id.rbSi1);
        rbSi2 = findViewById(R.id.rbSi2);
        rbSi3 = findViewById(R.id.rbSi3);
        cb1 = findViewById(R.id.cbFrecuente);
        cb2 = findViewById(R.id.cbPocoFrecuente);
        cb3 = findViewById(R.id.cbNunca);
        cb4 = findViewById(R.id.cbOcho);
        cb5 = findViewById(R.id.cbMasOcho);
        cb6 = findViewById(R.id.cbMenosOcho);

        dato = getIntent().getExtras();
        String recibir = dato.getString("datoEnviado");
        tvDato.setText(recibir);
    }

    public void Enviar(View en) {
        if (rbSi1.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado1", rbSi1.getText().toString());
            startActivity(intentEnvio1);

        } else if (rbNo1.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado1", rbNo1.getText().toString());
            startActivity(intentEnvio1);


        }

        ///////////////////////////
        if (rbSi2.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado2", rbSi2.getText().toString());
            startActivity(intentEnvio1);
        } else if (rbNo2.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado2", rbNo2.getText().toString());
            startActivity(intentEnvio1);
        }
        //////////////////////////////

        if (cb1.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado3", cb1.getText().toString());
            startActivity(intentEnvio1);
        } else if (cb2.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado3", cb2.getText().toString());
            startActivity(intentEnvio1);
        }else if (cb3.isChecked()==true){
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado3", cb3.getText().toString());
            startActivity(intentEnvio1);
        }
        if (cb4.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado4", cb4.getText().toString());
            startActivity(intentEnvio1);
        } else if (cb5.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado4", cb5.getText().toString());
            startActivity(intentEnvio1);
        }else if (cb6.isChecked()==true){
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado4", cb6.getText().toString());
            startActivity(intentEnvio1);
        }

        if (rbSi3.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado5", rbSi3.getText().toString());
            startActivity(intentEnvio1);
        } else if (rbNo3.isChecked() == true) {
            Intent intentEnvio1 = new Intent(MainActivity.this, Resultados.class);
            intentEnvio1.putExtra("datoEnviado5", rbNo3.getText().toString());
            startActivity(intentEnvio1);
        }
    }
}