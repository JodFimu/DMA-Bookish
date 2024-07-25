/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dma.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;
import com.dma.model.Factura;
import com.dma.util.JpaUtil;
/**
 *
 * @author 2020269
 */
public class FacturaService implements IFacturaService{
     
    private EntityManager em;
    
    public FacturaService() {
        this.em = JpaUtil.getEntityManager();
    }
    
        @Override
    public void crearFactura(Factura factura) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(factura);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    @Override
    public Factura buscarFacturaId(int numeroFactura) {
        return em.find(Factura.class, numeroFactura);
    }

    @Override
    public List<Factura> listarFactura() {
        TypedQuery<Factura> query = em.createQuery("SELECT p FROM Factura p", Factura.class);
        return query.getResultList();
    }

    @Override
    public void editarFactura(Factura factura) {
        em.merge(factura);
    }

    @Override
    public void eliminarFactura(int numeroFactura) {
        Factura factura = buscarFacturaId(numeroFactura);
        if (factura != null) {
            em.remove(factura);
        }
    }
}
