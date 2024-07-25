package com.dma.service;

import com.dma.model.Compras;

import java.util.List;

/*
    Interface que define los servicios relacionados con las compras.F
*/

public interface IComprasService {

    /*
        Crea una nueva compra.
        @param compra Objeto de tipo Compras que contiene la información de la nueva compra.
    */
    public void crearCompras(Compras Compra);

    /*
        Lista todas las compras.
        @return Lista de objetos de tipo Compras que contiene todas las compras registradas.
    */
    public List<Compras> listarCompras();


}
