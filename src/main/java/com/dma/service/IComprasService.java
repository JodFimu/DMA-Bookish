package com.dma.service;

import com.dma.model.Compras;

import java.util.List;

public interface IComprasService {
    public void agregarComnpra(Compras Compra);

    public List<Compras> listarCompras();

}
