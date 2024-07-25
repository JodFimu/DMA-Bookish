
package com.dma.servlet;

import com.dma.model.Clientes;
import com.dma.service.ClientesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author andre
 */
@WebServlet(name = "ClientesServlet", value = {"/clientes-servlet"})
@MultipartConfig
public class ClientesServlet extends HttpServlet{
    
    private ClientesService clientesService;
    
    @Override
    public void init() throws ServletException {
        super.init();
        this.clientesService = new ClientesService();
    }
    
    /*
    Metodo http que funciona para listar a los clientes
    */
        @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Clientes> cliente = clientesService.listarCliente();
        cliente.forEach(c -> System.out.println(c));
        req.setAttribute("Clientes", cliente);
        req.getRequestDispatcher("/listar-clientes/listar-clientes.jsp").forward(req, resp);
    }
    
    /*
    Metodo para setear un nuevo cliente
    */
    private void crearCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nitClientes = request.getParameter("NITClientes");
        String nombre = request.getParameter("nombreCliente");
        String apellido = request.getParameter("apellidoCliente");
        String direccion = request.getParameter("direccionCliente");
        String telefono = request.getParameter("telefonoCliente");
        String correo = request.getParameter("correoCliente");

        Clientes cliente = new Clientes(nitClientes,nombre, apellido, correo, telefono, direccion);
        clientesService.crearCliente(cliente);

        response.sendRedirect(request.getContextPath() + "/clientes-servlet");
    }
    
    /*
    Metodo http que llama al metodo crear cliente cuando path info es nulo o la ruta es /.
    Termina de crear un cliente
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        if (pathInfo == null || pathInfo.equals("/")) {
            crearCliente(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    private void editarCliente(int idCliente, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Clientes cliente = clientesService.buscarClienteId(idCliente);
        if (cliente != null) {
        String nitClientes = req.getParameter("NITClientes");
        String nombre = req.getParameter("nombreCliente");
        String apellido = req.getParameter("apellidoCliente");
        String direccion = req.getParameter("direccionCliente");
        String telefono = req.getParameter("telefonoCliente");
        String correo = req.getParameter("correoCliente");

            cliente.setNITClientes(nitClientes);
            cliente.setNombreCliente(nombre);
            cliente.setApellidoCliente(apellido);
            cliente.setDireccionCliente(direccion);
            cliente.setTelefonoCliente(telefono);
            cliente.setCorreoCliente(correo);

            clientesService.editarCliente(cliente);

            resp.sendRedirect(req.getContextPath() + "/clientes/");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
    
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length == 2) {
                int idCliente = Integer.parseInt(pathParts[1]);
                editarCliente(idCliente, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
        private void eliminarCliente(int idCliente, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Clientes cliente = clientesService.buscarClienteId(idCliente);
        if (cliente != null) {
            clientesService.eliminarCliente(idCliente);
            resp.sendRedirect(req.getContextPath() + "/productos/");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
        
            @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length == 2) {
                int idCliente = Integer.parseInt(pathParts[1]);
                eliminarCliente(idCliente, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
