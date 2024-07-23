package com.dma.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;
    private String nombre;
    private String sinopsis;
    private byte imagen;
    private double precio;
    private int existencias;
    private String autor;
    private String genero;
    private String idioma;
    private String editorial;

    public Libro(String autor, String editorial, int existencias, String genero, String idioma, int idLibro, byte imagen, String nombre, double precio, String sinopsis) {
        this.autor = autor;
        this.editorial = editorial;
        this.existencias = existencias;
        this.genero = genero;
        this.idioma = idioma;
        this.idLibro = idLibro;
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
        this.sinopsis = sinopsis;
    }

    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", idLibro=" + idLibro +
                ", nombre='" + nombre + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", imagen=" + imagen +
                ", precio=" + precio +
                ", existencias=" + existencias +
                ", genero='" + genero + '\'' +
                ", idioma='" + idioma + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
