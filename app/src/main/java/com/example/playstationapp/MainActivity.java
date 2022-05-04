package com.example.playstationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View btnSessao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSessao = findViewById(R.id.btnSessao);

        btnSessao.setOnClickListener(View -> {
            Intent intent = new Intent(MainActivity.this, TelaIDsessao.class);
            startActivity(intent);
        });

}
}