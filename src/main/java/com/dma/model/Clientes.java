package com.dma.model;

// importaciones de persistencia de jakarta
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
// atributos de la base de datos
    private int idClientes;
    private String NITClientes;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private String correoCliente;

      //costructor vacio
    public Clientes() {
    }

    public Clientes(String NITClientes,String nombreCliente, String apellidoCliente, String correoCliente, String telefonoCliente, String direccionCliente) {
        this.NITClientes = NITClientes;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
    }

    //constructor lleno con atributos principales de la entidad clientes
    public Clientes(int idClientes, String nombreCliente, String apellidoCliente) {
        this.idClientes = idClientes;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    // constructor lleno con atributos complementarios de la entidad clientes
    public Clientes(String direccionCliente, String telefonoCliente, String correoCliente) {
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    //getter y setter de cada atributo
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

    public String getNITClientes() {
        return NITClientes;
    }

    public void setNITClientes(String NITClientes) {
        this.NITClientes = NITClientes;
    }

    // sobre escritura del metodo
    @Override
    public String toString() {
        return "Clientes{" + "idClientes=" + idClientes + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + ", correoCliente=" + correoCliente + '}';
    }
      
      
             
}
