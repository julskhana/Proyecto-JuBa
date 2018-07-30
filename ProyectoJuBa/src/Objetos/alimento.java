/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author julian
 */
public class alimento implements Serializable{

    private int id;
    private String nombre;
    private String descripcion;
    private String tipo;
    private float masa_total;
    private Date fecha_expiracion;

    //constructor;
    public alimento(int id, String nombre, String descripcion, String tipo, float masa_total, Date fecha_expiracion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.masa_total = masa_total;
        this.fecha_expiracion = fecha_expiracion;
    }
    
    //cosntructor vacio

    public alimento() {
    }
    
    //constructor para ingresar en base de datos

    public alimento(String nombre, String descripcion, String tipo, float masa_total, Date fecha_expiracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.masa_total = masa_total;
        this.fecha_expiracion = fecha_expiracion;
    }
    
    //set

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMasa_total(float masa_total) {
        this.masa_total = masa_total;
    }

    public void setFecha_expiracion(Date fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }
    
    //get

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public float getMasa_total() {
        return masa_total;
    }

    public Date getFecha_expiracion() {
        return fecha_expiracion;
    }
    
    
}
