package com.hrgandroidstudio.caulculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Subtracao extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtracao);
        numero1 = findViewById(R.id.editnumero1);
        numero2 = findViewById(R.id.editnumero2);
        resultado = findViewById(R.id.textresultadong);
    }
    public void Subtração(View v){
        int nsub1 = Integer.valueOf(numero1.getText().toString());
        int nsub2 = Integer.valueOf(numero2.getText().toString());

        resultado.setText(String.valueOf(nsub1 - nsub2));
    }
}


