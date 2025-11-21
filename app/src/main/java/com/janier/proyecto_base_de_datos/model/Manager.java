package com.janier.proyecto_base_de_datos.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager {

    //declaramos variables para llamar la conexion

    private ConexionBD conexionBD;
    private SQLiteDatabase db;
    public Manager(Context context){
        conexionBD = new ConexionBD(context);
    }
}
