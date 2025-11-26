package com.janier.proyecto_base_de_datos;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.janier.proyecto_base_de_datos.model.ConexionBD;
import com.janier.proyecto_base_de_datos.model.Datos;
import com.janier.proyecto_base_de_datos.model.Manager;

public class MainActivity extends AppCompatActivity {
    //Importamos manager
    Manager manager;

    EditText edNombre, edApellido, edCorreo;
    Button btnInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNombre = findViewById(R.id.Nombre);
        edApellido = findViewById(R.id.Apellido);
        edCorreo = findViewById(R.id.Correo);
        btnInsert = findViewById(R.id.btnEnviar);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = new Manager(MainActivity.this);
                //PASAMOS LOS VALORES AL POJO

                String nombre = edNombre.getText().toString();
                String apellido = edApellido.getText().toString();
                String correo = edCorreo.getText().toString();

                Datos datos = new Datos(nombre, apellido, correo);
                //LLAMAMOS AL METODO INSERTAR
                long resul=manager.insertData(datos);
                if (resul>0) {
                    Toast.makeText(MainActivity.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Error al insertar datos", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}