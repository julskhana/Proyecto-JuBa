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
public class empresa implements Serializable{
    
    private int id_empresa;
    private String nombre;
    private String ruc;
    private String direccion;
    private String direccion_planta;
    private String telefono;
    private String correo;
    private int id_usuario;
    
    //constructor
    public empresa(int id_empresa, String nombre, String ruc, String direccion, String direccion_planta, String telefono, String correo, int id_usuario) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.direccion_planta = direccion_planta;
        this.telefono = telefono;
        this.correo = correo;
        this.id_usuario=id_usuario;
    }
    
    //constructor para cargar empresas despues de autenticacion

    public empresa(int id_empresa, String nombre, int id_usuario) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.id_usuario = id_usuario;
    }
    
    //constructor para ingresar en base de datos
    public empresa(String nombre, String ruc, String direccion, String direccion_planta, String telefono, String correo, int id_usuario) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.direccion_planta = direccion_planta;
        this.telefono = telefono;
        this.correo = correo;
        this.id_usuario=id_usuario;
    }
    
    //constructor vacio
    public empresa() {
    }
    
    //set    
    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDireccion_planta(String direccion_planta) {
        this.direccion_planta = direccion_planta;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    //get

    public int getId_empresa() {
        return id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDireccion_planta() {
        return direccion_planta;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
}
