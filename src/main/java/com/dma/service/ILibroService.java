package com.dma.service;

import com.dma.model.Libro;

import java.util.List;

public interface ILibroService {
    public void crearLibro(Libro libro);

    public void eliminarLibro(int idLibro);

    public Libro buscarLibro(int idLibro);

    public void editarLibro(Libro pajaro);

    public List<Libro> listarLibros();
}
