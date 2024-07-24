package com.dma.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutor;
    private String nombre;
    private String apellido;

    public Autor() {
    }

    public Autor(String apellido, int idAutor, String nombre) {
        this.apellido = apellido;
        this.idAutor = idAutor;
        this.nombre = nombre;
    }

    public Autor(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "apellido='" + apellido + '\'' +
                ", idAutor=" + idAutor +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

