/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dma.service;

import java.util.List;
import com.dma.model.Clientes;

public interface IClientesService {

public void crearCliente(Clientes cliente);
    
    public Clientes buscarClienteId(int idClientes);
    
    public List<Clientes> listarCliente();
    
    public void editarCliente(Clientes cliente);
    
    public void eliminarCliente(int idClientes);    
}
