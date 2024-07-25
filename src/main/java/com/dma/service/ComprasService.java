package com.dma.service;

import com.dma.model.Compras;
import com.dma.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

/**
 * Servicio para manejar las operaciones CRUD de la entidad Compras.
 */
public class ComprasService implements IComprasService {

    private EntityManager em;

    /**
     * Constructor que inicializa el EntityManager utilizando JpaUtil.
     */
    public ComprasService() {
        em = JpaUtil.getEntityManager();
    }

    /**
     * Crea una nueva entidad Compras en la base de datos.
     *
     * @param compras la entidad Compras a persistir.
     */
    @Override
    public void crearCompras(Compras compras) {
        EntityTransaction transaction = em.getTransaction();

        try {
            // Inicia una transacción
            transaction.begin();

            // Persiste la entidad Compras
            em.persist(compras);

            // Confirma la transacción
            transaction.commit();
        } catch (Exception e) {
            // Si ocurre una excepción, realiza un rollback si la transacción está activa
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    /**
     * Lista todas las entidades Compras de la base de datos.
     *
     * @return una lista de entidades Compras.
     */
    @Override
    public List<Compras> listarCompras() {
        // Crea una consulta tipada para seleccionar todas las entidades Compras
        TypedQuery<Compras> query = em.createQuery("select c from Compras c", Compras.class);

        // Ejecuta la consulta y devuelve la lista de resultados
        return query.getResultList();
    }
}
