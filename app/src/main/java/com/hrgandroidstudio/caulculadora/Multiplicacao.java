package com.hrgandroidstudio.caulculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacao extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView Resultadomult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);
        numero1 = findViewById(R.id.Primeiromult);
        numero2 = findViewById(R.id.SegundoMult);
        Resultadomult = findViewById(R.id.ResultMult);
    }
    public void Mult(View v){
        int num1 = Integer.valueOf(numero1.getText().toString());
        int num2 = Integer.valueOf(numero2.getText().toString());

        Resultadomult.setText(String.valueOf(num1 * num2));
    }
}