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


public class telamapas extends AppCompatActivity {

    public TextView IDcapital;
    public TextView IDname;

    public TextView IDpopulacao;
    public TextView IDarea;
    public TextView IDidh;
    public TextView IDmunicipios;

    public ImageView IDbandeira;
    public ImageView IDmapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telamapas);

        IDcapital = findViewById(R.id.IDcapital);
        IDpopulacao = findViewById(R.id.IDpopulacao);
        IDarea = findViewById(R.id.IDarea);
        IDidh = findViewById(R.id.IDidh);
        IDmunicipios = findViewById(R.id.IDmunicipios);


        IDbandeira = findViewById(R.id.IDbandeira);
        IDmapa = findViewById(R.id.IDmapa);

        Intent it = getIntent();
        String nome = it.getStringExtra("nomeestado");
        String sigla = it.getStringExtra("siglaestado");

        IDname.setText(nome);

        if (sigla.equals("pr")){
            IDbandeira.setImageResource(R.drawable.pr);
        }
        else if (sigla.equals("sc")){
            IDbandeira.setImageResource(R.drawable.sc);
        }
        else if (sigla.equals("rs")){
            IDbandeira.setImageResource(R.drawable.rs);
        }
    }
    public void telaprincipal(View view){

        Intent it_telaprincipal = new Intent(this, MainActivity.class);
        startActivity(it_telaprincipal);

        //setContentView(R.layout.activity_main);
    }
}
