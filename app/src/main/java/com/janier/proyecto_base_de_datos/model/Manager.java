package com.janier.proyecto_base_de_datos.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager {

    //declaramos variables para llamar la conexion

    private ConexionBD conexionBD;
    private SQLiteDatabase db;
    public Manager(Context context){
        //llamo la conexión
        conexionBD = new ConexionBD(context);
    }
    public void openBD(){
        //abre la base de datos modo escritura
        db= conexionBD.getWritableDatabase();

    }
    public void openBdRd(){
        //abre la base de datos modo lectura
        db= conexionBD.getReadableDatabase();
    }
}
