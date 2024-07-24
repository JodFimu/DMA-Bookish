package com.dma.model;

public class Libro {
    private int idAutor;
    private String nombre;
    private String apellido;

    public Libro() {
    }

    public Libro(int idAutor, String nombre, String apellido) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //CONSTRUCTOR LLENO 2 SIN ID
    public Libro(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }//CONSTRUCTOR LLENO 2 SIN ID
    

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Libro{" + "idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" 
                + apellido + '}';
        
    }
    
    
    
    
}
