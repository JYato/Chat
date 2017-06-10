package com.jasonapps.chat_app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class chat extends AppCompatActivity  implements View.OnClickListener {
    TextView titulo;
    TextView cajax;
    Button boton;
    EditText agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        boton = (Button) findViewById(R.id.enviar);
        boton.setOnClickListener(this);
        cajax = (TextView) findViewById(R.id.caja);
        agregar = (EditText) findViewById(R.id.entrada);
        Intent intent = getIntent();
        Bundle helps = intent.getExtras();
        titulo = (TextView) findViewById(R.id.titulo);
        if(helps != null){
            String dato = helps.getString("nombre");
            titulo.setText(dato);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.enviar :
                String mas = agregar.getText().toString();
                String fin = cajax + "" + mas;
                cajax.setText(fin);
        }
    }
}
