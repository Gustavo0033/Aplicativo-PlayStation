package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CompartilhamentoTela extends AppCompatActivity {

    private View btn_voltarConversa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartilhamento_tela);

        btn_voltarConversa = findViewById(R.id.btn_voltarConversa);

        btn_voltarConversa.setOnClickListener( View ->{
            Intent intent = new Intent(CompartilhamentoTela.this,ContinueConversa.class);
            startActivity(intent);
        });


    }
}