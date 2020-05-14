package com.example.cunalata5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class Resultados extends AppCompatActivity {

    TextView tvPregunta1, tvPregunta2, tvPregunta3, tvPregunta4, tvPregunta5;
    Bundle rbSi1, rbNo1,rbSi2, rbNo2,rbSi3, rbNo3, cb1, cb2, cb3,cb4, cb5, cb6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        tvPregunta1 = findViewById(R.id.tvRespuesta1);
        tvPregunta2 = findViewById(R.id.tvRespuesta2);
        tvPregunta3 = findViewById(R.id.tvRespuesta3);
        tvPregunta4 = findViewById(R.id.tvRespuesta4);
        tvPregunta5 = findViewById(R.id.tvRespuesta5);

        rbSi1 = getIntent().getExtras();
        String recibir1 = rbSi1.getString("datoEnviado1");
        tvPregunta1.setText(recibir1);
        rbNo1 = getIntent().getExtras();
        String recibir2= rbNo1.getString("datoEnviado1");
        tvPregunta1.setText(recibir2);

        rbSi2 = getIntent().getExtras();
        String recibir3 = rbSi2.getString("datoEnviado2");
        tvPregunta2.setText(recibir3);
        rbNo2 = getIntent().getExtras();
        String recibir4= rbNo2.getString("datoEnviado2");
        tvPregunta2.setText(recibir4);

        cb1 = getIntent().getExtras();
        String recibir5 = cb1.getString("datoEnviado3");
        tvPregunta3.setText(recibir5);
        cb2 = getIntent().getExtras();
        String recibir6= cb2.getString("datoEnviado3");
        tvPregunta3.setText(recibir6);
        cb3 = getIntent().getExtras();
        String recibir7= cb3.getString("datoEnviado3");
        tvPregunta3.setText(recibir7);

        cb4 = getIntent().getExtras();
        String recibir8 = cb4.getString("datoEnviado4");
        tvPregunta4.setText(recibir8);
        cb5 = getIntent().getExtras();
        String recibir9= cb5.getString("datoEnviado4");
        tvPregunta4.setText(recibir9);
        cb6 = getIntent().getExtras();
        String recibir10= cb6.getString("datoEnviado4");
        tvPregunta4.setText(recibir10);


        rbSi3 = getIntent().getExtras();
        String recibir11 = rbSi3.getString("datoEnviado5");
        tvPregunta5.setText(recibir11);
        rbNo3 = getIntent().getExtras();
        String recibir12= rbNo3.getString("datoEnviado5");
        tvPregunta5.setText(recibir12);

    }
}
