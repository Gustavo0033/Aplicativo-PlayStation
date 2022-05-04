package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaIDsessao extends AppCompatActivity {

    private View btn_seguinte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_idsessao);

        btn_seguinte = findViewById(R.id.btn_seguinte);

        btn_seguinte.setOnClickListener(View -> {
            Intent intent = new Intent(TelaIDsessao.this, PrepareJogar.class);
            startActivity(intent);
    });
}
}
