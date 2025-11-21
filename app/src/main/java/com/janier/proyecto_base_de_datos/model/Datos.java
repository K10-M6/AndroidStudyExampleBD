package com.janier.proyecto_base_de_datos.model;

public class Datos {
    private  String nombre;
    private  String apellido;
    private  String     correo;

    public Datos(String nom, String ape, String corr) {
        this.nombre = nom;
        this.apellido = ape;
        this.correo = corr;
    }
    //METODOS SET PARA DARLE VAOR A LAS VARIABLES

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCorreo(){
        return correo;
    }
}