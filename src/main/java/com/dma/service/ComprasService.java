package com.dma.service;

import com.dma.model.Libro;
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ComprasService implements IcComprasService {

    private EntityManager em;

    public ComprasService(){em = JpaUtil.getEntityManager();}

    @Override
    public void crearCompras(Compras compras) {
        EntityTransaction transaction = em.getTransaction();

        try{

            transaction.begin();

            em.persist(compras);
            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.getRollbackOnly();
            }
            e.printStackTrace();

        }
    }
    @Override
    public List<Libro> listarCompras() {
        TypedQuery<Libro> query = em.createQuery("select c from Compras c", Compras.class);
        return query.getResultList();
    }
}
