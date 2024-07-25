package com.dma.servlet;

import com.dma.model.Autor;
import com.dma.service.AutorService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AutorServlet", value = {"/autor-servlet"})
@MultipartConfig
public class AutorServlet extends HttpServlet {

    private AutorService AutorService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.AutorService = new AutorService();
    }

    /*
    * listado de datos
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Autor> autor = AutorService.listarAutor();
        autor.forEach(a -> System.out.println(a));
        req.setAttribute("autor", autor);
        req.getRequestDispatcher("/listar-autor/listar-autor.jsp").forward(req, resp);
    }

    
    
    //Metodo de creacion u/o agregado
    private void crearAutor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        Autor autor = new Autor(nombre, apellido);
        AutorService.crearAutor(autor);

        resp.sendRedirect(req.getContextPath() + "/");
    }
    /*
    * Almacenamiento de creado datos
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/")) {
            crearAutor(req, resp);

        } else {
            resp.sendError(HttpServletResponse.SC_BAD_GATEWAY);
        }
    }

    
    
    
    //Metodo de actualizado o editado
    private void editarAutor(int idAutor, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Autor autor = AutorService.buscarAutor(idAutor);

        if (autor != null) {
            String nombre = req.getParameter("nombre");
            String apellido = req.getParameter("apellido");

            autor.setNombre(nombre);
            autor.setApellido(apellido);

            AutorService.editarAutor(autor);

            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
    /*
    * Almacenamiento de datos actualizados
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length == 2) {
                int idAutor = Integer.parseInt(pathParts[1]);
                editarAutor(idAutor, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_GATEWAY);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);

        }
    }

    
    
    //Metodo de eliminado
    private void eliminarAutor(int idAutor, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Autor autor = AutorService.buscarAutor(idAutor);
        if (autor != null) {
            AutorService.eliminarAutor(idAutor);
            resp.sendRedirect(req.getContextPath() + "/autor/");
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
    /*
    * eliminado de datos
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();

        if (pathInfo != null && !pathInfo.equals("/")) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length == 2) {
                int idAutor = Integer.parseInt(pathParts[1]);
                eliminarAutor(idAutor, req, resp);
            } else {
                resp.sendError(HttpServletResponse.SC_BAD_GATEWAY);
            }
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
