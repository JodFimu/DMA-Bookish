package com.dma.service;

import com.dma.model.Autor;
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;
/*
 *
 * @author javier
 */

public class AutorService implements IAutorService{

    //Se crea un EntityManager para manejar las operaciones de persistencia o SQL.
    private EntityManager em;

    /*
     * inicialización del EntityManager
     */
    public AutorService() {
        this.em = JpaUtil.getEntityManager();
    }


    /*
     * Metodo abstracto de transaccion para crear 
     *  objeto entidad
     */
    @Override
    public void crearAutor(Autor autor) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(autor);
            transaction.commit();
        }catch (Exception e){
            if(transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /*
     * Metodo abstracto para listar autores retornando objeto TypedQuery
     */
    @Override
    public List<Autor> listarAutor() {
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a", Autor.class);
        return query.getResultList();
    }

    /*
     * Metodo abstracto para busqueda de autor retornando objeto
     * con id como parametro
     */
    @Override
    public Autor buscarAutor(int idAutor) {
        return em.find(Autor.class, idAutor);
    }

    /*
     * Metodo abstracto para actualizacion de datos del autor en base
     * a la union del objeto EM
     */
    @Override
    public void editarAutor(Autor autor) {
        em.merge(autor);
    }
    
    /*
     * Metodo abstracto para eliminacion de objeto autor
     * con id como parametro
     */
    @Override
    public void eliminarAutor(int idAutor){
        Autor autor = buscarAutor(idAutor);
        if(autor != null){
            em.remove(autor);
        }
    }

}
