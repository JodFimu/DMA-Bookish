package com.dma.service;

import com.dma.model.Libro;
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class LibroService implements ILibroService {

    private EntityManager em;

    public LibroService() {
        em = JpaUtil.getEntityManager();
    }

    @Override
    public void crearLibro(Libro libro) {
        EntityTransaction transaction = em.getTransaction();

        try{

            transaction.begin();

            em.persist(libro);
            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.getRollbackOnly();
            }
            e.printStackTrace();

        }
    }

    @Override
    public void eliminarLibro(int idLibro) {
        Libro libro = buscarLibro(idLibro);
        if(libro!=null){
            em.remove(libro);
        }
    }

    @Override
    public Libro buscarLibro(int idLibro) {
        return em.find(Libro.class, idLibro);
    }

    @Override
    public void editarLibro(Libro libro) {
        em.merge(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);
        return query.getResultList();
    }
}
