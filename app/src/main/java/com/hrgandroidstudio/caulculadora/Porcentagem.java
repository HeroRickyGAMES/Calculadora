package com.hrgandroidstudio.caulculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Porcentagem extends AppCompatActivity {

    EditText PrimeiroNumero, Segundonumero;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcentagem);

        PrimeiroNumero = findViewById(R.id.PrimeiroNumeroporcent);
        Resultado = findViewById(R.id.TextResultadoPorcent);
        Segundonumero = findViewById(R.id.Secporc);
    }
    public void porcentagem(View v){
        int num1 = Integer.valueOf(PrimeiroNumero.getText().toString());
        int num2 = Integer.valueOf(Segundonumero.getText().toString());

        Resultado.setText(String.valueOf(num1 % num2));
    }

}