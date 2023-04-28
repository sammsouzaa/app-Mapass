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

        switch(estado){

            case "ac":

                IDestadinho.setText("Acre");

                IDbandeira.setImageResource(R.drawable.ac);
                IDmapa.setImageResource(R.drawable.mapaac);

                IDcapital.setText("Rio Branco");
                IDpopulacao.setText("790.101");
                IDarea.setText("152.581 km²");
                IDidh.setText("0,751");
                IDmunicipios.setText("22");
                break;

            case "al":

                IDestadinho.setText("Alagoas");

                IDbandeira.setImageResource(R.drawable.al);
                IDmapa.setImageResource(R.drawable.mapaal);

                IDcapital.setText("Maceió");
                IDpopulacao.setText("3,322 milhões");
                IDarea.setText("27.768 km²");
                IDidh.setText("0,687");
                IDmunicipios.setText("102");
                break;

            case "ap":

                IDestadinho.setText("Amapa");

                IDbandeira.setImageResource(R.drawable.ap);
                IDmapa.setImageResource(R.drawable.mapaap);

                IDcapital.setText("Macapá");
                IDpopulacao.setText("774.000");
                IDarea.setText("142.815 km²");
                IDidh.setText("0,780");
                IDmunicipios.setText("16");
                break;

            case "am":

                IDestadinho.setText("Amazônas");

                IDbandeira.setImageResource(R.drawable.am);
                IDmapa.setImageResource(R.drawable.mapaam);

                IDcapital.setText("Manaus");
                IDpopulacao.setText("4,2 milhões");
                IDarea.setText("1.571.000 km²");
                IDidh.setText("0,674");
                IDmunicipios.setText("62");
                break;

            case "ba":

                IDestadinho.setText("Bahia");

                IDbandeira.setImageResource(R.drawable.ba);
                IDmapa.setImageResource(R.drawable.mapaba);

                IDcapital.setText("Salvador");
                IDpopulacao.setText("15,13 milhões");
                IDarea.setText("567.295 km²");
                IDidh.setText("0,742");
                IDmunicipios.setText("417");
                break;

            case "ce":

                IDestadinho.setText("Ceará");

                IDbandeira.setImageResource(R.drawable.ce);
                IDmapa.setImageResource(R.drawable.mapace);

                IDcapital.setText("Fortaleza");
                IDpopulacao.setText("8,936 milhões");
                IDarea.setText("148.886 km²");
                IDidh.setText("0,735");
                IDmunicipios.setText("184");
                break;

            case "df":

                IDestadinho.setText("Distrito Federal");

                IDbandeira.setImageResource(R.drawable.df);
                IDmapa.setImageResource(R.drawable.mapadf);

                IDcapital.setText("Brasília");
                IDpopulacao.setText("2,9 milhões");
                IDarea.setText("5.761.000 km²");
                IDidh.setText("0,824");
                IDmunicipios.setText("0");
                break;

            case "es":

                IDestadinho.setText("Espirito Santo");

                IDbandeira.setImageResource(R.drawable.es);
                IDmapa.setImageResource(R.drawable.mapaes);

                IDcapital.setText("Vitória");
                IDpopulacao.setText("3,885 milhões");
                IDarea.setText("46.095 km²");
                IDidh.setText("0,740");
                IDmunicipios.setText("78");
                break;

            case "go":

                IDestadinho.setText("Goiáis");

                IDbandeira.setImageResource(R.drawable.go);
                IDmapa.setImageResource(R.drawable.mapago);

                IDcapital.setText("Goiânia");
                IDpopulacao.setText("6,523 milhões");
                IDarea.setText("340.086 km²");
                IDidh.setText("0,735");
                IDmunicipios.setText("246");
                break;

            case "ma":

                IDestadinho.setText("Maranhão");

                IDbandeira.setImageResource(R.drawable.ma);
                IDmapa.setImageResource(R.drawable.mapama);

                IDcapital.setText("São Luís");
                IDpopulacao.setText("6,851 milhões");
                IDarea.setText("331.983 km²");
                IDidh.setText("0,612");
                IDmunicipios.setText("217");
                break;

            case "mt":

                IDestadinho.setText("Mato Grosso");

                IDbandeira.setImageResource(R.drawable.mt);
                IDmapa.setImageResource(R.drawable.mapamt);

                IDcapital.setText("Cuiabá");
                IDpopulacao.setText("3,224 milhões");
                IDarea.setText("903.357 km²");
                IDidh.setText("0.773");
                IDmunicipios.setText("141");
                break;

            case "ms":

                IDestadinho.setText("Mato Grosso do Sul");

                IDbandeira.setImageResource(R.drawable.ms);
                IDmapa.setImageResource(R.drawable.mapams);

                IDcapital.setText("Campo Grande");
                IDpopulacao.setText("2,62 milhões");
                IDarea.setText("357.125 km²");
                IDidh.setText("0,729");
                IDmunicipios.setText("79");
                break;

            case "mg":

                IDestadinho.setText("Minas Gerais");

                IDbandeira.setImageResource(R.drawable.mg);
                IDmapa.setImageResource(R.drawable.mapamg);

                IDcapital.setText("Belo Horizonte");
                IDpopulacao.setText("20,87 milhões");
                IDarea.setText("586.528 km²");
                IDidh.setText("0,731");
                IDmunicipios.setText("853");
                break;

            case "pa":

                IDestadinho.setText("Pará");

                IDbandeira.setImageResource(R.drawable.pa);
                IDmapa.setImageResource(R.drawable.mapapa);

                IDcapital.setText("Belém");
                IDpopulacao.setText("8,074 milhõe");
                IDarea.setText("1.248.000 km²");
                IDidh.setText("0,755");
                IDmunicipios.setText("144");
                break;

            case "pb":

                IDestadinho.setText("Paraíba");

                IDbandeira.setImageResource(R.drawable.pb);
                IDmapa.setImageResource(R.drawable.mapapb);

                IDcapital.setText("João Pessoa");
                IDpopulacao.setText("3,944 milhões");
                IDarea.setText("56.585 km²");
                IDidh.setText("0,718");
                IDmunicipios.setText("223");
                break;

            case "pr":

                IDestadinho.setText("paraná");

                IDbandeira.setImageResource(R.drawable.pr);
                IDmapa.setImageResource(R.drawable.mapapr);

                IDcapital.setText("Curitiba");
                IDpopulacao.setText("11,8 Milhões");
                IDarea.setText("199.315 km²");
                IDidh.setText("0,749");
                IDmunicipios.setText("399");
                break;

            case "pe":

                IDestadinho.setText("Pernanbuco");

                IDbandeira.setImageResource(R.drawable.pe);
                IDmapa.setImageResource(R.drawable.mapape);

                IDcapital.setText("Recife");
                IDpopulacao.setText("9,278 milhões");
                IDarea.setText("98.312 km²");
                IDidh.setText("0,673");
                IDmunicipios.setText("185");
                break;

            case "pi":

                IDestadinho.setText("Piauí");

                IDbandeira.setImageResource(R.drawable.pi);
                IDmapa.setImageResource(R.drawable.mapapi);

                IDcapital.setText("Teresina");
                IDpopulacao.setText("3,195 milhões");
                IDarea.setText("251.529 km²");
                IDidh.setText("0,713");
                IDmunicipios.setText("221");
                break;

            case "rj":

                IDestadinho.setText("Rio de Janeiro");

                IDbandeira.setImageResource(R.drawable.rj);
                IDmapa.setImageResource(R.drawable.maparj);

                IDcapital.setText("Rio de Janeiro");
                IDpopulacao.setText("16,46 milhões");
                IDarea.setText("1.200 km²");
                IDidh.setText("0,754");
                IDmunicipios.setText("92");
                break;

            case "rn":

                IDestadinho.setText("Rio Grande do Norte");

                IDbandeira.setImageResource(R.drawable.rn);
                IDmapa.setImageResource(R.drawable.maparn);

                IDcapital.setText("Natal");
                IDpopulacao.setText("3,409 milhões");
                IDarea.setText("52.797 km²");
                IDidh.setText("0,684");
                IDmunicipios.setText("167");
                break;

            case "rs":

                IDestadinho.setText("rio grande do sul");

                IDbandeira.setImageResource(R.drawable.rs);
                IDmapa.setImageResource(R.drawable.mapars);

                IDcapital.setText("Porto Alegre");
                IDpopulacao.setText("11.08 milhões");
                IDarea.setText("281.748 km²");
                IDidh.setText("0,652");
                IDmunicipios.setText("497");
                break;

            case "ro":

                IDestadinho.setText("Rondônia");

                IDbandeira.setImageResource(R.drawable.ro);
                IDmapa.setImageResource(R.drawable.maparo);

                IDcapital.setText("Porto Velho");
                IDpopulacao.setText("1,749 milhão");
                IDarea.setText("237.576 km²");
                IDidh.setText("0,756");
                IDmunicipios.setText("52");
                break;

            case "rr":

                IDestadinho.setText("Roráima");

                IDbandeira.setImageResource(R.drawable.rr);
                IDmapa.setImageResource(R.drawable.maparr);

                IDcapital.setText("Boa Vista");
                IDpopulacao.setText("496.936");
                IDarea.setText("224.301 km²");
                IDidh.setText("0,750");
                IDmunicipios.setText("15");
                break;

            case "sc":

                IDestadinho.setText("santa catarina");

                IDbandeira.setImageResource(R.drawable.sc);
                IDmapa.setImageResource(R.drawable.mapasc);

                IDcapital.setText("Florianópolis");
                IDpopulacao.setText("7,2 milhões");
                IDarea.setText("95.346 km²");
                IDidh.setText("0,840");
                IDmunicipios.setText("295");
                break;

            case "sp":

                IDestadinho.setText("São Paulo");

                IDbandeira.setImageResource(R.drawable.sp);
                IDmapa.setImageResource(R.drawable.mapasp);

                IDcapital.setText("São Paulo");
                IDpopulacao.setText("44,04 milhões");
                IDarea.setText("1.521 km²");
                IDidh.setText("0,783");
                IDmunicipios.setText("645");
                break;

            case "se":

                IDestadinho.setText("Sergipe");

                IDbandeira.setImageResource(R.drawable.se);
                IDmapa.setImageResource(R.drawable.mapase);

                IDcapital.setText("Aracaju");
                IDpopulacao.setText("2,22 milhões");
                IDarea.setText("21.910 km²");
                IDidh.setText("0,665.");
                IDmunicipios.setText("75");
                break;

            case "to":

                IDestadinho.setText("Tocantins");

                IDbandeira.setImageResource(R.drawable.to);
                IDmapa.setImageResource(R.drawable.mapato);

                IDcapital.setText("Palmas");
                IDpopulacao.setText("1,497 milhão");
                IDarea.setText("277.621 km²");
                IDidh.setText("0,756");
                IDmunicipios.setText("139");
                break;
        }

    }
    //   protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_telamapas);
