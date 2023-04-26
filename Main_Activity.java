package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText IDnomeestado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IDnomeestado = findViewById(R.id.IDnomeestado);

    }
    public void telaMapas(View view){

        Intent it_telaMapas = new Intent(this, telamapas.class);

        startActivity(it_telaMapas);

        //setContentView(R.layout.activity_main);
    }
}
