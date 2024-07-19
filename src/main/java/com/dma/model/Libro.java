package com.dma.model;

import jakarta.persistence.*;

import java.sql.Blob;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;
    private String nombre;
    private String sinopsis;
    private Double precio;
    private int existencias;
    private String autor;
    private String genero;
    private String idioma;
    private String editorial;

    @Lob
    private Blob imagen;

    public Libro() {
    }

    public Libro(int idLibro, String nombre, String sinopsis, Blob imagen, Double precio, int existencias,
                 String autor, String genero, String idioma, String editorial) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
        this.precio = precio;
        this.existencias = existencias;
        this.autor = autor;
        this.genero = genero;
        this.idioma = idioma;
        this.editorial = editorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


}
