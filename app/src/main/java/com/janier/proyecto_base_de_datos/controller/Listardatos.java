package com.janier.proyecto_base_de_datos.controller;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.janier.proyecto_base_de_datos.R;
import com.janier.proyecto_base_de_datos.model.Datos;
import com.janier.proyecto_base_de_datos.model.Manager;

public class Listardatos extends AppCompatActivity {
ListView listView;
ArrayAdapter<Datos> adapter;
    Manager manager;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listardatos);
        listView = findViewById(R.id.listDate);//Referencia a el listview
        manager = new Manager(Listardatos.this);
        manager.listarData();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, manager.listarData());
        listView.setAdapter(adapter);
    }
}