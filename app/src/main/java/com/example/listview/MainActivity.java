package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;
    List<String> androidVersionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lista = findViewById(R.id.listView);

        //cargar la lista
        androidVersionList = new ArrayList<>();
        androidVersionList.add("Lunes");
        androidVersionList.add("Martes");
        androidVersionList.add("Miercoles");
        androidVersionList.add("Jueves");
        androidVersionList.add("Viernes");
        androidVersionList.add("Sabado");
        androidVersionList.add("Domnigo");


        ArrayAdapter adaptadorVersionesAndroid = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                androidVersionList
        );

        //Vinculación listView - adapter
        lista.setAdapter(adaptadorVersionesAndroid);

        //asignando gestión de evento click en la lista
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String androidVersion = androidVersionList.get(position);
        //mostrando mesnsaje por cada onItemClick
        Toast.makeText(MainActivity.this,"Evento onIteClick ListView",Toast.LENGTH_LONG).show();



    }
}
