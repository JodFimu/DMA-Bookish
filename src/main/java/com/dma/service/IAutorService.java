package com.dma.service;
import com.dma.model.Autor;
import java.util.List;

public interface IAutorService {

    public void crearAutor(Autor autor);

    public List<Autor> listarAutor();

    public Autor buscarAutor(int idAutor);

    public void editarAutor(Autor autor);
}
