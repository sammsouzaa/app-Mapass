package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class telamapas extends AppCompatActivity {

    public TextView IDcapital;
    public TextView IDestadinho;
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

        IDestadinho = findViewById(R.id.IDestadinho);

        IDbandeira = findViewById(R.id.IDbandeira);
        IDmapa = findViewById(R.id.IDmapa);

        Intent aba = getIntent();
        String estado = aba.getStringExtra("nome");


        if (estado.equals("pr")|| estado.equals("PR")){

            IDestadinho.setText("paraná");

            IDbandeira.setImageResource(R.drawable.pr);
            IDmapa.setImageResource(R.drawable.mapapr);

            IDcapital.setText("Curitiba");
            IDpopulacao.setText("11,8 Milhões");
            IDarea.setText("199.315 km²");
            IDidh.setText("0,749");
            IDmunicipios.setText("399");
        }
        else if (estado.equals("sc")|| estado.equals("SC")){

            IDestadinho.setText("santa catarina");

            IDbandeira.setImageResource(R.drawable.sc);
            IDmapa.setImageResource(R.drawable.mapasc);

            IDcapital.setText("Florianópolis");
            IDpopulacao.setText("7,2 milhões");
            IDarea.setText("95.346 km²");
            IDidh.setText("0,840");
            IDmunicipios.setText("295");
        }
        else if (estado.equals("rs")|| estado.equals("RS")){

            IDestadinho.setText("rio grande do sul");

            IDbandeira.setImageResource(R.drawable.rs);
            IDmapa.setImageResource(R.drawable.mapars);

            IDcapital.setText("Porto Alegre");
            IDpopulacao.setText("11.08 milhões");
            IDarea.setText("281.748 km²");
            IDidh.setText("0,652");
            IDmunicipios.setText("497");
        }

    }
    public void telaprincipal(View view){

        Intent it_telaprincipal = new Intent(this, MainActivity.class);
        startActivity(it_telaprincipal);

        //setContentView(R.layout.activity_main);
    }
}
