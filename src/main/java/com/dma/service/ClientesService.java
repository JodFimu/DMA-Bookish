
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
    
    private EntityManager em;
    
    private ClientesService(){
        this.em = JpaUtil.getEntityManager();
    }

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


    @Override
    public Clientes buscarClienteId(int idClientes) {
        return em.find(Clientes.class, idClientes);
    }

    @Override
    public List<Clientes> listarCliente() {
        TypedQuery<Clientes> query = em.createQuery("SELECT p FROM Clientes p", Clientes.class);
        return query.getResultList();
    }

    @Override
    public void editarCliente(Clientes cliente) {
        em.merge(cliente);
    }

    @Override
    public void eliminarCliente(int idClientes) {
        Clientes cliente = buscarClienteId(idClientes);
        if(cliente != null){
            em.remove(cliente);
        }
    }
    
}
