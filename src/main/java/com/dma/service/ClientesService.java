
package com.dma.service;

import com.dma.model.Clientes;
import java.util.List;
/**
 *
 * @author andre
 */
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
public class ClientesService implements IClientesService {
    
    /**
     * Se define el objeto de EntityManager
     */
    private EntityManager em;
    
    public ClientesService(){
        this.em = JpaUtil.getEntityManager();
    }

    /**
     * Se creo el metodo abstracto para manipular la transaccion que
     * sirve para añadir un cliente, 
     * el metodo espera recibir un objeto de tipo Clientes
     * llamado cliente
     * @param cliente 
     */
    @Override
    public void crearCliente(Clientes cliente) {
                EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

/**
 * Se creo el metodo abstarco para buscar un cliente en base a su id
 * @param idClientes
 * @return 
 */
    @Override
    public Clientes buscarClienteId(int idClientes) {
        return em.find(Clientes.class, idClientes);
    }

    /**
     * Se creo abstarco para listar los clientes que va a retornar 
     * un objeto de tipo TypedQuery
     * @return 
     */
    @Override
    public List<Clientes> listarCliente() {
        TypedQuery<Clientes> query = em.createQuery("SELECT c FROM Clientes c", Clientes.class);
        return query.getResultList();
    }

    /**
     * Se creo el metodo abstracto para editar el cliente, que fusiona los
     * atributos nuevos con los viejos con la funcion del objeto de EntityManager
     * merge
     * @param cliente 
     */
    @Override
    public void editarCliente(Clientes cliente) {
        em.merge(cliente);
    }

    /**
     * El metodo de eliminar primero usa el metodo de buscar para
     * encontrar al cliente que quiere eliminar y si encuentra el clinete
     * solo lo elimina
     * @param idClientes 
     */
    @Override
    public void eliminarCliente(int idClientes) {
        Clientes cliente = buscarClienteId(idClientes);
        if(cliente != null){
            em.remove(cliente);
        }
    }
    
}
