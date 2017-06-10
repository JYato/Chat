package com.jasonapps.chat_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import static com.jasonapps.chat_app.R.*;
import static com.jasonapps.chat_app.R.id.parent;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    String[] personas = new String[] {"Oscar","Andre","Alejandro","Favaro","Brandon","Jason"};
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listaview);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,personas);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mint = new Intent(getApplicationContext(),chat.class);
                mint.putExtra("nombre",personas[position]);
                startActivity(mint);
                ///switch (position){
                  //  case 0 :
                   //     startActivity(mint);
                   //     break;
                  //  case 1 :
                   //     startActivity(mint);
                   //     break;
                  //  case 2 :
                   //     startActivity(mint);
                   //     break;
                   // case 3 :
                  //      startActivity(mint);
                   //     break;
                   // case 4 :
                   //     startActivity(mint);
                   //     break;
                   // case 5 :
                     //   startActivity(mint);
                     //   break;
                }

            }
        })

    }
}
