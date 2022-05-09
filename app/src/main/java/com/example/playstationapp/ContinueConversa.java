package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContinueConversa extends AppCompatActivity {

    private View btn_voltar;
    private View btn_button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_conversa);
        btn_button02 = findViewById(R.id.button2);
        btn_voltar = findViewById(R.id.btn_voltar);


        btn_voltar.setOnClickListener( View ->{
            Intent intent = new Intent(ContinueConversa.this,PrepareJogar .class);
            startActivity(intent);
        });

        btn_button02.setOnClickListener( View ->{
            Intent intent = new Intent(ContinueConversa.this,CompartilhamentoTela.class);
            startActivity(intent);
        } );


    }


}