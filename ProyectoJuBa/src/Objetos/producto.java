/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

/**
 *
 * @author julian
 */
public class producto implements Serializable{
    
    private int id_producto;
    private String nombre;
    private String nombre_cientifico;
    private int peso_ideal;
    
    //constructor

    public producto(int id_producto, String nombre, String nombre_cientifico, int peso_ideal) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.nombre_cientifico = nombre_cientifico;
        this.peso_ideal = peso_ideal;
    }
    
    //constructor para ingresar en base de datos

    public producto(String nombre, String nombre_cientifico, int peso_ideal) {
        this.nombre = nombre;
        this.nombre_cientifico = nombre_cientifico;
        this.peso_ideal = peso_ideal;
    }
    
    //set

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    public void setPeso_ideal(int peso_ideal) {
        this.peso_ideal = peso_ideal;
    }
    
    //get

    public int getId_producto() {
        return id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public int getPeso_ideal() {
        return peso_ideal;
    }
    
}
