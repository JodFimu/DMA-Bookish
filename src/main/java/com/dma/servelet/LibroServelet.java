package com.dma.servelet;

import com.dma.model.Libro;
import com.dma.service.LibroService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Blob;
import java.util.List;

@WebServlet(name = "LibroServelet", value = {"/libro-servelet"})
@MultipartConfig
public class LibroServelet extends HttpServlet {
    private LibroService libroService = new LibroService();

    @Override
    public void init() throws ServletException {
        super.init();

        this.libroService = new LibroService();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Libro> pajaros = libroService.listarLibros();
        pajaros.forEach(p -> System.out.println(p));
        request.setAttribute("pajaros", pajaros);
        request.getRequestDispatcher("/listar-libro/listar-libro.jsp").forward(request, response);
    }

    private void crearLibro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idLibro = 0;
        String nombre = request.getParameter("color");
        String sinopsis = request.getParameter("sinopsis");
        Blob imagen = Blob.class.cast(request.getParameter("imagen"));
        double precio = Double.parseDouble(request.getParameter("precio"));
        int existencias = Integer.parseInt(request.getParameter("existencias"));
        String autor= request.getParameter("autor");
        String genero = request.getParameter("genero");
        String idioma=request.getParameter("idioma");
        String editorial=request.getParameter("editorial");

        Libro libro = new Libro(idLibro,nombre,sinopsis,imagen,precio,existencias,autor,genero,idioma,editorial);
        libroService.crearLibro(libro);

        response.sendRedirect(request.getContextPath() + "/listar-libro");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        if(pathInfo==null || pathInfo.equals("/")){
            crearLibro(request, response);
        }else {
            response.sendError(HttpServletResponse.SC_BAD_GATEWAY);

        }

    }


}
