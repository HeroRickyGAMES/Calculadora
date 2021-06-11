package com.hrgandroidstudio.caulculadora;
//Porgramado por HeroRicky_Games.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class somaActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
        numero1 = findViewById(R.id.editNumero1Soma);
        numero2 = findViewById(R.id.editNumero2Soma);
        Resultado = findViewById(R.id.textResult);
    }
    public void Soma(View v){
    int nsoma1 = Integer.valueOf(numero1.getText().toString());
    int nsoma2 = Integer.valueOf(numero2.getText().toString());

    Resultado.setText(String.valueOf(nsoma1 + nsoma2));


    }


}