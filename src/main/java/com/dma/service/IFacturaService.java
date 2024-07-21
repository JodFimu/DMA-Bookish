/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dma.service;
import java.util.List;
import com.dma.model.Factura;
/**
 *
 * @author 2020269
 */

// Se crea el IService de la clase Factura para el crear el Service de la misma entidad. 
public interface IFacturaService {
    
    public void crearFactura(Factura factura);
    
    public Factura buscarFacturaId(int numeroFactura);
    
    public List<Factura> listarFactura();
    
    public void editarFactura(Factura factura);
    
    public void eliminarFactura(int numeroFactura);
}
