package com.example.novo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaMapas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mapas);
    }
    public void telaprincipal(View view){

        Intent it_telaprincipal = new Intent(this, MainActivity.class);
        startActivity(it_telaprincipal);

        //setContentView(R.layout.activity_main);
    }
}
