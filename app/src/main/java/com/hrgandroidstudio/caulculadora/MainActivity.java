package com.hrgandroidstudio.caulculadora;
//Porgramado por HeroRicky_Games.
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SomaActivity(View v) {
        Intent intent = new Intent(this, somaActivity.class);
        startActivity(intent);
    }

    public void SubtraçãoActivity(View v) {
        Intent intent = new Intent(this, Subtracao.class);
        startActivity(intent);
    }

    public void Divisao(View v){
        Intent intent = new Intent(this, Divisao.class);
        startActivity(intent);
    }
    public void Multipliação(View v){
        Intent intent = new Intent( this, Multiplicacao.class);
        startActivity(intent);
    }
    public void Porcent (View v){
        Intent intent = new Intent (this, Porcentagem.class);
        startActivity(intent);
    }
    public void alerta(View view){
        Snackbar.make(view, "Foi adicionado uma nova função no aplicativo!", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }

}

