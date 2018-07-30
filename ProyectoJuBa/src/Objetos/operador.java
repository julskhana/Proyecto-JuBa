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
public class operador implements Serializable{
    
    private int id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String tipo;
    
    //constructor

    public operador(int id, String nombre, String cedula, String telefono, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    
    //constructor vaio

    public operador() {
    }
    
    //constructor para ingresar en base de datos

    public operador(String nombre, String cedula, String telefono, String tipo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    
    //set

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //get

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }
    
}