//
//       IDcapital = findViewById(R.id.IDcapital);
//       IDpopulacao = findViewById(R.id.IDpopulacao);
//        IDarea = findViewById(R.id.IDarea);
//        IDidh = findViewById(R.id.IDidh);
//        IDmunicipios = findViewById(R.id.IDmunicipios);
//
//        IDestadinho = findViewById(R.id.IDestadinho);
//
//        IDbandeira = findViewById(R.id.IDbandeira);
//        IDmapa = findViewById(R.id.IDmapa);
//
//        Intent aba = getIntent();
//        String estado = aba.getStringExtra("nome");
//
//
//        if (estado.equals("pr")|| estado.equals("PR")){
//
//            IDestadinho.setText("paraná");
//
//            IDbandeira.setImageResource(R.drawable.pr);
//            IDmapa.setImageResource(R.drawable.mapapr);
//
//            IDcapital.setText("Curitiba");
//            IDpopulacao.setText("11,8 Milhões");
//            IDarea.setText("199.315 km²");
//            IDidh.setText("0,749");
//            IDmunicipios.setText("399");
//        }
    //       else if (estado.equals("sc")|| estado.equals("SC")){
//
//            IDestadinho.setText("santa catarina");
//
//            IDbandeira.setImageResource(R.drawable.sc);
//            IDmapa.setImageResource(R.drawable.mapasc);
//
//            IDcapital.setText("Florianópolis");
//            IDpopulacao.setText("7,2 milhões");
//            IDarea.setText("95.346 km²");
//            IDidh.setText("0,840");
//            IDmunicipios.setText("295");
//        }
//        else if (estado.equals("rs")|| estado.equals("RS")){
//
//            IDestadinho.setText("rio grande do sul");
//
//            IDbandeira.setImageResource(R.drawable.rs);
//            IDmapa.setImageResource(R.drawable.mapars);
//
//            IDcapital.setText("Porto Alegre");
//            IDpopulacao.setText("11.08 milhões");
//            IDarea.setText("281.748 km²");
//            IDidh.setText("0,652");
//            IDmunicipios.setText("497");
//        }
//
//    }
    public void telaprincipal(View view){

        Intent it_telaprincipal = new Intent(this, MainActivity.class);
        startActivity(it_telaprincipal);

        //setContentView(R.layout.activity_main);
    }
}
