/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Indica que esta clase es una entidad que se mapeará a una tabla en la base de datos
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    private String nombre;
    private String telefono;
    private String contacto;
    private String NITEditorial;
 // Constructor que inicializa todos los campos de la entidad
    public Editorial(int idEditorial, String nombre, String telefono, String contacto, String NITEditorial) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contacto = contacto;
        this.NITEditorial = NITEditorial;
    }
 // Constructor vacío necesario para ciertas operaciones de JPA
    public Editorial() {
    }
// Métodos getter y setter para acceder y modificar el valor de los atributos.
    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNITEditorial() {
        return NITEditorial;
    }

    public void setNITEditorial(String NITEditorial) {
        this.NITEditorial = NITEditorial;
    }
}
