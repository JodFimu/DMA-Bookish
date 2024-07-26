package com.dma.servlet;

import com.dma.model.Editorial;
import com.dma.service.EditorialService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * DMA Corporation
 * Fecha de creacion: 21 de julio de 2024
 */

@WebServlet(name = "EditorialServlet", value = {"/editorial-servlet"})
@MultipartConfig
public class EditorialServlet extends HttpServlet {

    private EditorialService editorialService;
    
     /**
     * Método init se ejecuta al iniciar el servlet. Aquí se instancia el servicio de la Editorial.
     */

    public void init() throws ServletException {
        super.init();
        this.editorialService = new EditorialService();
    }

    /**
     * doGet recupera y muestra toda la informacion almacenada en el servidor
     */
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Editorial> editoriales = editorialService.listarEditoriales();
        req.setAttribute("Editorial", editoriales);
        req.getRequestDispatcher("/listar-editorial/listar-editorial.jsp").forward(req, resp);
    }
    
    /**
     * Crea una nueva editorial con los datos proporcionados en la solicitud.
     * @param req HttpServletRequest
     * @param resp HttpServletResponse
     * @throws ServletException 
     * @throws IOException 
     */


    private void crearEditorial(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=0;
        String nombre = req.getParameter("nombre");
        String telefono = req.getParameter("telefono");
        String contacto = req.getParameter("contacto");
        String NITEditorial = req.getParameter("NITEditorial");

        Editorial editorial = new Editorial(id, nombre, telefono, contacto, NITEditorial);
        editorialService.crearEditorial(editorial);

        resp.sendRedirect(req.getContextPath() + "/editorial-servlet");                              
    }  
    
    /**
     * doPost maneja la creacion de nuevas entidades, procesalos datos enviados por el cliente y los almacena en la base de datos
     */
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
            if (pathInfo == null || pathInfo.equals("/")) {
                crearEditorial(req, resp);
            }
    }
    
    /**
     * Edita los datos existentes y los reemplaza por los nuevos datos ingresados en el formulario
     * @param idEditorial ID de la editorial a editar.
     * @param req HttpServletRequest
     * @param resp HttpServletResponse
     * @throws ServletException 
     * @throws IOException 
     */
            
    private void editarEditorial(int idEditorial, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Editorial editorial = editorialService.buscarEditorial(idEditorial);

        if (editorial != null) {
            String nombre = req.getParameter("nombre");
            String telefono = req.getParameter("telefono");
            String contacto = req.getParameter("contacto");
            String NITEditorial = req.getParameter("NITEditorial");

            editorial.setNombre(nombre);
            editorial.setTelefono(telefono);
            editorial.setContacto(contacto);
            editorial.setNITEditorial(NITEditorial);

            editorialService.editarEditorial(editorial);
            resp.sendRedirect(req.getContextPath() + "/editorial-servlet");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }       
    
    /**
     * doPut maneja la actualizacion de los recursos en el servidor
     */
    
     @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathAttributes = pathInfo.split("/");
            if (pathAttributes.length == 2) {
                int idEditorial = Integer.parseInt(pathAttributes[1]);
                editarEditorial(idEditorial, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_GATEWAY);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_GATEWAY);
        }
    }
    
     /**
     * Elimina una editorial existente.
     * @param idEditorial ID de la editorial a eliminar.
     * @param req HttpServletRequest
     * @param resp HttpServletResponse
     * @throws ServletException 
     * @throws IOException 
     */
    
    
    private void eliminarEditorial(int idEditorial , HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Editorial editorial = editorialService.buscarEditorial(idEditorial);
        if (editorial != null) {
            editorialService.eliminarEditorial(idEditorial);
            resp.sendRedirect(req.getContextPath() + "/editorial-servlet");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
  
    /**
     * doDelete elimina una entidad con base a su ID
     */
    
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length == 2) {
                int idEditorial = Integer.parseInt(pathParts[1]);
                eliminarEditorial(idEditorial, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

            
}
