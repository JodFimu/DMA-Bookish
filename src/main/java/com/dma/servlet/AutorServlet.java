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


@WebServlet (name = "AutorServlet" , value = {"/autor-servlet"})
@MultipartConfig
public class AutorServlet extends HttpServlet {
    private AutorService AutorService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.AutorService = new AutorService();
    }

    /*
    * por cada accion(listar,buscar,agregar,eliminar) dos metodos(http)
    * Los metodos http una peticion(requerimiento) y una respuesta(parametros)
    */


    /*
    * Se manda a llamar la Arraylist de autor
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Autor> autor = AutorService.listarAutor();
        autor.forEach(a -> System.out.println(a));
        req.setAttribute("autor", autor);
        req.getRequestDispatcher("/listar-autor/listar-autor.jsp").forward(req, resp);
    }

    private void crearAutor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        Autor libro = new Autor(nombre, apellido);
        AutorService.crearAutor(new Autor());
    }
}