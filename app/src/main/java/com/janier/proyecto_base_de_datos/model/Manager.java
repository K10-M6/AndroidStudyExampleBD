package com.janier.proyecto_base_de_datos.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

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
    public void closeBd(){
    //cierra la base de datos
        db.close();
    }
    public long insertData(Datos datos){
        openBdRd();
        ContentValues values = new ContentValues();
        values.put("nombre", datos.getNombre());
        values.put("apellido", datos.getApellido());
        values.put("correo", datos.getCorreo());
        long id = db.insert("tablaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", null, values);
        return id;
    }
    public ArrayList<Datos> listarData(){
        openBD();
        ArrayList<Datos> lista = new ArrayList<>();

        String sql ="SELECT * FROM tablaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Cursor cursor = db.rawQuery(Constantes.sql, null);
        if (cursor.moveToFirst()){
            do {
                Datos datos = new Datos();
                datos.setNombre(cursor.getString(0));
                datos.setApellido(cursor.getString(1));
                datos.setCorreo(cursor.getString(2));
                lista.add(datos);
            } while (cursor.moveToNext());
        }
        return lista;
    }

}