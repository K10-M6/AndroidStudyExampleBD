package com.janier.proyecto_base_de_datos;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.janier.proyecto_base_de_datos.model.ConexionBD;

public class MainActivity extends AppCompatActivity {
    ConexionBD conexionBD;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexionBD = new ConexionBD(MainActivity.this);
        db = conexionBD.getWritableDatabase();
        Toast.makeText(this, "Base de datos Creada", Toast.LENGTH_SHORT).show();
    }
}