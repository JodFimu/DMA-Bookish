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

    private EntityManager em;

    /*
     * Se define el objeto de EntityManager
     */
    public AutorService() {this.em = JpaUtil.getEntityManager();}


    /*
     * Se creo el metodo abstracto para manipular la transaccion que
     * sirve para añadir un autor el metodo espera recibir un objeto de tipo Autor
     * llamado autor @param autor
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
     * Se creo abstracto para listar los autores que va a retornar
     * un objeto de tipo TypedQuery
     * @return
     */
    @Override
    public List<Autor> listarAutor() {
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a", Autor.class);
        return query.getResultList();
    }

    /*
     * Se creo el metodo abstarco para buscar un autor en base a su id
     * @param idAutor
     *  @return
     */
    @Override
    public Autor buscarAutor(int idAutor) {
        return em.find(Autor.class, idAutor);
    }

    /*
     * Se creo el metodo abstracto para editar el autor, que fusiona los
     * atributos nuevos con los viejos con la funcion del objeto de EntityManager
     * @param autor
     */
    @Override
    public void editarAutor(Autor autor) {
        em.merge(autor);
    }

    @Override
    public void eliminarAutor(int idAutor){
        Autor autor = buscarAutor(idAutor);
        if(autor != null){
            em.remove(autor);
        }
    }

}
