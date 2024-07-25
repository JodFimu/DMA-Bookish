/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dma.services;

import com.dma.model.Editorial;
import java.util.List;

/**
 * Interface para definir los servicios relacionados con Editorial
 * Provee métodos para crear, listar, buscar, editar y eliminar editoriales.
 * 
 * Autor: informatica
 */
public interface EditorialServicee {
    
    /**
     * Crea una nueva editorial
     * @param editorial La editorial a crear
     */
    public void crearEditorial(Editorial editorial);
    
    /**
     * Lista todas las editoriales
     * @return Lista de editoriales
     */
    public List<Editorial> listarEditoriales();
    
    /**
     * Busca una editorial por su ID
     * @param idEditorial El ID de la editorial a buscar
     * @return La editorial encontrada o null si no existe
     */
    public Editorial buscarEditorial(int idEditorial);
    
    /**
     * Edita una editorial existente
     * @param editorial La editorial con los nuevos datos
     */
    public void editarEditorial(Editorial editorial);
    
    /**
     * Elimina una editorial por su ID
     * @param idEditorial El ID de la editorial a eliminar
     */
    public void eliminarEditorial(int idEditorial);
}
