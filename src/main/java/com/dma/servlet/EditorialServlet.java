package com.dma.servlet;

import com.dma.model.Editorial;
import com.dma.services.EditorialService;
import com.dma.services.EditorialServicee;
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

    private EditorialServicee editorialService;

    public void init() throws ServletException {
        super.init();
        this.editorialService = new EditorialService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Editorial> editoriales = editorialService.listarEditoriales();
        req.setAttribute("editoriales", editoriales);
        req.getRequestDispatcher("/listar-editorial/listar-editorial.jsp").forward(req, resp);
    }


    private void crearEditorial(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=0
        String nombre = req.getParameter("nombre");
        String telefono = req.getParameter("telefono");
        String contacto = req.getParameter("contacto");
        String NITEditorial = req.getParameter("NITEditorial");

        Editorial editorial = new Editorial(0, nombre, telefono, contacto, NITEditorial);
        editorialService.crearEditorial(editorial);

        resp.sendRedirect(req.getContextPath() + "/editorial-servlet");                              
    }  
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
            if (pathInfo == null || pathInfo.equals("/")) {
                crearEditorial(req, resp);
            }
    }
    
            
    private void editarEditorial(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
            
}
