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
	iestado = iestado.toLowerCase();

        if(iestado.equals("ac")|| iestado.equals("al")|| iestado.equals("ap") || iestado.equals("am") || iestado.equals("ba") || iestado.equals("ce")
	|| iestado.equals("df") || iestado.equals("es") || iestado.equals("go") || iestado.equals("ma") || iestado.equals("mt") || iestado.equals("ms")
	|| iestado.equals("mg") || iestado.equals("pa") || iestado.equals("pb") || iestado.equals("pr") || iestado.equals("pe") || iestado.equals("pi")
	|| iestado.equals("rj") || iestado.equals("rn") || iestado.equals("rs") || iestado.equals("ro") || iestado.equals("rr") || iestado.equals("sc")
	|| iestado.equals("sp") || iestado.equals("se") || iestado.equals("to")){

            it_telamapas.putExtra("nome", iestado);
            startActivity(it_telamapas);
        }
        else {
            Toast.makeText(this, "Certifique-se que você digitou Corretamente", Toast.LENGTH_SHORT).show();
        }
    }
}
