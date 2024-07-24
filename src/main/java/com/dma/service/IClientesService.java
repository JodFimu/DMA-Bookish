/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dma.service;

import java.util.List;
import com.dma.model.Clientes;

public interface IClientesService {

//para crear o agregar clientes
public void crearCliente(Clientes cliente);

//para buscar clientes por su id    
    public Clientes buscarClienteId(int idClientes);

// para listar clientes
    public List<Clientes> listarCliente();

// para editar clientes
    public void editarCliente(Clientes cliente);

//    para eliminar clientes por id
    public void eliminarCliente(int idClientes);    
}
