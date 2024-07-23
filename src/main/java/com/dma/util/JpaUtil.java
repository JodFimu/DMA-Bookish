package com.dma.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory em = buildEntityManagerFactory();


    private static EntityManagerFactory buildEntityManagerFactory() {
        try{

            return Persistence.createEntityManagerFactory("BookishDB");
        }catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }


    public static EntityManager getEntityManager() {
        return em.createEntityManager();
    }

    public static void close() {
        em.close();
    }

}
