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
public class piscina implements Serializable{
    
    private int id_piscina;
    private String descripcion;
    private String ubicacion;
    private float logitud_ancho;
    private float longitud_largo;
    private float area;
    private String tipo;
    private String forma;
    private int poblacion;
    private int id_empresa;
    private int id_producto;
    
    //constructor

    public piscina(int id_piscina, String descripcion, String ubicacion, float logitud_ancho, float longitud_largo, float area, String tipo, String forma, int poblacion, int id_empresa, int id_producto) {
        this.id_piscina = id_piscina;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.logitud_ancho = logitud_ancho;
        this.longitud_largo = longitud_largo;
        this.area = area;
        this.tipo = tipo;
        this.forma = forma;
        this.poblacion = poblacion;
        this.id_empresa = id_empresa;
        this.id_producto = id_producto;
    }
    
    //constructor para ingresar en base de datos

    public piscina(String descripcion, String ubicacion, float logitud_ancho, float longitud_largo, float area, String tipo, String forma, int poblacion, int id_empresa, int id_producto) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.logitud_ancho = logitud_ancho;
        this.longitud_largo = longitud_largo;
        this.area = area;
        this.tipo = tipo;
        this.forma = forma;
        this.poblacion = poblacion;
        this.id_empresa = id_empresa;
        this.id_producto = id_producto;
    }
    
    //constructor vacio

    public piscina() {
    }
    
    //set

    public void setId_piscina(int id_piscina) {
        this.id_piscina = id_piscina;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setLogitud_ancho(float logitud_ancho) {
        this.logitud_ancho = logitud_ancho;
    }

    public void setLongitud_largo(float longitud_largo) {
        this.longitud_largo = longitud_largo;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
    //get

    public int getId_piscina() {
        return id_piscina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public float getLogitud_ancho() {
        return logitud_ancho;
    }

    public float getLongitud_largo() {
        return longitud_largo;
    }

    public float getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public String getForma() {
        return forma;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public int getId_producto() {
        return id_producto;
    }
    
}
