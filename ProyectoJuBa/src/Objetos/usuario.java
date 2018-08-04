/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.sql.Date;
//import java.util.Date;

/**
 *
 * @author julian
 */
public class usuario implements Serializable{
    
    private int id_usuario;
    private String cuenta;
    private String clave;
    private String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    private String direccion;
    private String telefono;
    private String celular;
    private String correo;
    private String sexo;
    private String tipo;
    private String cargo;
    private Date fecha_inicio;
    private String estado;
    //private int id_empresa;
    
    //constructor

    public usuario(int id, String cuenta, String clave, String nombres, String apellidos, String cedula, int edad, String direccion, String telefono, String celular, String correo,String sexo, String tipo, String cargo, Date fecha_inicio,String estado) {
        this.id_usuario = id;
        this.cuenta=cuenta;
        this.clave=clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.sexo=sexo;
        this.tipo = tipo;
        this.cargo = cargo;
        this.fecha_inicio=fecha_inicio; //AAAA-MM-DD
        this.estado=estado;
    }

    //constructor para ingresar en base de datos
    public usuario(String cuenta, String clave,String nombres, String apellidos, String cedula, int edad, String direccion, String telefono, String celular, String correo,String sexo, String tipo, String cargo, Date fecha_inicio,String estado) {
        this.cuenta=cuenta;
        this.clave=clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.sexo=sexo;
        this.tipo = tipo;
        this.cargo = cargo;
        this.fecha_inicio=fecha_inicio;
        this.estado=estado;
        //this.id_empresa = id_empresa;
    }
    
    //constructor vacio
    public usuario() {
    }
    
    //constructor para consultar a base de datos - Autenticacion

    public usuario(String cuenta, String clave) {
        this.cuenta = cuenta;
        this.clave = clave;
    }

    public usuario(String nombres, String apellidos, String sexo, String tipoU, String cargo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.tipo = tipoU;
        this.cargo = cargo;
    }
    
    
    //set
    public void setId(int id) {
        this.id_usuario = id;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*
    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }*/
    
    //getters

    public int getId() {
        return id_usuario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getClave() {
        return clave;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public String getEstado() {
        return estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
}
