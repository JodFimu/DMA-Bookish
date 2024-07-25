/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dma.service;

import com.dma.model.Editorial;
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class EditorialService implements com.dma.services.IEditorialService {  // Implementa la interfaz EditorialServicee
    
    private EntityManager em;  // Gestor de entidades

    // Constructor que inicializa el EntityManager
    public EditorialService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public void crearEditorial(Editorial editorial) {
       EntityTransaction transaction = em.getTransaction();  // Inicia la transacción
       try {
           transaction.begin();  // Comienza la transacción
           em.persist(editorial);  // Persiste la entidad
           transaction.commit();  // Confirma la transacción
       } catch(Exception e) {
           if(transaction.isActive()) {
               transaction.rollback();  // Revierte la transacción en caso de error
           }
           e.printStackTrace();  // Imprime la traza del error
       }
    }

    @Override
    public List<Editorial> listarEditoriales() {
        TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e", Editorial.class);  // Crea la consulta
        return query.getResultList();  // Retorna la lista de resultados
    }

    @Override
    public Editorial buscarEditorial(int idEditorial) {
       return em.find(Editorial.class, idEditorial);  // Busca la entidad por ID
    }

    @Override
    public void editarEditorial(Editorial editorial) {
        EntityTransaction transaction = em.getTransaction();  // Inicia la transacción
        try {
            transaction.begin();  // Comienza la transacción
            em.merge(editorial);  // Actualiza la entidad
            transaction.commit();  // Confirma la transacción
        } catch(Exception e) {
            if(transaction.isActive()) {
                transaction.rollback();  // Revierte la transacción en caso de error
            }
            e.printStackTrace();  // Imprime la traza del error
        }
    }

    @Override
    public void eliminarEditorial(int idEditorial) {
        Editorial editorial = buscarEditorial(idEditorial);  // Busca la entidad por ID
        if(editorial != null) {
            EntityTransaction transaction = em.getTransaction();  // Inicia la transacción
            try {
                transaction.begin();  // Comienza la transacción
                em.remove(editorial);  // Elimina la entidad
                transaction.commit();  // Confirma la transacción
            } catch(Exception e) {
                if(transaction.isActive()) {
                    transaction.rollback();  // Revierte la transacción en caso de error
                }
                e.printStackTrace();  // Imprime la traza del error
            }
        }
    }
}
