package com.dma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClientes;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
     private String telefonoCliente;
      private String correoCliente;

    public Clientes() {
    }

    public Clientes(int idClientes, String nombreCliente, String apellidoCliente) {
        this.idClientes = idClientes;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    public Clientes(String direccionCliente, String telefonoCliente, String correoCliente) {
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idClientes=" + idClientes + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + ", correoCliente=" + correoCliente + '}';
    }
      
      
             
}
