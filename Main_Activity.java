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
    }
    public void telamapas(View view){

        Intent it_telamapas = new Intent(this, telamapas.class);

        startActivity(it_telamapas);

        //setContentView(R.layout.activity_main);
    }
}
