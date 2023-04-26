package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public TextInputLayout nomeestado;

    //@SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeestado = findViewById(R.id.IDestado);

    }
    public boolean validatenome(){

        String estado = nomeestado.getEditText().getText().toString().trim();

        if (estado.isEmpty()){
            nomeestado.setError("Field can't be empty!!");
            return false;
        }else{
            nomeestado.setError(null);
            nomeestado.setErrorEnabled(false);
            return true;
        }

    }
    public void telamapas(View view){

        if (!validatenome()) {
            return;
        }

        Intent it_telamapas = new Intent(this, telamapas.class);

        if (nomeestado.equals("pr")|| nomeestado.equals("PR")){

            it_telamapas.putExtra("nomeestado", "parana");
            it_telamapas.putExtra("siglaestado", "pr");
        }

        else if (nomeestado.equals("sc")|| nomeestado.equals("SC")){

            it_telamapas.putExtra("nomeestado", "santa catarina");
            it_telamapas.putExtra("siglaestado", "sc");
        }

        else if (nomeestado.equals("rs")|| nomeestado.equals("RS")){

            it_telamapas.putExtra("nomeestado", "rio grande do sul");
            it_telamapas.putExtra("siglaestado", "rs");
        }

        startActivity(it_telamapas);

    }
}
