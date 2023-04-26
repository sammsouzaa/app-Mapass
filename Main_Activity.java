package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        String estado2 = nomeestado.getEditText().getText().toString();

        String iestado = estado2;

        if(iestado.equals("pr")|| iestado.equals("PR") || iestado.equals("sc") || iestado.equals("SC") || iestado.equals("rs") || iestado.equals("RS")){

            it_telamapas.putExtra("nome", iestado);
            startActivity(it_telamapas);
        }
        else {
            Toast.makeText(this, "Certifique-se que você digitou Corretamente", Toast.LENGTH_SHORT).show();
        }

    }
}
