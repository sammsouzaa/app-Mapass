package com.example.novo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void telaMapas(View view){

        Intent it_telaMapas = new Intent(this, telaMapas.class);
        startActivity(it_telaMapas);

        //setContentView(R.layout.activity_main);
    }
}
