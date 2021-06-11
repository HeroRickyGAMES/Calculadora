package com.hrgandroidstudio.caulculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Divisao extends AppCompatActivity {

    EditText primeironumero;
    EditText segundonumero;
    TextView resultadodiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao);

        primeironumero = findViewById(R.id.primeironumerodiv);
        segundonumero = findViewById(R.id.segundonumerodiv);
        resultadodiv = findViewById(R.id.Resultadodiv);
    }
    public void divisão(View v){
        int ndiv1 = Integer.valueOf(primeironumero.getText().toString());
        int ndiv2 = Integer.valueOf(segundonumero.getText().toString());

        resultadodiv.setText(String.valueOf(ndiv1 / ndiv2));
    }
}